package s4.B183312; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID. 
import java.lang.*;
import s4.specification.*;

/*
interface FrequencerInterface {     // This interface provides the design for frequency counter.
    void setTarget(byte[]  target); // set the data to search.
    void setSpace(byte[]  space);  // set the data to be searched target from.
    int frequency(); //It return -1, when TARGET is not set or TARGET's length is zero
                    //Otherwise, it return 0, when SPACE is not set or Space's length is zero
                    //Otherwise, get the frequency of TAGET in SPACE
    int subByteFrequency(int start, int end);
    // get the frequency of subByte of taget, i.e target[start], taget[start+1], ... , target[end-1].
    // For the incorrect value of START or END, the behavior is undefined.
}
*/

/*
package s4.specification;
public interface InformationEstimatorInterface{
    void setTarget(byte target[]); // set the data for computing the information quantities
    void setSpace(byte space[]); // set data for sample space to computer probability
    double estimation(); // It returns 0.0 when the target is not set or Target's length is zero;
// It returns Double.MAX_VALUE, when the true value is infinite, or space is not set.
// The behavior is undefined, if the true value is finete but larger than Double.MAX_VALUE.
// Note that this happens only when the space is unreasonably large. We will encounter other problem anyway.
// Otherwise, estimation of information quantity, 
}                        
*/


public class TestCase {
    public static void main(String[] args) {
    //original part
	/*try { //出現回数が正しいかテスト
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("checking s4.B183312.Frequencer");
	    myObject = new s4.B183312.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}*/
    try { //出現回数が正しいかテスト1(H)
        FrequencerInterface  myObject;
        int freq;
        System.out.println("CASE1 : checking Frequencer(出現回数カウント)");
        myObject = new s4.B183312.Frequencer();
        myObject.setSpace("AAAA".getBytes());
        myObject.setTarget("AA".getBytes());
        freq = myObject.frequency();
        System.out.println("\"AA\" in \"AAAA\" appears "+freq+" times.");
        if(3 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
    }
    catch(Exception e) {
        e.printStackTrace();
        System.out.println("Exception occurred: STOP");
    }
    try { //出現回数が正しいかテスト2(H)
        FrequencerInterface  myObject;
        int freq;
        System.out.println("CASE2 : checking Frequencer(出現回数カウント)");
        myObject = new s4.B183312.Frequencer();
        myObject.setSpace("Hoge Hoge Fuga".getBytes());
        myObject.setTarget("o".getBytes());
        freq = myObject.frequency();
        System.out.println("\"o\" in \"Hoge Hoge Fuga\" appears "+freq+" times.");
        if(2 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
    }
    catch(Exception e) {
        e.printStackTrace();
        System.out.println("Exception occurred: STOP");
    }
    try { //Spaceのlengthが0のときの挙動(B)
        FrequencerInterface  myObject;
        int freq;
        System.out.println("CASE3 : checking Frequencer(Spaceのlengthが0)");
        myObject = new s4.B183312.Frequencer();
        myObject.setSpace("".getBytes());
        myObject.setTarget("AA".getBytes());
        freq = myObject.frequency();
        if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
    }
    catch(Exception e) {
        e.printStackTrace();
        System.out.println("Exception occurred: STOP");
    }
    try { //Targetのlengthが0のときの挙動(B)
        FrequencerInterface  myObject;
        int freq;
        System.out.println("CASE4 : checking Frequencer(Targetのlengthが0)");
        myObject = new s4.B183312.Frequencer();
        myObject.setSpace("AAAA".getBytes());
        myObject.setTarget("".getBytes());
        freq = myObject.frequency();
        if(-1 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
    }
    catch(Exception e) {
        e.printStackTrace();
        System.out.println("Exception occurred: STOP");
    }
    try { //Spaceをセットしないときの挙動(B)
        FrequencerInterface  myObject;
        int freq;
        System.out.println("CASE5 : checking Frequencer(Spaceをセットしない時)");
        myObject = new s4.B183312.Frequencer();
        //myObject.setSpace("".getBytes());
        myObject.setTarget("AA".getBytes());
        freq = myObject.frequency();
        if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
    }
    catch(Exception e) {
        e.printStackTrace();
        System.out.println("Exception occurred: STOP");
    }
    try { //Targetをセットしないときの挙動(B)
        FrequencerInterface  myObject;
        int freq;
        System.out.println("CASE6 : checking Frequencer(Targetをセットしない時)");
        myObject = new s4.B183312.Frequencer();
        myObject.setSpace("AAAA".getBytes());
        //myObject.setTarget("".getBytes());
        freq = myObject.frequency();
        if(-1 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
    }
    catch(Exception e) {
        e.printStackTrace();
        System.out.println("Exception occurred: STOP");
    }

    }
}
