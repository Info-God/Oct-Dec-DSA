#!/bin/bash

# Go to your repository
cd "D:/OctPrep/DSA/Learning" || exit 1

# Add all changes
git add .

# Check whether there is anything to commit
if git diff --cached --quiet; then
    echo "No changes to commit."
    exit 0
fi

# Create today's commit
git commit -m "Daily practice - $(date '+%Y-%m-%d')"

# Push to GitHub
git push origin main

echo "Daily practice pushed successfully!"