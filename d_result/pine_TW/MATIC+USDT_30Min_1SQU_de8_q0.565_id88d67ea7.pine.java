//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: MATICUSDT_30Min_1SQU_88d67ea7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1SQU_88d67ea7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_88d67ea7(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lowerBB <= 0.360857 )
		if( rangema <= 0.000172 )
			if( lowerBB <= 0.019219 )
				if( upperBB <= 0.019394 )
					if( upperBB <= 0.012476 )
						if( val <= 3e-06 )
							ret := 1.000000 // buy
						if( val > 3e-06 )
							ret := 0.333333
					if( upperBB > 0.012476 )
						if( val <= -1.3e-05 )
							if( dev <= 0.000366 )
								if( lowerBB <= 0.012214 )
									ret := 1.000000 // buy
								if( lowerBB > 0.012214 )
									ret := 0.181548
							if( dev > 0.000366 )
								if( rangema <= 0.000159 )
									ret := -0.042553
								if( rangema > 0.000159 )
									ret := -0.625000
						if( val > -1.3e-05 )
							if( upperBB <= 0.013149 )
								if( dev <= 0.000232 )
									ret := -0.757143 // sell
								if( dev > 0.000232 )
									ret := 0.333333
							if( upperBB > 0.013149 )
								if( ma <= 0.01881 )
									ret := -0.033999
								if( ma > 0.01881 )
									ret := -0.432432
				if( upperBB > 0.019394 )
					if( dev <= 0.000132 )
						if( val <= -1.4e-05 )
							ret := 0.250000
						if( val > -1.4e-05 )
							ret := 1.000000 // buy
					if( dev > 0.000132 )
						if( basis <= 0.019433 )
							if( val <= -3.3e-05 )
								ret := 1.000000 // buy
							if( val > -3.3e-05 )
								if( lowerKC <= 0.019187 )
									ret := 0.173913
								if( lowerKC > 0.019187 )
									ret := 0.666667
						if( basis > 0.019433 )
							if( dev <= 0.000371 )
								ret := -1.000000 // sell
							if( dev > 0.000371 )
								ret := 0.000000
			if( lowerBB > 0.019219 )
				if( dev <= 0.00022 )
					if( lowerKC <= 0.020803 )
						if( avgHighLow <= 0.019304 )
							if( priceRange <= 0.000147 )
								ret := -1.000000 // sell
							if( priceRange > 0.000147 )
								ret := -0.750000 // sell
						if( avgHighLow > 0.019304 )
							if( priceRange <= 0.000381 )
								if( rangema <= 0.000136 )
									ret := 0.062500
								if( rangema > 0.000136 )
									ret := -0.486239
							if( priceRange > 0.000381 )
								ret := 1.000000 // buy
					if( lowerKC > 0.020803 )
						ret := -1.000000 // sell
				if( dev > 0.00022 )
					if( priceRange <= 0.000109 )
						if( lowerBB <= 0.020346 )
							if( upperKC <= 0.020167 )
								ret := 0.000000
							if( upperKC > 0.020167 )
								ret := 0.250000
						if( lowerBB > 0.020346 )
							if( val <= -1.2e-05 )
								ret := 0.400000
							if( val > -1.2e-05 )
								ret := 1.000000 // buy
					if( priceRange > 0.000109 )
						if( avgHighLow <= 0.019993 )
							if( val <= -2e-06 )
								if( lowerBB <= 0.019441 )
									ret := -0.750000 // sell
								if( lowerBB > 0.019441 )
									ret := -0.250000
							if( val > -2e-06 )
								if( val <= 1.8e-05 )
									ret := 0.600000
								if( val > 1.8e-05 )
									ret := 0.000000
						if( avgHighLow > 0.019993 )
							if( val <= -2.4e-05 )
								if( lowerBB <= 0.020667 )
									ret := 1.000000 // buy
								if( lowerBB > 0.020667 )
									ret := -0.111111
							if( val > -2.4e-05 )
								if( val <= -5e-06 )
									ret := -0.888889 // sell
								if( val > -5e-06 )
									ret := -0.545455
		if( rangema > 0.000172 )
			if( upperBB <= 0.018146 )
				if( dev <= 0.000378 )
					if( lowerBB <= 0.01639 )
						if( avgHighLow <= 0.012329 )
							if( lowerKC <= 0.011852 )
								ret := -0.250000
							if( lowerKC > 0.011852 )
								ret := 0.000000
						if( avgHighLow > 0.012329 )
							if( dev <= 0.000356 )
								if( ma <= 0.015741 )
									ret := 0.826772 // buy
								if( ma > 0.015741 )
									ret := 0.646154
							if( dev > 0.000356 )
								if( rangema <= 0.000177 )
									ret := -0.250000
								if( rangema > 0.000177 )
									ret := 0.538462
					if( lowerBB > 0.01639 )
						if( upperBB <= 0.017952 )
							if( upperBB <= 0.017351 )
								if( upperKC <= 0.017017 )
									ret := 0.571429
								if( upperKC > 0.017017 )
									ret := -0.338235
							if( upperBB > 0.017351 )
								if( basis <= 0.017366 )
									ret := 0.815789 // buy
								if( basis > 0.017366 )
									ret := 0.130435
						if( upperBB > 0.017952 )
							if( rangema <= 0.000202 )
								if( ma <= 0.017842 )
									ret := 0.055556
								if( ma > 0.017842 )
									ret := 0.740741 // buy
							if( rangema > 0.000202 )
								if( lowerBB <= 0.01753 )
									ret := 0.972973 // buy
								if( lowerBB > 0.01753 )
									ret := 0.619048
				if( dev > 0.000378 )
					if( val <= -5.4e-05 )
						if( dev <= 0.001276 )
							if( priceRange <= 0.000195 )
								ret := 0.000000
							if( priceRange > 0.000195 )
								if( avgHighLow <= 0.016692 )
									ret := -0.846154 // sell
								if( avgHighLow > 0.016692 )
									ret := -1.000000 // sell
						if( dev > 0.001276 )
							if( upperKC <= 0.016481 )
								ret := -0.500000
							if( upperKC > 0.016481 )
								ret := 0.750000 // buy
					if( val > -5.4e-05 )
						if( lowerKC <= 0.014261 )
							if( ma <= 0.012581 )
								ret := -0.400000
							if( ma > 0.012581 )
								if( dev <= 0.00084 )
									ret := 0.787879 // buy
								if( dev > 0.00084 )
									ret := -0.250000
						if( lowerKC > 0.014261 )
							if( avgHighLow <= 0.014747 )
								ret := -1.000000 // sell
							if( avgHighLow > 0.014747 )
								if( rangema <= 0.000521 )
									ret := 0.110417
								if( rangema > 0.000521 )
									ret := 0.840000 // buy
			if( upperBB > 0.018146 )
				if( val <= 5e-06 )
					if( lowerKC <= 0.343568 )
						if( rangema <= 0.008712 )
							if( dev <= 0.0049 )
								if( lowerBB <= 0.120647 )
									ret := 0.184412
								if( lowerBB > 0.120647 )
									ret := -0.273973
							if( dev > 0.0049 )
								if( ma <= 0.109403 )
									ret := 0.943089 // buy
								if( ma > 0.109403 )
									ret := 0.278750
						if( rangema > 0.008712 )
							if( rangema <= 0.01058 )
								if( avgHighLow <= 0.179687 )
									ret := 0.269231
								if( avgHighLow > 0.179687 )
									ret := -0.493333
							if( rangema > 0.01058 )
								if( upperBB <= 0.333816 )
									ret := -0.239437
								if( upperBB > 0.333816 )
									ret := 0.464789
					if( lowerKC > 0.343568 )
						if( upperBB <= 0.384245 )
							if( dev <= 0.010624 )
								if( avgHighLow <= 0.366336 )
									ret := 0.205000
								if( avgHighLow > 0.366336 )
									ret := 0.868852 // buy
							if( dev > 0.010624 )
								if( rangema <= 0.006191 )
									ret := -0.750000 // sell
								if( rangema > 0.006191 )
									ret := 0.882353 // buy
						if( upperBB > 0.384245 )
							if( upperKC <= 0.381882 )
								if( upperBB <= 0.384763 )
									ret := -0.181818
								if( upperBB > 0.384763 )
									ret := -0.913043 // sell
							if( upperKC > 0.381882 )
								if( rangema <= 0.007546 )
									ret := -0.636364
								if( rangema > 0.007546 )
									ret := 0.397590
				if( val > 5e-06 )
					if( rangema <= 0.00666 )
						if( upperBB <= 0.018655 )
							if( avgHighLow <= 0.018066 )
								if( upperKC <= 0.018373 )
									ret := 0.201550
								if( upperKC > 0.018373 )
									ret := -0.370968
							if( avgHighLow > 0.018066 )
								if( ma <= 0.018235 )
									ret := -0.802469 // sell
								if( ma > 0.018235 )
									ret := -0.338462
						if( upperBB > 0.018655 )
							if( upperBB <= 0.019605 )
								if( avgHighLow <= 0.019131 )
									ret := 0.133005
								if( avgHighLow > 0.019131 )
									ret := 0.657895
							if( upperBB > 0.019605 )
								if( basis <= 0.019385 )
									ret := -0.471910
								if( basis > 0.019385 )
									ret := 0.014761
					if( rangema > 0.00666 )
						if( lowerKC <= 0.146432 )
							if( rangema <= 0.008668 )
								if( upperBB <= 0.128612 )
									ret := 1.000000 // buy
								if( upperBB > 0.128612 )
									ret := -0.606742
							if( rangema > 0.008668 )
								if( rangema <= 0.010219 )
									ret := 0.426230
								if( rangema > 0.010219 )
									ret := -0.785714 // sell
						if( lowerKC > 0.146432 )
							if( upperKC <= 0.188917 )
								if( upperKC <= 0.171351 )
									ret := 0.000000
								if( upperKC > 0.171351 )
									ret := 0.876543 // buy
							if( upperKC > 0.188917 )
								if( rangema <= 0.007434 )
									ret := 0.592593
								if( rangema > 0.007434 )
									ret := 0.206298
	if( lowerBB > 0.360857 )
		if( rangema <= 0.01405 )
			if( lowerKC <= 1.24568 )
				if( avgHighLow <= 1.23562 )
					if( avgHighLow <= 1.214 )
						if( upperKC <= 1.22652 )
							if( lowerKC <= 0.363293 )
								if( upperKC <= 0.372896 )
									ret := 0.750000 // buy
								if( upperKC > 0.372896 )
									ret := -0.493902
							if( lowerKC > 0.363293 )
								if( dev <= 0.005311 )
									ret := -0.030276
								if( dev > 0.005311 )
									ret := 0.030701
						if( upperKC > 1.22652 )
							if( rangema <= 0.013386 )
								if( lowerKC <= 1.19949 )
									ret := 0.772727 // buy
								if( lowerKC > 1.19949 )
									ret := 0.300000
							if( rangema > 0.013386 )
								if( ma <= 1.21592 )
									ret := -0.500000
								if( ma > 1.21592 )
									ret := 0.000000
					if( avgHighLow > 1.214 )
						if( upperBB <= 1.25781 )
							if( rangema <= 0.009546 )
								if( upperKC <= 1.23996 )
									ret := 0.128205
								if( upperKC > 1.23996 )
									ret := -0.283333
							if( rangema > 0.009546 )
								if( val <= 0.001282 )
									ret := -0.572816
								if( val > 0.001282 )
									ret := 0.000000
						if( upperBB > 1.25781 )
							if( val <= -0.001132 )
								if( upperKC <= 1.25279 )
									ret := 0.400000
								if( upperKC > 1.25279 )
									ret := 1.000000 // buy
							if( val > -0.001132 )
								if( rangema <= 0.012868 )
									ret := 0.000000
								if( rangema > 0.012868 )
									ret := 0.800000 // buy
				if( avgHighLow > 1.23562 )
					if( upperKC <= 1.25435 )
						if( ma <= 1.23112 )
							ret := -0.285714
						if( ma > 1.23112 )
							if( val <= -0.000835 )
								ret := 1.000000 // buy
							if( val > -0.000835 )
								if( val <= 0.000522 )
									ret := 0.392157
								if( val > 0.000522 )
									ret := 0.964286 // buy
					if( upperKC > 1.25435 )
						if( lowerKC <= 1.23936 )
							if( val <= 0.002422 )
								if( dev <= 0.012563 )
									ret := 0.421687
								if( dev > 0.012563 )
									ret := -0.160584
							if( val > 0.002422 )
								if( upperBB <= 1.26824 )
									ret := 0.000000
								if( upperBB > 1.26824 )
									ret := 0.944444 // buy
						if( lowerKC > 1.23936 )
							if( upperKC <= 1.26835 )
								if( lowerBB <= 1.23524 )
									ret := 0.600000
								if( lowerBB > 1.23524 )
									ret := 1.000000 // buy
							if( upperKC > 1.26835 )
								if( avgHighLow <= 1.2561 )
									ret := 0.619048
								if( avgHighLow > 1.2561 )
									ret := 0.181818
			if( lowerKC > 1.24568 )
				if( dev <= 0.024257 )
					if( upperBB <= 1.35623 )
						if( lowerBB <= 1.28731 )
							if( upperBB <= 1.27323 )
								if( dev <= 0.010622 )
									ret := -0.500000
								if( dev > 0.010622 )
									ret := -1.000000 // sell
							if( upperBB > 1.27323 )
								if( lowerBB <= 1.26696 )
									ret := -0.209302
								if( lowerBB > 1.26696 )
									ret := 0.298701
						if( lowerBB > 1.28731 )
							if( val <= 0.002137 )
								if( rangema <= 0.010767 )
									ret := -0.817204 // sell
								if( rangema > 0.010767 )
									ret := -0.522727
							if( val > 0.002137 )
								ret := 1.000000 // buy
					if( upperBB > 1.35623 )
						if( val <= -0.000446 )
							if( priceRange <= 0.017589 )
								if( basis <= 1.35669 )
									ret := 0.380952
								if( basis > 1.35669 )
									ret := -0.071540
							if( priceRange > 0.017589 )
								if( rangema <= 0.012175 )
									ret := 0.000000
								if( rangema > 0.012175 )
									ret := 0.545455
						if( val > -0.000446 )
							if( rangema <= 0.011104 )
								if( dev <= 0.022497 )
									ret := -0.014286
								if( dev > 0.022497 )
									ret := 0.800000 // buy
							if( rangema > 0.011104 )
								if( avgHighLow <= 1.62257 )
									ret := -0.226148
								if( avgHighLow > 1.62257 )
									ret := -0.427509
				if( dev > 0.024257 )
					if( avgHighLow <= 1.28952 )
						if( avgHighLow <= 1.27512 )
							if( avgHighLow <= 1.26478 )
								ret := -0.500000
							if( avgHighLow > 1.26478 )
								if( basis <= 1.26965 )
									ret := 0.000000
								if( basis > 1.26965 )
									ret := 0.250000
						if( avgHighLow > 1.27512 )
							if( ma <= 1.29805 )
								if( dev <= 0.032903 )
									ret := -1.000000 // sell
								if( dev > 0.032903 )
									ret := -0.250000
							if( ma > 1.29805 )
								ret := -0.250000
					if( avgHighLow > 1.28952 )
						if( lowerKC <= 1.36883 )
							if( avgHighLow <= 1.34175 )
								if( val <= -0.00064 )
									ret := -0.204545
								if( val > -0.00064 )
									ret := 0.586957
							if( avgHighLow > 1.34175 )
								if( avgHighLow <= 1.37417 )
									ret := 0.952381 // buy
								if( avgHighLow > 1.37417 )
									ret := 0.275862
						if( lowerKC > 1.36883 )
							if( lowerBB <= 1.36447 )
								if( upperKC <= 1.41762 )
									ret := -0.200000
								if( upperKC > 1.41762 )
									ret := -0.888889 // sell
							if( lowerBB > 1.36447 )
								if( upperKC <= 1.50166 )
									ret := 0.183824
								if( upperKC > 1.50166 )
									ret := -0.135802
		if( rangema > 0.01405 )
			if( lowerBB <= 1.6133 )
				if( val <= -0.006065 )
					if( upperBB <= 1.14372 )
						if( upperKC <= 0.813382 )
							ret := 1.000000 // buy
						if( upperKC > 0.813382 )
							if( avgHighLow <= 0.812944 )
								if( lowerBB <= 0.70642 )
									ret := -1.000000 // sell
								if( lowerBB > 0.70642 )
									ret := -0.750000 // sell
							if( avgHighLow > 0.812944 )
								ret := -0.250000
					if( upperBB > 1.14372 )
						if( priceRange <= 0.017427 )
							if( basis <= 1.52913 )
								ret := 0.428571
							if( basis > 1.52913 )
								ret := -0.714286 // sell
						if( priceRange > 0.017427 )
							if( lowerBB <= 1.54655 )
								if( avgHighLow <= 1.28213 )
									ret := 0.540000
								if( avgHighLow > 1.28213 )
									ret := 0.854167 // buy
							if( lowerBB > 1.54655 )
								if( val <= -0.006815 )
									ret := 0.185185
								if( val > -0.006815 )
									ret := 0.869565 // buy
				if( val > -0.006065 )
					if( basis <= 1.68765 )
						if( lowerKC <= 0.811002 )
							if( basis <= 0.827759 )
								if( rangema <= 0.043301 )
									ret := 0.216570
								if( rangema > 0.043301 )
									ret := -0.733333 // sell
							if( basis > 0.827759 )
								if( sqzOnInt <= 0.5 )
									ret := 0.235294
								if( sqzOnInt > 0.5 )
									ret := 0.875776 // buy
						if( lowerKC > 0.811002 )
							if( dev <= 0.036317 )
								if( val <= 0.003813 )
									ret := 0.117933
								if( val > 0.003813 )
									ret := 0.538860
							if( dev > 0.036317 )
								if( lowerBB <= 1.05138 )
									ret := 0.177240
								if( lowerBB > 1.05138 )
									ret := 0.000917
					if( basis > 1.68765 )
						if( lowerBB <= 1.48332 )
							ret := -0.500000
						if( lowerBB > 1.48332 )
							if( upperKC <= 1.89024 )
								if( dev <= 0.109282 )
									ret := 0.727273 // buy
								if( dev > 0.109282 )
									ret := 0.200000
							if( upperKC > 1.89024 )
								if( ma <= 1.83484 )
									ret := 1.000000 // buy
								if( ma > 1.83484 )
									ret := 0.600000
			if( lowerBB > 1.6133 )
				if( val <= -0.005175 )
					if( sqzOnInt <= 0.5 )
						if( ma <= 1.7842 )
							if( dev <= 0.045283 )
								ret := 0.750000 // buy
							if( dev > 0.045283 )
								if( upperBB <= 1.85111 )
									ret := -0.760000 // sell
								if( upperBB > 1.85111 )
									ret := -0.142857
						if( ma > 1.7842 )
							if( rangema <= 0.027775 )
								if( basis <= 2.1072 )
									ret := -0.125000
								if( basis > 2.1072 )
									ret := -1.000000 // sell
							if( rangema > 0.027775 )
								if( dev <= 0.11143 )
									ret := 0.650000
								if( dev > 0.11143 )
									ret := 0.321101
					if( sqzOnInt > 0.5 )
						if( lowerKC <= 2.48608 )
							if( basis <= 1.97173 )
								if( upperKC <= 1.9566 )
									ret := -0.118182
								if( upperKC > 1.9566 )
									ret := 0.776119 // buy
							if( basis > 1.97173 )
								if( upperBB <= 2.12158 )
									ret := -0.894737 // sell
								if( upperBB > 2.12158 )
									ret := -0.068182
						if( lowerKC > 2.48608 )
							if( rangema <= 0.038196 )
								ret := 0.250000
							if( rangema > 0.038196 )
								if( val <= -0.006988 )
									ret := 0.600000
								if( val > -0.006988 )
									ret := 1.000000 // buy
				if( val > -0.005175 )
					if( upperKC <= 2.09992 )
						if( dev <= 0.125702 )
							if( rangema <= 0.064536 )
								if( dev <= 0.018027 )
									ret := -0.297376
								if( dev > 0.018027 )
									ret := 0.035007
							if( rangema > 0.064536 )
								if( priceRange <= 0.077785 )
									ret := -0.632479
								if( priceRange > 0.077785 )
									ret := -0.042553
						if( dev > 0.125702 )
							if( priceRange <= 0.090718 )
								if( rangema <= 0.055912 )
									ret := 0.000000
								if( rangema > 0.055912 )
									ret := 0.846154 // buy
							if( priceRange > 0.090718 )
								if( dev <= 0.193914 )
									ret := 0.375000
								if( dev > 0.193914 )
									ret := -0.750000 // sell
					if( upperKC > 2.09992 )
						if( val <= 0.007772 )
							if( lowerKC <= 1.94183 )
								if( priceRange <= 0.197987 )
									ret := -0.898305 // sell
								if( priceRange > 0.197987 )
									ret := 0.600000
							if( lowerKC > 1.94183 )
								if( dev <= 0.024165 )
									ret := 0.281437
								if( dev > 0.024165 )
									ret := -0.115731
						if( val > 0.007772 )
							if( priceRange <= 0.04245 )
								if( upperBB <= 2.13053 )
									ret := 0.750000 // buy
								if( upperBB > 2.13053 )
									ret := -0.448276
							if( priceRange > 0.04245 )
								if( lowerBB <= 2.2519 )
									ret := -0.862745 // sell
								if( lowerBB > 2.2519 )
									ret := -0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Squeeze_Momentum_Indicator 
//@version=5
//indicator "Squeeze Momentum Indicator [LazyBear]", shorttitle="SQZMOM_LB", overlay=false)

lengthBB = input.int(20, title="BB Length")
mult = input.float(2.0, title="BB MultFactor")
lengthKC = input.int(20, title="KC Length")
multKC = input.float(1.5, title="KC MultFactor")

useTrueRange = input(true, title="Use TrueRange (KC)")

// Calculate BB
source = close
basis = ta.sma(source, lengthBB)
dev = multKC * ta.stdev(source, lengthBB)
upperBB = basis + dev
lowerBB = basis - dev

// Calculate KC
ma = ta.sma(source, lengthKC)
priceRange = useTrueRange ? ta.tr(true) : (high - low)
rangema = ta.sma(priceRange, lengthKC)
upperKC = ma + rangema * multKC
lowerKC = ma - rangema * multKC

sqzOn = (lowerBB > lowerKC) and (upperBB < upperKC)
sqzOff = (lowerBB < lowerKC) and (upperBB > upperKC)
noSqz = not sqzOn and not sqzOff
sqzOnInt = sqzOn ? 1: 0   //Bool to int
sqzOffInt = sqzOff ? 1: 0   //Bool to int
noSqzInt = noSqz ? 1: 0   //Bool to int

avgHighLow = (ta.highest(high, lengthKC) + ta.lowest(low, lengthKC)) / 2
val = ta.linreg(source - (avgHighLow + ta.sma(close, lengthKC)) / 2, lengthKC, 0)

bcolor = val > 0 ? (val > nz(val[1]) ? color.lime : color.green) : (val < nz(val[1]) ? color.red : color.maroon)
scolor = noSqz ? color.blue : sqzOn ? color.black : color.gray

plot(val, color=bcolor, style=plot.style_histogram, linewidth=4)
plot(0, color=scolor, style=plot.style_cross, linewidth=2)


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
float op_operation = decision_tree_0_MATICUSDT_30Min_88d67ea7(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


