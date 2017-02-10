import zipfile
import os

# Unzip both the patched version and the real version
patched = "\\caj_and_jca\com.cosylab.epics.caj\target\com.cosylab.epics.caj-1.1.14-SNAPSHOT.jar"

with zipfile.ZipFile(os.path.join(os.getcwd(), patched), "r") as z:
    z.extractall(".\\caj_and_jca\\")