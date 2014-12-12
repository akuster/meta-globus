DESCRIPTION = "Globus Toolkit - Globus GRAM Jobmanager Callout Errors Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-common"

LIC_FILES_CHKSUM = "file://globus_i_gram_jobmanager_callout_error.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "93726512c3173a3648dc2d280866a65b"
SRC_URI[archive.sha256sum] = "d167a8bae69186a8c8d7ff68a877aa51e1f15db24f7b3b2430da6172ddcb652e"
SRC_URI[dpatch.md5sum] = "64baf3e200b114858b486d43bc6bfa04"
SRC_URI[dpatch.sha256sum] = "7f39ec8cd5fdc145293dc00088f97228e0607ea66ddbd384eee06ed84a84294b"

S = "${WORKDIR}/globus_gram_job_manager_callout_error-${PV}"

inherit autotools pkgconfig

#FILES_${PN} += "${libdir}/perl/*"

#RDEPENDS_${PN} = "perl"
