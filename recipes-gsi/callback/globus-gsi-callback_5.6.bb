DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-gsi-sysconfig globus-gsi-cert-utils"

LIC_FILES_CHKSUM = "file://library/globus_gsi_callback.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "b1f754211b793fc6ad608595fde12823"
SRC_URI[archive.sha256sum] = "23930fa06c7f869fb259b3d9482ac164924465f0536789ef95980d892b25dc3e"
SRC_URI[dpatch.md5sum] = "fe7c0e1375380e18f88e4efd0ee62f7f"
SRC_URI[dpatch.sha256sum] = "5dc6b3fc0315ebcd102ff3f40af8f66fad509a92b9a40b6aafbeccd9b976d764"

S = "${WORKDIR}/globus_gsi_callback-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gsi-cert-utils globus-gsi-sysconfig"
