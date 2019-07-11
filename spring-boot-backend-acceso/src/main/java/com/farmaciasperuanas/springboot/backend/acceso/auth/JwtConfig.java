package com.farmaciasperuanas.springboot.backend.acceso.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA="alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVATE="-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAyUpv6a6ns9HJYEq8j6T33U+h1URdEmNfyMq+hp/dG62Qy32q\r\n" + 
			"vnZTr9TwDtUOXGvtcrKlh5v3q4nLFDjJCjupNL2m2VNKQ8E8yMHFbDP8G7V1a9Br\r\n" + 
			"zHYGLITccuOUfNGNCkLbA9MO7HhWFwxpmwHc3aiU9viLpwP/w0hN5BqlkHgioNOz\r\n" + 
			"fc4E7GG+EA1iSdolB+cC81RbsCy2H6cQLVHRY2+S1VckSU9WuLyLEDVFEtqKMcka\r\n" + 
			"mrzqsQtEFf6maPSJtpbRlWaYVrQ/Pxdci5VolUf36eJCAgvMHz+r1+jSpH7OYpvR\r\n" + 
			"yYg7glVjOKwcHPfaXpf6Lx0T6WcTydL/GD7u7wIDAQABAoIBAAJZgRbsN/7sWvpp\r\n" + 
			"xOu0VERcEpqHssJtMIgKfdDaet1A2GjXra+NeAqcZLT3nbRMejgVh8MeefShpiI1\r\n" + 
			"S3t4GNCJyjHNPBewYMJDKMfLj4zPQHCivS9kzUulvWEF8QzH8WqGP0I7K3htKywX\r\n" + 
			"s//gNLDNr/d2DUNE06524JniCb628vlRMW2AuNV1COxH7MuSEEXLpT9dhs4yf12Q\r\n" + 
			"Ch8VnfQd+Z9MKvV1TF8VOld6sm9EkEB+GKcPMpxH0gjHcCly4LePw084t7b/5C+N\r\n" + 
			"n+OABIPcED+BxBzpyMxwOMC1lwsz8eJ/SEPBGJlEolWQHizRsE/CXQ83YJeOd8GH\r\n" + 
			"L1ewSLECgYEA8T/lEcHu/whZQbiUj/+tVCNGr4lah3kHsjqFjFKb/8BXoaZmifJY\r\n" + 
			"Epr94AFuhCTi3ZzqLrwj/A3Ydk7xEXdUgOlEIcMCZw6nkXFkBoowzfMsyt8D0z+X\r\n" + 
			"WTnwIuHCGVwK7bfS5hyvSQ0lBwcF6ZaIq23HI7FCg34UlXNuAF3eMtcCgYEA1ZkY\r\n" + 
			"jBWBNgTfMp12dBcFtyxESQlXIvLGyvxrk4p76dH3kbg2dPwxN0Wze6MCWTPocP8r\r\n" + 
			"gWbYn9ZBFodQMe2YneeZVtAKMgucgyfIRTtRMJffkuq9GIeXrrjL9RLQzcPwVaS0\r\n" + 
			"llRhsmtoCyUdwG8OGAkExI/HOBilYTminLh+uakCgYAZxnPY89lvEhtHNEtbHzwL\r\n" + 
			"k0FIG+q6Mqop1qrSFTlpl8lFEhw+fNAAHOMm/cArCi3a85rpp1xI38nSyhhjf1Zd\r\n" + 
			"94459TXagOxSU8UWFcmlF2gfvLgR5+dptxD7CRfN0dGxGETGJSZtLaRZHdz52gV8\r\n" + 
			"G1x9acDrf5r/ZLfJ/j1xPQKBgHOVjPsBCBK7QCybmOXpL2aXxbvgGg8HYRumzG/i\r\n" + 
			"mHtG67km/hEAB4Hpbd6Rr0umEzpSWrCDfuW/gyk1v+fEsrmAAjJAEcRTFDbE6FLO\r\n" + 
			"bnjlNk7CR+FmPmaGCZhsviEazosJvc87ikKKbJrbUuY3MmE/QB090IhCjfu2vJAi\r\n" + 
			"JjFBAoGBAIos4wgXxCQnR+F2CvmFErmt7oGp1Zt6Te+29X3TBf7yAKcX8gSFZWGw\r\n" + 
			"0PhKog7pitDHHikHDUiIQ0ErbFcr6uuKPXX/IacbBBSS6xRc1yBpanqdKvMn0ZWv\r\n" + 
			"CDVaNy7+ivhTckZ6Nn4k9ChCwvNQfmNvvxRBYeJcGR8j3e/ZhjcZ\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyUpv6a6ns9HJYEq8j6T3\r\n" + 
			"3U+h1URdEmNfyMq+hp/dG62Qy32qvnZTr9TwDtUOXGvtcrKlh5v3q4nLFDjJCjup\r\n" + 
			"NL2m2VNKQ8E8yMHFbDP8G7V1a9BrzHYGLITccuOUfNGNCkLbA9MO7HhWFwxpmwHc\r\n" + 
			"3aiU9viLpwP/w0hN5BqlkHgioNOzfc4E7GG+EA1iSdolB+cC81RbsCy2H6cQLVHR\r\n" + 
			"Y2+S1VckSU9WuLyLEDVFEtqKMckamrzqsQtEFf6maPSJtpbRlWaYVrQ/Pxdci5Vo\r\n" + 
			"lUf36eJCAgvMHz+r1+jSpH7OYpvRyYg7glVjOKwcHPfaXpf6Lx0T6WcTydL/GD7u\r\n" + 
			"7wIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
