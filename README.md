# StarterDroid
A repo to start writing Android code with unit tests!

If you would like to run the tests in this repo, just type in your terminal 
* `cd StartDroid`
* `./gradlew test --continue`

You can view the output of the tests @ `/StarterDroid/app/build/reports/tests/debug/index.html`

## For adding unit test support to your own project

1) Add the following to dependencies:  
<pre> 
    testCompile 'junit:junit:4.12'
    testCompile "org.mockito:mockito-core:1.9.5"
</pre>

2) Create a /test/java/... package to place your tests, matching your /src/main directory

3) Open the ‘build Variants’ at the test location and change it to ‘unit test’

4) Run the following command line  `./gradlew test --continue`

5) Look at the reports @ `/<ROOTDIRECTORY>/app/build/reports/tests/<APPFLAVOR>/index.html`
