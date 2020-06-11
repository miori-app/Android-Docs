#include <jni.h>
#include <opencv2/opencv.hpp>


extern "C"
JNIEXPORT void JNICALL
Java_com_appprogramming_opencvproject_MainActivity_imageprocessing(JNIEnv *env, jobject thiz,
                                                                   jlong input_image,
                                                                   jlong output_image, jint th1,
                                                                   jint th2) {


    cv::Mat &img_input = *(cv::Mat *) input_image; //여기 수정함


    cv::Mat &img_output = *(cv::Mat *) output_image;



    cvtColor( img_input, img_output, cv::COLOR_RGB2GRAY);


    blur( img_output, img_output, cv::Size(5,5) );

    Canny( img_output, img_output, th1, th2);
    // TODO: implement imageprocessing()
}