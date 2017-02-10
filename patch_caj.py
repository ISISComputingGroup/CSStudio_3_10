import zipfile
import os
import shutil

name = "com/cosylab/epics/caj/impl/handlers/SearchResponse.class"
p2_dir = "CSStudio_P2_3_3_10/plugins/"
jar_name = "org.csstudio.platform.libs.epics"

patched = os.path.join(os.getcwd(),"caj_and_jca/com.cosylab.epics.caj/target/com.cosylab.epics.caj-1.1.14-SNAPSHOT.jar")
print "Patch file", patched

jar_path = ""

for f in os.listdir(os.path.join(os.getcwd(), p2_dir)):
    if f.startswith(jar_name):
        jar_path = os.path.join(os.getcwd(), p2_dir, f)
        break    

print "jar file path", jar_path

# Extract the patch
with zipfile.ZipFile(patched, "r") as z:
    z.extract(name, os.getcwd())

# Add it to the zip
print "Running:", '"c:\\Program Files\\7-Zip\\7z.exe" a ' + jar_path + ' com\\cosylab\\epics\\caj\\impl\\handlers\\SearchResponse.class'
os.system('"c:\\Program Files\\7-Zip\\7z.exe" a ' + jar_path + ' com\\cosylab\\epics\\caj\\impl\\handlers\\SearchResponse.class')
