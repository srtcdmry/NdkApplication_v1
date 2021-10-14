//
// Created by sertac.demiray on 13/10/2021.
//
#include <string>
#include <stdio.h>
#include <jni.h>

using namespace std;

extern "C" JNIEXPORT jstring JNICALL  // dönüş tipi jstring(native primitive type)
Java_com_info_ndkapplication_1v1_MainActivity_stringNdk(JNIEnv *env, jobject thiz) {
    // TODO: implement stringNdk()
    string message = "DgPaysDemo";
    return env->NewStringUTF(message.c_str());
}



