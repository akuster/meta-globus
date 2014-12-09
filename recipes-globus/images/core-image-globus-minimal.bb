DESCRIPTION = "Minimal image with Globus Toolkit support"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

IMAGE_INSTALL = "\
    ${CORE_IMAGE_BASE_INSTALL} \
    bash \
    packagegroup-core-boot \
    packagegroup-globus \
    "

inherit core-image
