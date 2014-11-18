Skeleton project for illustrating the issue disussed at https://groups.google.com/d/topic/adt-dev/htdVz4gFN9w/discussion

To see the issue, un-comment the lines as per instructions in the following files:

  1. anno-api/src/main/java ==> io.github.curioustechizen.anno.api.AwesomeActivity.java
  2. app/src/main/java ==> io.github.curioustechizen.anno.sample.SampleActivity.java


The objective is to create an annotation processor that "knows" about the Android API. For example, I wish to validate in my annotation processor that a particular class is a sub-class of `android.app.Activity`.
Currently, as described in the adt-dev group discussion, I cannot get this to compile. First, I tried adding android.jar to the libs folder of both anno-api and anno-processor. Then, I tried making both of those as Android Library projects. In either case, the anno-processor refuses to compile, complaining about missing classes related to annotation processing.

Environment:

  - Fedora 20 64-bit
  - Android Studio 0.8.14 beta
  - gradle 2.1
  - gradle plugin 0.13.2