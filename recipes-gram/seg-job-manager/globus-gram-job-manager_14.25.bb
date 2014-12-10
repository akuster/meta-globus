DESCRIPTION = "Globus Toolkit - GRAM Jobmanage"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-rsl globus-gass-transfer globus-gass-server-ez globus-gram-client globus-scheduler-event-generator globus-gram-protocol"

LIC_FILES_CHKSUM = "file://globus_gram_job_manager.c;beginline=2;endline=3;md5=972528b09ae61cfb097f6547addfbcf9"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "f68b6338d894a279fd25f6edc3952cf0"
SRC_URI[archive.sha256sum] = "664ed9fb101f5369924bd66b60d62394ef41ef9ef9639838aa9d7d940957c3cf"
RC_URI[dpatch.md5sum] = "1b17403bf3b04ec1df0cc04ead4a62a4"
SRC_URI[dpatch.sha256sum] = "bf87b3c99168bf47d2bd0b8234f1860cbf1c899025c260e3b16c7e6c44afd617"


S = "${WORKDIR}/globus_gram_job_manager-${PV}"

inherit autotools pkgconfig

#FILES_${PN} += "${libdir}/perl/*"
FILES_${PN} += "${datadir}/globus/globus_gram_job_manager/*"

RDEPENDS_${PN} = "globus-usage globus-gram-job-manager-callout-error globus-gass-cache"
