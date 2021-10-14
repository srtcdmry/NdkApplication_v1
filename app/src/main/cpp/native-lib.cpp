#include <jni.h>
#include <string>
using namespace std;

extern "C" JNIEXPORT jstring JNICALL
Java_com_info_ndkapplication_1v1_MainActivity_stringFromJNI(JNIEnv* env,jobject /* this */) {

    string hello = "Merhaba Dünya";
    return env->NewStringUTF(hello.c_str());
}