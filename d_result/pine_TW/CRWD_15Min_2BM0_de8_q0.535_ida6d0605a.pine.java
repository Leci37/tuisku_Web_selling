//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: CRWD_15Min_2BM0_a6d0605a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2BM0_a6d0605a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_a6d0605a(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= 0.058691 )
		if( Raw_Money_Flow <= 849555 )
			if( Typical_Price <= 91.3693 )
				if( bearPower <= -0.2389 )
					if( MFI <= 39.2761 )
						if( bbp <= -0.769245 )
							if( Positive_Money_Flow <= 413477 )
								if( Raw_Money_Flow <= 114312 )
									ret := -0.101124
								if( Raw_Money_Flow > 114312 )
									ret := 0.324022
							if( Positive_Money_Flow > 413477 )
								if( Money_Flow_Ratio <= 0.290633 )
									ret := -0.454545
								if( Money_Flow_Ratio > 0.290633 )
									ret := -1.000000 // sell
						if( bbp > -0.769245 )
							if( Negative_Money_Flow_Sum <= 6.28636e+07 )
								if( Positive_Money_Flow_Sum <= 639203 )
									ret := 0.168067
								if( Positive_Money_Flow_Sum > 639203 )
									ret := 0.515152
							if( Negative_Money_Flow_Sum > 6.28636e+07 )
								if( Positive_Money_Flow <= 11779.4 )
									ret := 0.268293
								if( Positive_Money_Flow > 11779.4 )
									ret := -0.292683
					if( MFI > 39.2761 )
						if( Positive_Money_Flow <= 300.241 )
							if( Typical_Price <= 84.247 )
								if( MFI <= 60.1246 )
									ret := 0.612245
								if( MFI > 60.1246 )
									ret := 0.316742
							if( Typical_Price > 84.247 )
								if( Negative_Money_Flow_Sum <= 2.74623e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.74623e+07 )
									ret := 0.818182 // buy
						if( Positive_Money_Flow > 300.241 )
							if( Typical_Price <= 58.0817 )
								if( Raw_Money_Flow <= 145079 )
									ret := -0.428571
								if( Raw_Money_Flow > 145079 )
									ret := 0.307692
							if( Typical_Price > 58.0817 )
								if( Raw_Money_Flow <= 22310.9 )
									ret := 0.933333 // buy
								if( Raw_Money_Flow > 22310.9 )
									ret := 0.416667
				if( bearPower > -0.2389 )
					if( bbm <= 6.4e-05 )
						if( Money_Flow_Ratio <= 0.630981 )
							if( bearPower <= -0.145466 )
								if( bearPower <= -0.160179 )
									ret := 0.192308
								if( bearPower > -0.160179 )
									ret := 0.818182 // buy
							if( bearPower > -0.145466 )
								if( Typical_Price <= 62.68 )
									ret := -0.269231
								if( Typical_Price > 62.68 )
									ret := 0.159091
						if( Money_Flow_Ratio > 0.630981 )
							if( Typical_Price <= 68.1774 )
								if( Positive_Money_Flow_Sum <= 2.15661e+07 )
									ret := 0.657143
								if( Positive_Money_Flow_Sum > 2.15661e+07 )
									ret := 0.145038
							if( Typical_Price > 68.1774 )
								if( Negative_Money_Flow <= 24956.2 )
									ret := 0.973684 // buy
								if( Negative_Money_Flow > 24956.2 )
									ret := 0.375000
					if( bbm > 6.4e-05 )
						if( Positive_Money_Flow_Sum <= 1.72272e+07 )
							if( Raw_Money_Flow <= 85802.1 )
								if( MFI_Low <= 17.6784 )
									ret := -0.187970
								if( MFI_Low > 17.6784 )
									ret := 0.626866
							if( Raw_Money_Flow > 85802.1 )
								if( Money_Flow_Ratio <= 0.676243 )
									ret := -0.595506
								if( Money_Flow_Ratio > 0.676243 )
									ret := -0.207547
						if( Positive_Money_Flow_Sum > 1.72272e+07 )
							if( MFI_High <= -47.4794 )
								if( MFI <= 27.6439 )
									ret := -0.166667
								if( MFI > 27.6439 )
									ret := -0.888889 // sell
							if( MFI_High > -47.4794 )
								if( Positive_Money_Flow_Sum <= 3.12781e+07 )
									ret := 0.630769
								if( Positive_Money_Flow_Sum > 3.12781e+07 )
									ret := 0.024691
			if( Typical_Price > 91.3693 )
				if( Negative_Money_Flow_Sum <= 3.63594e+06 )
					if( Negative_Money_Flow_Sum <= 3.54384e+06 )
						if( MFI_Low <= 18.0257 )
							if( Negative_Money_Flow_Sum <= 721708 )
								if( Negative_Money_Flow_Sum <= 565304 )
									ret := 0.176471
								if( Negative_Money_Flow_Sum > 565304 )
									ret := -0.826087 // sell
							if( Negative_Money_Flow_Sum > 721708 )
								if( Raw_Money_Flow <= 96406.7 )
									ret := -0.237537
								if( Raw_Money_Flow > 96406.7 )
									ret := 0.087943
						if( MFI_Low > 18.0257 )
							if( Positive_Money_Flow_Sum <= 1.53697e+06 )
								if( Money_Flow_Ratio <= 3.02431 )
									ret := 0.217009
								if( Money_Flow_Ratio > 3.02431 )
									ret := -0.551724
							if( Positive_Money_Flow_Sum > 1.53697e+06 )
								if( bullPower <= -0.542611 )
									ret := 0.140044
								if( bullPower > -0.542611 )
									ret := -0.009653
					if( Negative_Money_Flow_Sum > 3.54384e+06 )
						if( bbp <= -1.17192 )
							ret := -0.333333
						if( bbp > -1.17192 )
							ret := -0.857143 // sell
				if( Negative_Money_Flow_Sum > 3.63594e+06 )
					if( Negative_Money_Flow <= 4443.13 )
						if( Negative_Money_Flow <= 3699.33 )
							if( Positive_Money_Flow_Sum <= 1.47395e+07 )
								if( Positive_Money_Flow <= 235507 )
									ret := -0.203297
								if( Positive_Money_Flow > 235507 )
									ret := 0.060185
							if( Positive_Money_Flow_Sum > 1.47395e+07 )
								if( bearPower <= -0.464699 )
									ret := 0.000000
								if( bearPower > -0.464699 )
									ret := 0.120944
						if( Negative_Money_Flow > 3699.33 )
							ret := -0.888889 // sell
					if( Negative_Money_Flow > 4443.13 )
						if( MFI_High <= -79.6557 )
							if( Negative_Money_Flow <= 243277 )
								if( Negative_Money_Flow_Sum <= 2.61752e+08 )
									ret := 0.254545
								if( Negative_Money_Flow_Sum > 2.61752e+08 )
									ret := -0.829787 // sell
							if( Negative_Money_Flow > 243277 )
								ret := 0.416667
						if( MFI_High > -79.6557 )
							if( Negative_Money_Flow <= 57675.5 )
								if( Money_Flow_Ratio <= 0.273975 )
									ret := 0.449438
								if( Money_Flow_Ratio > 0.273975 )
									ret := 0.263371
							if( Negative_Money_Flow > 57675.5 )
								if( Negative_Money_Flow_Sum <= 4.87901e+06 )
									ret := 0.508696
								if( Negative_Money_Flow_Sum > 4.87901e+06 )
									ret := 0.155445
		if( Raw_Money_Flow > 849555 )
			if( Negative_Money_Flow <= 2.15275e+07 )
				if( Typical_Price <= 150.45 )
					if( MFI_Low <= 5.51485 )
						if( bbm <= 1.52512 )
							if( MFI <= 17.14 )
								if( Positive_Money_Flow_Sum <= 3.87193e+07 )
									ret := 0.035909
								if( Positive_Money_Flow_Sum > 3.87193e+07 )
									ret := -0.536232
							if( MFI > 17.14 )
								if( MFI <= 20.489 )
									ret := 0.413483
								if( MFI > 20.489 )
									ret := 0.139175
						if( bbm > 1.52512 )
							if( Negative_Money_Flow <= 1.72001e+07 )
								if( MFI_High <= -56.9526 )
									ret := 0.233480
								if( MFI_High > -56.9526 )
									ret := 0.939394 // buy
							if( Negative_Money_Flow > 1.72001e+07 )
								if( Raw_Money_Flow <= 2.09087e+07 )
									ret := 0.909091 // buy
								if( Raw_Money_Flow > 2.09087e+07 )
									ret := 0.333333
					if( MFI_Low > 5.51485 )
						if( MFI <= 91.2651 )
							if( bbm <= 0.731393 )
								if( Positive_Money_Flow <= 5.78933e+06 )
									ret := -0.012302
								if( Positive_Money_Flow > 5.78933e+06 )
									ret := -0.129857
							if( bbm > 0.731393 )
								if( Money_Flow_Ratio <= 0.933235 )
									ret := 0.065079
								if( Money_Flow_Ratio > 0.933235 )
									ret := 0.173653
						if( MFI > 91.2651 )
							if( MFI_High <= 17.5521 )
								if( Positive_Money_Flow_Sum <= 2.85781e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.85781e+07 )
									ret := -0.426471
							if( MFI_High > 17.5521 )
								if( MFI_High <= 18.2342 )
									ret := 0.380952
								if( MFI_High > 18.2342 )
									ret := -0.450000
				if( Typical_Price > 150.45 )
					if( bearPower <= -1.71147 )
						if( Negative_Money_Flow_Sum <= 1.55474e+06 )
							if( Positive_Money_Flow_Sum <= 4.49087e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 4.49087e+07 )
								ret := -0.823529 // sell
						if( Negative_Money_Flow_Sum > 1.55474e+06 )
							if( bbp <= -1.4994 )
								if( Money_Flow_Ratio <= 17.1357 )
									ret := -0.092041
								if( Money_Flow_Ratio > 17.1357 )
									ret := 0.656250
							if( bbp > -1.4994 )
								if( bearPower <= -2.07636 )
									ret := 0.364130
								if( bearPower > -2.07636 )
									ret := 0.000000
					if( bearPower > -1.71147 )
						if( Negative_Money_Flow_Sum <= 1.92351e+08 )
							if( Raw_Money_Flow <= 2.69432e+07 )
								if( MFI_Low <= -1.04611 )
									ret := -0.199134
								if( MFI_Low > -1.04611 )
									ret := 0.067280
							if( Raw_Money_Flow > 2.69432e+07 )
								if( MFI_Low <= 29.4112 )
									ret := 0.293333
								if( MFI_Low > 29.4112 )
									ret := -0.306533
						if( Negative_Money_Flow_Sum > 1.92351e+08 )
							if( Positive_Money_Flow <= 1.6276e+08 )
								if( MFI_Low <= -2.02731 )
									ret := 0.204082
								if( MFI_Low > -2.02731 )
									ret := -0.102392
							if( Positive_Money_Flow > 1.6276e+08 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow > 2.15275e+07 )
				if( MFI_Low <= 26.1863 )
					if( Negative_Money_Flow_Sum <= 3.25887e+09 )
						if( Positive_Money_Flow_Sum <= 6.04808e+06 )
							if( Money_Flow_Ratio <= 0.06736 )
								if( Typical_Price <= 129.107 )
									ret := 0.126492
								if( Typical_Price > 129.107 )
									ret := -0.179908
							if( Money_Flow_Ratio > 0.06736 )
								if( Raw_Money_Flow <= 3.48517e+07 )
									ret := 0.250000
								if( Raw_Money_Flow > 3.48517e+07 )
									ret := 0.857143 // buy
						if( Positive_Money_Flow_Sum > 6.04808e+06 )
							if( bbp <= -3.91677 )
								if( Negative_Money_Flow_Sum <= 1.68067e+09 )
									ret := 0.155995
								if( Negative_Money_Flow_Sum > 1.68067e+09 )
									ret := -0.666667
							if( bbp > -3.91677 )
								if( MFI_Low <= 23.965 )
									ret := -0.055215
								if( MFI_Low > 23.965 )
									ret := 0.238095
					if( Negative_Money_Flow_Sum > 3.25887e+09 )
						if( bbm <= 3.1241 )
							ret := 0.818182 // buy
						if( bbm > 3.1241 )
							ret := 1.000000 // buy
				if( MFI_Low > 26.1863 )
					if( bearPower <= -2.93144 )
						if( bbp <= -2.04158 )
							if( Negative_Money_Flow <= 4.82737e+07 )
								if( Money_Flow_Ratio <= 1.63022 )
									ret := -0.368794
								if( Money_Flow_Ratio > 1.63022 )
									ret := 0.193548
							if( Negative_Money_Flow > 4.82737e+07 )
								if( Positive_Money_Flow_Sum <= 2.46763e+08 )
									ret := -0.805556 // sell
								if( Positive_Money_Flow_Sum > 2.46763e+08 )
									ret := -0.326087
						if( bbp > -2.04158 )
							if( bbm <= 4.865 )
								ret := -1.000000 // sell
							if( bbm > 4.865 )
								ret := -0.681818
					if( bearPower > -2.93144 )
						if( Negative_Money_Flow_Sum <= 2.80165e+08 )
							if( Negative_Money_Flow_Sum <= 1.67112e+08 )
								if( MFI_Low <= 31.083 )
									ret := 0.138889
								if( MFI_Low > 31.083 )
									ret := -0.200000
							if( Negative_Money_Flow_Sum > 1.67112e+08 )
								if( Money_Flow_Ratio <= 2.36618 )
									ret := -0.465116
								if( Money_Flow_Ratio > 2.36618 )
									ret := 0.812500 // buy
						if( Negative_Money_Flow_Sum > 2.80165e+08 )
							if( Typical_Price <= 192.755 )
								if( Raw_Money_Flow <= 5.17834e+07 )
									ret := 0.230769
								if( Raw_Money_Flow > 5.17834e+07 )
									ret := 0.777778 // buy
							if( Typical_Price > 192.755 )
								if( Negative_Money_Flow <= 7.49691e+07 )
									ret := -0.392857
								if( Negative_Money_Flow > 7.49691e+07 )
									ret := 0.395349
	if( bbp > 0.058691 )
		if( Raw_Money_Flow <= 587645 )
			if( Typical_Price <= 80.3628 )
				if( Negative_Money_Flow <= 3151.09 )
					if( Money_Flow_Ratio <= 0.55323 )
						if( MFI_High <= -60.2402 )
							if( Raw_Money_Flow <= 105065 )
								if( Money_Flow_Ratio <= 0.026456 )
									ret := -0.500000
								if( Money_Flow_Ratio > 0.026456 )
									ret := 0.288462
							if( Raw_Money_Flow > 105065 )
								if( Positive_Money_Flow_Sum <= 478139 )
									ret := -0.958333 // sell
								if( Positive_Money_Flow_Sum > 478139 )
									ret := -0.111111
						if( MFI_High > -60.2402 )
							if( Typical_Price <= 50.1667 )
								if( bbp <= 0.499264 )
									ret := -0.095238
								if( bbp > 0.499264 )
									ret := -0.428571
							if( Typical_Price > 50.1667 )
								if( Money_Flow_Ratio <= 0.343931 )
									ret := -0.904762 // sell
								if( Money_Flow_Ratio > 0.343931 )
									ret := -0.539216
					if( Money_Flow_Ratio > 0.55323 )
						if( bbp <= 0.504019 )
							if( MFI_High <= -20.5793 )
								if( bbp <= 0.201711 )
									ret := -0.092593
								if( bbp > 0.201711 )
									ret := 0.401639
							if( MFI_High > -20.5793 )
								if( Money_Flow_Ratio <= 7.35187 )
									ret := -0.175610
								if( Money_Flow_Ratio > 7.35187 )
									ret := -0.648649
						if( bbp > 0.504019 )
							if( BBPower_Color <= 0.5 )
								if( Raw_Money_Flow <= 15632.7 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 15632.7 )
									ret := -0.027027
							if( BBPower_Color > 0.5 )
								if( Raw_Money_Flow <= 139889 )
									ret := -0.454301
								if( Raw_Money_Flow > 139889 )
									ret := -0.140496
				if( Negative_Money_Flow > 3151.09 )
					if( bbm <= 0.975848 )
						if( bbp <= 1.55081 )
							if( Positive_Money_Flow_Sum <= 1.54812e+06 )
								if( MFI_Low <= 33.6581 )
									ret := -0.150259
								if( MFI_Low > 33.6581 )
									ret := -0.638095
							if( Positive_Money_Flow_Sum > 1.54812e+06 )
								if( Positive_Money_Flow_Sum <= 2.38193e+06 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow_Sum > 2.38193e+06 )
									ret := 0.000000
						if( bbp > 1.55081 )
							if( MFI <= 74.7709 )
								if( Positive_Money_Flow_Sum <= 2.41464e+07 )
									ret := -0.444444
								if( Positive_Money_Flow_Sum > 2.41464e+07 )
									ret := 0.000000
							if( MFI > 74.7709 )
								if( bbm <= 0.231472 )
									ret := -1.000000 // sell
								if( bbm > 0.231472 )
									ret := -0.875000 // sell
					if( bbm > 0.975848 )
						if( Positive_Money_Flow_Sum <= 1.46517e+06 )
							if( MFI_High <= -56.1591 )
								ret := 0.769231 // buy
							if( MFI_High > -56.1591 )
								ret := 0.909091 // buy
						if( Positive_Money_Flow_Sum > 1.46517e+06 )
							ret := 0.000000
			if( Typical_Price > 80.3628 )
				if( MFI <= 91.758 )
					if( bearPower <= 0.342784 )
						if( Negative_Money_Flow <= 442632 )
							if( Positive_Money_Flow_Sum <= 1.97531e+06 )
								if( bbp <= 1.04944 )
									ret := -0.150957
								if( bbp > 1.04944 )
									ret := 0.112903
							if( Positive_Money_Flow_Sum > 1.97531e+06 )
								if( MFI_Low <= -14.886 )
									ret := 0.462687
								if( MFI_Low > -14.886 )
									ret := 0.048912
						if( Negative_Money_Flow > 442632 )
							if( MFI_High <= -14.5942 )
								if( Money_Flow_Ratio <= 1.10078 )
									ret := -0.164835
								if( Money_Flow_Ratio > 1.10078 )
									ret := -0.905660 // sell
							if( MFI_High > -14.5942 )
								if( Typical_Price <= 183.381 )
									ret := 0.416667
								if( Typical_Price > 183.381 )
									ret := 0.100000
					if( bearPower > 0.342784 )
						if( MFI_Low <= 44.1283 )
							if( MFI_High <= -23.7731 )
								if( Positive_Money_Flow <= 185071 )
									ret := -0.172608
								if( Positive_Money_Flow > 185071 )
									ret := -0.007353
							if( MFI_High > -23.7731 )
								if( Negative_Money_Flow <= 129405 )
									ret := -0.025688
								if( Negative_Money_Flow > 129405 )
									ret := 0.228070
						if( MFI_Low > 44.1283 )
							if( MFI_Low <= 60.3922 )
								if( Positive_Money_Flow_Sum <= 2.66344e+08 )
									ret := -0.347791
								if( Positive_Money_Flow_Sum > 2.66344e+08 )
									ret := 0.052632
							if( MFI_Low > 60.3922 )
								if( bearPower <= 0.461948 )
									ret := 0.226667
								if( bearPower > 0.461948 )
									ret := -0.171320
				if( MFI > 91.758 )
					if( Money_Flow_Ratio <= 36.2321 )
						if( MFI_Low <= 73.0165 )
							if( bearPower <= 0.42841 )
								if( bearPower <= 0.30226 )
									ret := 0.033333
								if( bearPower > 0.30226 )
									ret := 0.888889 // buy
							if( bearPower > 0.42841 )
								if( bearPower <= 0.924907 )
									ret := -0.314286
								if( bearPower > 0.924907 )
									ret := 0.000000
						if( MFI_Low > 73.0165 )
							if( Positive_Money_Flow_Sum <= 7.80675e+08 )
								if( Raw_Money_Flow <= 78668.5 )
									ret := 0.127907
								if( Raw_Money_Flow > 78668.5 )
									ret := 0.427673
							if( Positive_Money_Flow_Sum > 7.80675e+08 )
								if( MFI <= 96.3178 )
									ret := 0.750000 // buy
								if( MFI > 96.3178 )
									ret := 1.000000 // buy
					if( Money_Flow_Ratio > 36.2321 )
						if( bearPower <= -0.000336 )
							if( bearPower <= -0.021108 )
								if( bbm <= 1.10084 )
									ret := -0.074074
								if( bbm > 1.10084 )
									ret := -0.583333
							if( bearPower > -0.021108 )
								ret := -0.944444 // sell
						if( bearPower > -0.000336 )
							if( Positive_Money_Flow <= 92298.4 )
								if( Positive_Money_Flow_Sum <= 9.22501e+08 )
									ret := 0.075650
								if( Positive_Money_Flow_Sum > 9.22501e+08 )
									ret := -0.680000
							if( Positive_Money_Flow > 92298.4 )
								if( Positive_Money_Flow <= 200383 )
									ret := -0.388158
								if( Positive_Money_Flow > 200383 )
									ret := -0.008403
		if( Raw_Money_Flow > 587645 )
			if( MFI_High <= -38.3511 )
				if( Negative_Money_Flow_Sum <= 8.32491e+07 )
					if( Raw_Money_Flow <= 5.68792e+07 )
						if( Negative_Money_Flow <= 1.96897e+06 )
							if( MFI <= 13.3448 )
								if( MFI <= 4.79339 )
									ret := -0.277778
								if( MFI > 4.79339 )
									ret := -0.914286 // sell
							if( MFI > 13.3448 )
								if( Negative_Money_Flow_Sum <= 2.22899e+06 )
									ret := 0.375000
								if( Negative_Money_Flow_Sum > 2.22899e+06 )
									ret := -0.244083
						if( Negative_Money_Flow > 1.96897e+06 )
							if( bbp <= 0.085282 )
								ret := 0.095238
							if( bbp > 0.085282 )
								if( MFI_High <= -72.5483 )
									ret := -0.736111 // sell
								if( MFI_High > -72.5483 )
									ret := -0.400000
					if( Raw_Money_Flow > 5.68792e+07 )
						if( bullPower <= 1.99475 )
							ret := 0.956522 // buy
						if( bullPower > 1.99475 )
							ret := -0.230769
				if( Negative_Money_Flow_Sum > 8.32491e+07 )
					if( Negative_Money_Flow_Sum <= 1.00869e+08 )
						if( bearPower <= -1.59351 )
							ret := 1.000000 // buy
						if( bearPower > -1.59351 )
							if( bbp <= 3.26096 )
								if( Typical_Price <= 59.5371 )
									ret := 0.736842 // buy
								if( Typical_Price > 59.5371 )
									ret := 0.088398
							if( bbp > 3.26096 )
								ret := 0.785714 // buy
					if( Negative_Money_Flow_Sum > 1.00869e+08 )
						if( bbm <= 8.0606 )
							if( bbm <= 3.93941 )
								if( Positive_Money_Flow <= 9.44503e+07 )
									ret := -0.048387
								if( Positive_Money_Flow > 9.44503e+07 )
									ret := 0.833333 // buy
							if( bbm > 3.93941 )
								if( Positive_Money_Flow <= 3.69048e+07 )
									ret := -0.280702
								if( Positive_Money_Flow > 3.69048e+07 )
									ret := -0.718750 // sell
						if( bbm > 8.0606 )
							ret := 0.600000
			if( MFI_High > -38.3511 )
				if( bbp <= 3.62738 )
					if( Positive_Money_Flow <= 7.47388e+06 )
						if( Negative_Money_Flow_Sum <= 4.02124e+06 )
							if( Typical_Price <= 53.3482 )
								if( bullPower <= 0.591329 )
									ret := -0.400000
								if( bullPower > 0.591329 )
									ret := -0.968750 // sell
							if( Typical_Price > 53.3482 )
								if( Typical_Price <= 370.853 )
									ret := -0.094720
								if( Typical_Price > 370.853 )
									ret := 0.727273 // buy
						if( Negative_Money_Flow_Sum > 4.02124e+06 )
							if( bbm <= 7.34575 )
								if( Negative_Money_Flow_Sum <= 6.70284e+06 )
									ret := 0.298113
								if( Negative_Money_Flow_Sum > 6.70284e+06 )
									ret := 0.048613
							if( bbm > 7.34575 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow > 7.47388e+06 )
						if( Raw_Money_Flow <= 4.58345e+08 )
							if( bbm <= 6.68526 )
								if( Negative_Money_Flow <= 7.15524e+06 )
									ret := -0.026391
								if( Negative_Money_Flow > 7.15524e+06 )
									ret := -0.606557
							if( bbm > 6.68526 )
								if( Positive_Money_Flow <= 1.88004e+08 )
									ret := 0.787234 // buy
								if( Positive_Money_Flow > 1.88004e+08 )
									ret := -0.333333
						if( Raw_Money_Flow > 4.58345e+08 )
							ret := -0.909091 // sell
				if( bbp > 3.62738 )
					if( bbp <= 7.95822 )
						if( MFI_High <= 7.26912 )
							if( MFI_High <= -31.3486 )
								if( bbm <= 0.983164 )
									ret := 0.111111
								if( bbm > 0.983164 )
									ret := -0.556818
							if( MFI_High > -31.3486 )
								if( Positive_Money_Flow <= 1.68243e+08 )
									ret := -0.047223
								if( Positive_Money_Flow > 1.68243e+08 )
									ret := 0.738095 // buy
						if( MFI_High > 7.26912 )
							if( Typical_Price <= 198.151 )
								if( bearPower <= 1.01549 )
									ret := -0.479167
								if( bearPower > 1.01549 )
									ret := -0.116057
							if( Typical_Price > 198.151 )
								if( Negative_Money_Flow_Sum <= 7.35506e+06 )
									ret := -0.248634
								if( Negative_Money_Flow_Sum > 7.35506e+06 )
									ret := -0.568702
					if( bbp > 7.95822 )
						if( bbm <= 2.36169 )
							if( MFI <= 88.8852 )
								if( bbm <= 2.04695 )
									ret := -0.315789
								if( bbm > 2.04695 )
									ret := 0.181818
							if( MFI > 88.8852 )
								if( Negative_Money_Flow_Sum <= 4.92732e+07 )
									ret := -0.508772
								if( Negative_Money_Flow_Sum > 4.92732e+07 )
									ret := 0.096774
						if( bbm > 2.36169 )
							if( MFI_High <= -5.93628 )
								if( Negative_Money_Flow_Sum <= 1.79611e+08 )
									ret := 0.148148
								if( Negative_Money_Flow_Sum > 1.79611e+08 )
									ret := -0.555556
							if( MFI_High > -5.93628 )
								if( bbm <= 3.54152 )
									ret := 0.504545
								if( bbm > 3.54152 )
									ret := 0.261780
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_CRWD_15Min_a6d0605a(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


