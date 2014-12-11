DESCRIPTION = "Globus Toolkit - GridFTP Client Library"
HOMEPAGE = "http://toolkit.globus.org/toolkit"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-io"

LIC_FILES_CHKSUM = "file://globus_ftp_client.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "53db193826a1db683785092bb89a0755"
SRC_URI[archive.sha256sum] = "5d8f4d51004b89f82207fe877a04fcccd20e909a03f7bec85e208d679cf263c5"
SRC_URI[dpatch.md5sum] = "cfc10e282c467bdd3792bbdd03c34cd4"
SRC_URI[dpatch.sha256sum] = "c46d7b9b426903a57eda168ad832306a3c2fb1e52dac91edf670540807483aa6"

S = "${WORKDIR}/globus_ftp_client-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-ftp-control"
