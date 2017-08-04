# CSStudio_3_3

A copy of the CS-Studio branch 3.3.x with the required build scripts to get it to build for IBEX.
This code was the last version of CS-Studio 3 and was released as 3.3.11.

We may subsequently patch this version with our own fixes or fixes from CS-Studio 4.

There is a build script for our custom version of CAJ 1.1.14 that allows loopback to be used.
The change is in com\cosylab\epics\caj\impl\handlers\SearchResponse.java

## Steps

Build CAJ (and JCA but that doesn't matter):

* Run build_caj_and_jca.bat - this creates a local P2 site with a CAJ in it.
* Use 7-zip to extract com\cosylab\epics\caj\impl\handlers\SearchResponse.class to somewhere (location is at the end of the build you just did)

Build CS-Studio:

* Run build_maven_osgi.bat
* Run build_thirdparty.bat
* Run build_core.bat
* Run build_apps.bat

This should create a P2 site for CS-Studio, but with the wrong version of CAJ in org.csstudio.platform.libs.epics_x.x.x.xxxxxxxxxxxx.jar

Insert correct CAJ:

* From the P2 site locate org.csstudio.platform.libs.epics_x.x.x.xxxxxxxxxxxx.jar in the plugins directory
* Unzip it into another directory using 7-zip
* Replace com\cosylab\epics\caj\impl\handlers\SearchResponse.class with the one from earlier
* Use 7-zip to re-zip the files up into a .zip file with the same name as the jar (not a .7z file!)
* Rename to .jar
* Copy it back into the P2 site

Correct the md5 checksum:

* Download http://www.winmd5.com/
* Obtain the md5 checksum of the modified .jar
* Open the artifacts.xml file in the P2 directory for editing using 7-zip
* Locate `id='org.csstudio.platform.libs.epics'` and change the `download.md5` to the new value and save it

Deploy:

* Copy to Shadow to make the P2 site visible in the target platform in Eclipse.

Note: sometimes one needs to do a clean checkout of the code otherwise Maven complains about files being the same version but different. Need to find out why at some point.


