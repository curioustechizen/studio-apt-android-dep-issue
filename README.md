Skeleton project for illustrating the issue disussed at https://groups.google.com/d/topic/adt-dev/htdVz4gFN9w/discussion

The objective is to create an annotation processor that "knows" about the Android API. For example, I wish to validate in my annotation processor that a particular class is a sub-class of `android.app.Activity`.

To see the issue, un-comment the lines as per instructions in the following files:

  1. anno-api/src/main/java ==> io.github.curioustechizen.anno.api.AwesomeActivity.java
  2. app/src/main/java ==> io.github.curioustechizen.anno.sample.SampleActivity.java

This will obviously not compile because anno-api is not aware of `android.app.Activity`. Next, try one of the following:

  - Add android.jar to libs/ folder of anno-api
  - Convert anno-api into an Android Library project

You can now import `android.app.Activity` but compilation of anno-processor fails.


Environment:

  - Fedora 20 64-bit
  - Android Studio 0.8.14 beta
  - gradle 2.1
  - gradle plugin 0.13.2