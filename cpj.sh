#!/bin/bash

if [[ $# -ne 1 ]]; then
    echo "Usage: $0 <template_file> <new_file>"
    exit 1
fi

template_file="/Users/sauravjaiswal/Documents/InterviewPrep/Template/Template.java"
new_file=$1

class_name=$(basename "$new_file" .java)

# Check if the template file exists
if [[ ! -f "$template_file" ]]; then
    echo "Error: Template file '$template_file' not found."
    exit 1
fi
#sed "s/ public class  / public class $class_name /" "$template_file" > "$new_file"

sed "s/public class[[:space:]]*$/public class $class_name/" "$template_file" > "$new_file"
