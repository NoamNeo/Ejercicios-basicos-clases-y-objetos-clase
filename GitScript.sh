#!/bin/bash
if [ -z "$1" ]; then
  echo "Usage: $0 <var_ejercicio>"
  exit 1
fi
VAR_EJERCICIO="$1"
git add .
git commit -am "Terminamos el ejercicio $VAR_EJERCICIO"
