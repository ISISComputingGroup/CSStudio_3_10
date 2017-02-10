# CSStudio_3_10

A copy of CS-Studio 3.3.10 with the required build scripts to get it to build for IBEX.
This was the last release of CS-Studio version 3.

There is a build script for our custom version of CAJ 1.1.14 that allows loopback to be used.
To build:

* Run build_caj_and_jca.bat
* Run build_maven_osgi.bat
* Run build_thirdparty.bat
* Run build_core.bat
* Run build_apps.bat
* Run deploy_repo.bat (BuildServer only)

Finally, copy to Shadow to make the P2 site visible in the target platform in Eclipse.


