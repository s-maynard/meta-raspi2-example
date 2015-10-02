#!/bin/bash

PID=$(pidof matchbox-keyboard)

if [ $PID -gt 0 ]; then
    killall matchbox-keyboard
else
    matchbox-keyboard&
fi
