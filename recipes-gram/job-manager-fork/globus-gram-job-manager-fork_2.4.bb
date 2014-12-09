DESCRIPTION = "Globus Toolkit - GRAM Protocol Library"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-scheduler-event-generator globus-gram-protocol"

LIC_FILES_CHKSUM = "file://starter/fork_starter.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "1960538b87dabe01be7febf4e0281a53"
SRC_URI[archive.sha256sum] = "954f982067e4fee4c79c675f862cfdfab089e62f42578da7307899791357bc7a"
SRC_URI[dpatch.md5sum] = "89fab691b86df40261ad37d449207ed9"
SRC_URI[dpatch.sha256sum] = "5230ddf1e702e48e0a6853052a3c450e6725c872d02ff4c9aa04136a0f9e7446"

S = "${WORKDIR}/globus_gram_job_manager_fork-${PV}"

inherit autotools pkgconfig

FILES_${PN} += "${libdir}/perl/*"

RDEPENDS_${PN} = "perl"
