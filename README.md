# StarterDroid
A  repo to start writing Android code with unit tests!

1) Add the following to dependencies:  

<pre> 
    testCompile 'junit:junit:4.12'
    testCompile "org.mockito:mockito-core:1.9.5"
</pre>

2) Create a /test/java/... package to place your tests, matching your /src/main directory

3) Open the ‘build Variants’ at the test location and change it to ‘unit test’

4) Run the following command line  `./gradlew test --continue`

5) To make all the tests pass, change the 21 in the test to 20

6) Look at the reports @ `/StarterDroid/app/build/reports/tests/debug/index.html`
