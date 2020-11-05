# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "The dsr_example2 Python package"
AUTHOR = "Doosan Robotics <ros.robotics@doosan.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TODO-License-declaration"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=782925c2d55d09052e1842a0b4886802"

ROS_CN = "doosan-robot2"
ROS_BPN = "dsr_example2_py"

ROS_BUILD_DEPENDS = " \
    dsr-control2 \
    dsr-msgs2 \
    rclpy \
"

ROS_BUILDTOOL_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ament_python-native} \
"

ROS_EXPORT_DEPENDS = " \
    dsr-control2 \
    dsr-msgs2 \
    rclpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dsr-control2 \
    dsr-msgs2 \
    rclpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/doosan-robotics/doosan-robot2-release/archive/release/foxy/dsr_example2_py/0.1.1-4.tar.gz
ROS_BRANCH ?= "branch=release/foxy/dsr_example2_py"
SRC_URI = "git://github.com/doosan-robotics/doosan-robot2-release;${ROS_BRANCH};protocol=https"
SRCREV = "c3e27db94f21fbe5cafbb0e9734a932426903d83"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
