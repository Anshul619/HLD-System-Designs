
# IP Address Ranges

| Rule                                              | IP version | Example                     | Remarks                                                  |
|---------------------------------------------------|------------|-----------------------------|----------------------------------------------------------|
| All traffic                                       | IPv4       | 0.0.0.0/0                   | Standard default address range used to route all traffic. |
| A single IPv4 address                             | IPv4       | 203.0.113.1/32              | You must use the /32 prefix length.                      |
| A range of IPv4 addresses, in CIDR block notation | IPv4       | 203.0.113.0/24              | 203.0.113.0 to 203.0.113.255 IP address.                 |
| A single IPv6 address                             | IPv6       | 2001:db8:1234:1a00::123/128 | You must use the /128 prefix length.                     |
| A range of IPv6 addresses, in CIDR block notation | IPv6       | 2001:db8:1234:1a00::/64     |                                                          |
