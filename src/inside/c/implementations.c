#include "Main.h"
#include <stdio.h>


void Java_Main_nativeCall(JNIEnv * environment, jclass klass)
{
  puts("inside native call");
}
