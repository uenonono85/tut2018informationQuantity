($1 != ""){
    name = $1;
    printf("rm -rf ../%s\n", name);
    printf("mkdir ../%s\n", name);
    printf("sed s/s4.buggy/s4.%s/ <../buggy/Makefile > ../%s/Makefile\n", name, name);
    printf("sed s/s4.buggy/s4.%s/ <../buggy/Hello.java > ../%s/Hello.java\n", name, name);
    printf("sed s/s4.buggy/s4.%s/ <../buggy/Frequencer.java > ../%s/Frequencer.java\n", name, name);
    printf("sed s/s4.buggy/s4.%s/ <../buggy/InformationEstimator.java > ../%s/InformationEstimator.java\n", name, name);
    printf("sed s/s4.buggy/s4.%s/ <../buggy/TestCase.java > ../%s/TestCase.java\n", name, name);
}
