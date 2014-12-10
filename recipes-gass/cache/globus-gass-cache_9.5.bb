DESCRIPTION = "Globus Toolkit - Globus Gass Cache Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-common openssl libgcrypt"

LIC_FILES_CHKSUM = "file://globus_gass_cache.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "26e3e5e697cf454b58a9dd606e8e8a8a"
SRC_URI[archive.sha256sum] = "cdaf9b42cba3192adbff38df1c268d527eed9385afd18ae258c2b46152959536"
SRC_URI[dpatch.md5sum] = "ea3d7485df3f720ffcbd2be5ffb8fa37"
SRC_URI[dpatch.sha256sum] = "39208e3d65e28f5a56a0fc2a743311b9c6d86823c80155e1995af069adcd3ace"

S = "${WORKDIR}/globus_gass_cache-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "libssl libcrypto"
