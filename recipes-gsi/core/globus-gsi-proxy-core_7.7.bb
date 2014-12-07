DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://library/globus_gsi_proxy.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "0046a1f48c98e47f6a6937733bde8a26"
SRC_URI[archive.sha256sum] = "0a90e3ae1ed4cfab01682d25725efd29bb200cefd9dd62fc1f04969fe440f6a3"
SRC_URI[dpatch.md5sum] = "078f3cab97a054ae17de46b5f4f996cf"
SRC_URI[dpatch.sha256sum] = "caaba6175e8cffe4a51aebdc91c4361758b87e68eb5d9458957ed3693d4b3285"

S = "${WORKDIR}/globus_gsi_proxy_core-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gsi-credential globus-gsi-sysconfig globus-gsi-cert-utils globus-gsi-callback"
