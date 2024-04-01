#!/usr/bin/env perl

my $name = $ARGV[0] || 'John Doe';
my $time = `date --iso-8601=minutes`;

print "Hello $name, from a Perl script. Now it's ${time}";
