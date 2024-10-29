//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: AMD_5Min_1SQU_8decdda2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_1SQU_8decdda2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_8decdda2(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( val <= -0.00333 )
		if( upperBB <= 172.22 )
			if( dev <= 0.478927 )
				if( rangema <= 0.449792 )
					if( sqzOffInt <= 0.5 )
						if( val <= -0.010412 )
							if( val <= -0.037305 )
								if( upperBB <= 88.0323 )
									ret := -0.800000 // sell
								if( upperBB > 88.0323 )
									ret := -0.008666
							if( val > -0.037305 )
								if( lowerBB <= 89.5544 )
									ret := 0.265918
								if( lowerBB > 89.5544 )
									ret := 0.065321
						if( val > -0.010412 )
							if( lowerKC <= 94.7286 )
								if( lowerKC <= 86.5626 )
									ret := 0.200000
								if( lowerKC > 86.5626 )
									ret := -0.427273
							if( lowerKC > 94.7286 )
								if( rangema <= 0.333374 )
									ret := 0.018325
								if( rangema > 0.333374 )
									ret := -0.222707
					if( sqzOffInt > 0.5 )
						if( upperKC <= 170.295 )
							if( lowerKC <= 169.143 )
								if( lowerKC <= 167.895 )
									ret := -0.051258
								if( lowerKC > 167.895 )
									ret := 0.523810
							if( lowerKC > 169.143 )
								if( rangema <= 0.12775 )
									ret := -0.909091 // sell
								if( rangema > 0.12775 )
									ret := -0.150000
						if( upperKC > 170.295 )
							if( rangema <= 0.15716 )
								ret := 0.000000
							if( rangema > 0.15716 )
								if( lowerBB <= 169.738 )
									ret := 0.772727 // buy
								if( lowerBB > 169.738 )
									ret := 0.339623
				if( rangema > 0.449792 )
					if( upperKC <= 119.237 )
						if( lowerKC <= 104.399 )
							if( avgHighLow <= 103.731 )
								if( upperKC <= 99.0509 )
									ret := -0.166667
								if( upperKC > 99.0509 )
									ret := 1.000000 // buy
							if( avgHighLow > 103.731 )
								ret := -1.000000 // sell
						if( lowerKC > 104.399 )
							if( ma <= 106.765 )
								if( priceRange <= 0.39045 )
									ret := 0.500000
								if( priceRange > 0.39045 )
									ret := 0.937500 // buy
							if( ma > 106.765 )
								if( val <= -0.03899 )
									ret := 0.400000
								if( val > -0.03899 )
									ret := 0.000000
					if( upperKC > 119.237 )
						if( upperKC <= 129.987 )
							if( val <= -0.058227 )
								if( dev <= 0.402864 )
									ret := 0.666667
								if( dev > 0.402864 )
									ret := -0.571429
							if( val > -0.058227 )
								if( ma <= 124.965 )
									ret := -0.744186 // sell
								if( ma > 124.965 )
									ret := -0.964286 // sell
						if( upperKC > 129.987 )
							if( avgHighLow <= 155.417 )
								if( val <= -0.03753 )
									ret := 0.469388
								if( val > -0.03753 )
									ret := -0.256410
							if( avgHighLow > 155.417 )
								if( avgHighLow <= 159.073 )
									ret := -0.767442 // sell
								if( avgHighLow > 159.073 )
									ret := -0.350993
			if( dev > 0.478927 )
				if( rangema <= 0.512098 )
					if( ma <= 127.143 )
						if( avgHighLow <= 109.157 )
							if( upperKC <= 108.205 )
								if( rangema <= 0.320187 )
									ret := -0.089532
								if( rangema > 0.320187 )
									ret := 0.214114
							if( upperKC > 108.205 )
								if( lowerBB <= 106.787 )
									ret := 0.967213 // buy
								if( lowerBB > 106.787 )
									ret := 0.253968
						if( avgHighLow > 109.157 )
							if( avgHighLow <= 109.905 )
								if( upperBB <= 109.847 )
									ret := 0.187500
								if( upperBB > 109.847 )
									ret := -0.633663
							if( avgHighLow > 109.905 )
								if( upperKC <= 111.671 )
									ret := 0.262376
								if( upperKC > 111.671 )
									ret := -0.057868
					if( ma > 127.143 )
						if( lowerBB <= 127.56 )
							if( avgHighLow <= 127.629 )
								if( basis <= 127.336 )
									ret := 1.000000 // buy
								if( basis > 127.336 )
									ret := -0.142857
							if( avgHighLow > 127.629 )
								if( dev <= 1.32532 )
									ret := 0.978261 // buy
								if( dev > 1.32532 )
									ret := 0.500000
						if( lowerBB > 127.56 )
							if( priceRange <= 0.265819 )
								if( priceRange <= 0.125264 )
									ret := -0.063380
								if( priceRange > 0.125264 )
									ret := 0.117100
							if( priceRange > 0.265819 )
								if( avgHighLow <= 161.35 )
									ret := 0.281392
								if( avgHighLow > 161.35 )
									ret := 0.129412
				if( rangema > 0.512098 )
					if( upperKC <= 165.238 )
						if( upperBB <= 165.06 )
							if( dev <= 5.28733 )
								if( dev <= 0.527992 )
									ret := 0.386364
								if( dev > 0.527992 )
									ret := -0.001871
							if( dev > 5.28733 )
								if( dev <= 6.04414 )
									ret := -0.500000
								if( dev > 6.04414 )
									ret := -1.000000 // sell
						if( upperBB > 165.06 )
							if( basis <= 163.39 )
								if( upperBB <= 165.203 )
									ret := -0.833333 // sell
								if( upperBB > 165.203 )
									ret := 0.583333
							if( basis > 163.39 )
								if( avgHighLow <= 164.146 )
									ret := -0.960784 // sell
								if( avgHighLow > 164.146 )
									ret := -0.500000
					if( upperKC > 165.238 )
						if( rangema <= 1.27546 )
							if( upperBB <= 169.935 )
								if( upperBB <= 168.964 )
									ret := 0.114471
								if( upperBB > 168.964 )
									ret := 0.633721
							if( upperBB > 169.935 )
								if( avgHighLow <= 168.234 )
									ret := -0.563218
								if( avgHighLow > 168.234 )
									ret := 0.047619
						if( rangema > 1.27546 )
							if( upperBB <= 167.867 )
								if( ma <= 165.709 )
									ret := -0.666667
								if( ma > 165.709 )
									ret := 0.800000 // buy
							if( upperBB > 167.867 )
								if( lowerKC <= 163.405 )
									ret := 0.833333 // buy
								if( lowerKC > 163.405 )
									ret := 0.977273 // buy
		if( upperBB > 172.22 )
			if( lowerBB <= 170.813 )
				if( upperBB <= 172.685 )
					if( val <= -0.071981 )
						if( priceRange <= 1.045 )
							if( upperBB <= 172.623 )
								if( dev <= 1.12101 )
									ret := 0.000000
								if( dev > 1.12101 )
									ret := 0.820513 // buy
							if( upperBB > 172.623 )
								ret := -0.200000
						if( priceRange > 1.045 )
							if( avgHighLow <= 169.44 )
								if( lowerBB <= 166.302 )
									ret := 0.500000
								if( lowerBB > 166.302 )
									ret := -1.000000 // sell
							if( avgHighLow > 169.44 )
								if( upperKC <= 171.891 )
									ret := 1.000000 // buy
								if( upperKC > 171.891 )
									ret := -0.250000
					if( val > -0.071981 )
						if( basis <= 171.404 )
							if( priceRange <= 1.14253 )
								if( priceRange <= 0.52 )
									ret := -0.090909
								if( priceRange > 0.52 )
									ret := 0.600000
							if( priceRange > 1.14253 )
								ret := -0.833333 // sell
						if( basis > 171.404 )
							if( lowerBB <= 170.608 )
								ret := -1.000000 // sell
							if( lowerBB > 170.608 )
								if( basis <= 171.606 )
									ret := -0.500000
								if( basis > 171.606 )
									ret := -1.000000 // sell
				if( upperBB > 172.685 )
					if( rangema <= 0.657639 )
						if( upperKC <= 172.145 )
							if( upperBB <= 172.993 )
								if( upperBB <= 172.835 )
									ret := -0.750000 // sell
								if( upperBB > 172.835 )
									ret := -1.000000 // sell
							if( upperBB > 172.993 )
								ret := 0.500000
						if( upperKC > 172.145 )
							if( upperKC <= 172.475 )
								if( ma <= 171.528 )
									ret := 0.200000
								if( ma > 171.528 )
									ret := 1.000000 // buy
							if( upperKC > 172.475 )
								if( avgHighLow <= 172.282 )
									ret := -0.470588
								if( avgHighLow > 172.282 )
									ret := 0.000000
					if( rangema > 0.657639 )
						if( lowerBB <= 165.061 )
							if( avgHighLow <= 168.457 )
								if( ma <= 168.42 )
									ret := -1.000000 // sell
								if( ma > 168.42 )
									ret := -0.200000
							if( avgHighLow > 168.457 )
								ret := 1.000000 // buy
						if( lowerBB > 165.061 )
							if( upperKC <= 172.635 )
								if( priceRange <= 0.491364 )
									ret := 0.714286 // buy
								if( priceRange > 0.491364 )
									ret := -0.819444 // sell
							if( upperKC > 172.635 )
								if( dev <= 1.20979 )
									ret := -0.600000
								if( dev > 1.20979 )
									ret := -0.933884 // sell
			if( lowerBB > 170.813 )
				if( dev <= 1.31551 )
					if( upperBB <= 179.114 )
						if( upperKC <= 172.69 )
							if( avgHighLow <= 171.765 )
								if( lowerKC <= 170.987 )
									ret := 0.142857
								if( lowerKC > 170.987 )
									ret := -0.791667 // sell
							if( avgHighLow > 171.765 )
								if( dev <= 0.545008 )
									ret := -0.023810
								if( dev > 0.545008 )
									ret := -0.785714 // sell
						if( upperKC > 172.69 )
							if( ma <= 177.381 )
								if( upperBB <= 176.989 )
									ret := 0.112169
								if( upperBB > 176.989 )
									ret := -0.233596
							if( ma > 177.381 )
								if( ma <= 177.601 )
									ret := 0.571429
								if( ma > 177.601 )
									ret := 0.062305
					if( upperBB > 179.114 )
						if( upperBB <= 195.992 )
							if( rangema <= 0.272356 )
								if( rangema <= 0.053689 )
									ret := 0.952381 // buy
								if( rangema > 0.053689 )
									ret := -0.043738
							if( rangema > 0.272356 )
								if( rangema <= 0.580101 )
									ret := -0.437500
								if( rangema > 0.580101 )
									ret := -0.122124
						if( upperBB > 195.992 )
							if( upperBB <= 202.436 )
								if( upperBB <= 201.74 )
									ret := 0.132353
								if( upperBB > 201.74 )
									ret := 0.826667 // buy
							if( upperBB > 202.436 )
								if( dev <= 0.657264 )
									ret := 0.178571
								if( dev > 0.657264 )
									ret := -0.209302
				if( dev > 1.31551 )
					if( upperKC <= 212.891 )
						if( rangema <= 0.900064 )
							if( avgHighLow <= 174.863 )
								if( rangema <= 0.578677 )
									ret := -0.236842
								if( rangema > 0.578677 )
									ret := 0.460526
							if( avgHighLow > 174.863 )
								if( lowerBB <= 174.197 )
									ret := -0.807692 // sell
								if( lowerBB > 174.197 )
									ret := -0.159091
						if( rangema > 0.900064 )
							if( upperBB <= 192.737 )
								if( upperKC <= 180.089 )
									ret := 0.508108
								if( upperKC > 180.089 )
									ret := 0.111111
							if( upperBB > 192.737 )
								if( priceRange <= 0.890613 )
									ret := 0.307692
								if( priceRange > 0.890613 )
									ret := 0.700599 // buy
					if( upperKC > 212.891 )
						if( lowerBB <= 208.273 )
							if( upperKC <= 216.709 )
								ret := -1.000000 // sell
							if( upperKC > 216.709 )
								if( rangema <= 2.28129 )
									ret := 1.000000 // buy
								if( rangema > 2.28129 )
									ret := 0.000000
						if( lowerBB > 208.273 )
							if( ma <= 218.158 )
								if( ma <= 211.812 )
									ret := -0.769231 // sell
								if( ma > 211.812 )
									ret := 0.555556
							if( ma > 218.158 )
								if( priceRange <= 3.01084 )
									ret := -1.000000 // sell
								if( priceRange > 3.01084 )
									ret := -0.250000
	if( val > -0.00333 )
		if( rangema <= 1.2948 )
			if( dev <= 1.24644 )
				if( dev <= 0.925387 )
					if( lowerKC <= 185.301 )
						if( upperKC <= 184.019 )
							if( val <= 0.165405 )
								if( lowerBB <= 94.4833 )
									ret := 0.181690
								if( lowerBB > 94.4833 )
									ret := 0.064095
							if( val > 0.165405 )
								if( ma <= 172.199 )
									ret := -0.553398
								if( ma > 172.199 )
									ret := 0.282051
						if( upperKC > 184.019 )
							if( lowerKC <= 183.183 )
								if( lowerBB <= 182.299 )
									ret := -0.142857
								if( lowerBB > 182.299 )
									ret := -0.875000 // sell
							if( lowerKC > 183.183 )
								if( basis <= 183.963 )
									ret := 0.518519
								if( basis > 183.963 )
									ret := -0.500000
					if( lowerKC > 185.301 )
						if( lowerBB <= 185.982 )
							if( lowerBB <= 185.807 )
								if( val <= 0.048843 )
									ret := 0.882353 // buy
								if( val > 0.048843 )
									ret := 0.000000
							if( lowerBB > 185.807 )
								if( priceRange <= 0.389831 )
									ret := 0.947368 // buy
								if( priceRange > 0.389831 )
									ret := 0.666667
						if( lowerBB > 185.982 )
							if( dev <= 0.667981 )
								if( lowerKC <= 193.783 )
									ret := -0.080000
								if( lowerKC > 193.783 )
									ret := 0.400000
							if( dev > 0.667981 )
								if( upperKC <= 196.09 )
									ret := 0.494118
								if( upperKC > 196.09 )
									ret := -0.027778
				if( dev > 0.925387 )
					if( rangema <= 0.985925 )
						if( upperBB <= 104.599 )
							if( upperKC <= 103.098 )
								if( rangema <= 0.680955 )
									ret := -0.017751
								if( rangema > 0.680955 )
									ret := -0.956522 // sell
							if( upperKC > 103.098 )
								if( lowerKC <= 102.516 )
									ret := -0.875000 // sell
								if( lowerKC > 102.516 )
									ret := 0.000000
						if( upperBB > 104.599 )
							if( ma <= 117.495 )
								if( upperKC <= 114.953 )
									ret := 0.112245
								if( upperKC > 114.953 )
									ret := 0.613139
							if( ma > 117.495 )
								if( upperKC <= 133.665 )
									ret := -0.269565
								if( upperKC > 133.665 )
									ret := 0.004955
					if( rangema > 0.985925 )
						if( lowerBB <= 152.962 )
							if( val <= 0.070436 )
								if( upperKC <= 136.901 )
									ret := -0.750000 // sell
								if( upperKC > 136.901 )
									ret := -1.000000 // sell
							if( val > 0.070436 )
								ret := 0.400000
						if( lowerBB > 152.962 )
							if( lowerKC <= 174.799 )
								if( rangema <= 0.996219 )
									ret := 0.272727
								if( rangema > 0.996219 )
									ret := 0.910448 // buy
							if( lowerKC > 174.799 )
								if( lowerKC <= 192.991 )
									ret := -0.366667
								if( lowerKC > 192.991 )
									ret := 0.750000 // buy
			if( dev > 1.24644 )
				if( avgHighLow <= 103.829 )
					if( dev <= 4.34827 )
						if( val <= 0.184568 )
							if( upperBB <= 87.1563 )
								if( ma <= 84.0325 )
									ret := 1.000000 // buy
								if( ma > 84.0325 )
									ret := -0.444444
							if( upperBB > 87.1563 )
								if( upperBB <= 101.212 )
									ret := 0.646341
								if( upperBB > 101.212 )
									ret := 0.855422 // buy
						if( val > 0.184568 )
							if( upperKC <= 104.961 )
								if( priceRange <= 0.335 )
									ret := 0.500000
								if( priceRange > 0.335 )
									ret := -0.166667
							if( upperKC > 104.961 )
								ret := 0.800000 // buy
					if( dev > 4.34827 )
						if( avgHighLow <= 86.9904 )
							ret := -0.750000 // sell
						if( avgHighLow > 86.9904 )
							ret := -1.000000 // sell
				if( avgHighLow > 103.829 )
					if( lowerBB <= 206.287 )
						if( avgHighLow <= 182.571 )
							if( avgHighLow <= 172.312 )
								if( val <= 0.096649 )
									ret := 0.139423
								if( val > 0.096649 )
									ret := -0.031788
							if( avgHighLow > 172.312 )
								if( priceRange <= 1.10075 )
									ret := 0.223958
								if( priceRange > 1.10075 )
									ret := 0.608466
						if( avgHighLow > 182.571 )
							if( avgHighLow <= 186.085 )
								if( val <= 0.220136 )
									ret := -0.584615
								if( val > 0.220136 )
									ret := -1.000000 // sell
							if( avgHighLow > 186.085 )
								if( lowerKC <= 185.718 )
									ret := 0.886364 // buy
								if( lowerKC > 185.718 )
									ret := -0.053968
					if( lowerBB > 206.287 )
						if( rangema <= 0.963427 )
							if( avgHighLow <= 210.121 )
								if( lowerBB <= 207.691 )
									ret := -0.250000
								if( lowerBB > 207.691 )
									ret := 0.666667
							if( avgHighLow > 210.121 )
								if( lowerBB <= 208.925 )
									ret := -0.888889 // sell
								if( lowerBB > 208.925 )
									ret := -0.272727
						if( rangema > 0.963427 )
							if( dev <= 1.6291 )
								if( upperKC <= 211.85 )
									ret := 0.933333 // buy
								if( upperKC > 211.85 )
									ret := 0.454545
							if( dev > 1.6291 )
								if( avgHighLow <= 213.255 )
									ret := -0.555556
								if( avgHighLow > 213.255 )
									ret := 0.851852 // buy
		if( rangema > 1.2948 )
			if( lowerBB <= 145.905 )
				if( rangema <= 1.40393 )
					if( lowerKC <= 113.185 )
						ret := 1.000000 // buy
					if( lowerKC > 113.185 )
						if( dev <= 1.54358 )
							ret := -0.800000 // sell
						if( dev > 1.54358 )
							ret := -1.000000 // sell
				if( rangema > 1.40393 )
					if( lowerBB <= 119.402 )
						if( val <= 0.091512 )
							ret := -1.000000 // sell
						if( val > 0.091512 )
							if( val <= 0.190495 )
								if( priceRange <= 1.14244 )
									ret := 1.000000 // buy
								if( priceRange > 1.14244 )
									ret := 0.200000
							if( val > 0.190495 )
								if( upperBB <= 122.916 )
									ret := -0.500000
								if( upperBB > 122.916 )
									ret := -0.200000
					if( lowerBB > 119.402 )
						if( rangema <= 1.63223 )
							if( lowerKC <= 131.573 )
								if( basis <= 126.558 )
									ret := 0.500000
								if( basis > 126.558 )
									ret := -0.714286 // sell
							if( lowerKC > 131.573 )
								if( ma <= 134.081 )
									ret := 1.000000 // buy
								if( ma > 134.081 )
									ret := 0.500000
						if( rangema > 1.63223 )
							if( val <= 0.060225 )
								if( basis <= 124.12 )
									ret := 1.000000 // buy
								if( basis > 124.12 )
									ret := -0.166667
							if( val > 0.060225 )
								if( dev <= 6.26242 )
									ret := 0.966102 // buy
								if( dev > 6.26242 )
									ret := 0.733333 // buy
			if( lowerBB > 145.905 )
				if( upperKC <= 163.83 )
					ret := -1.000000 // sell
				if( upperKC > 163.83 )
					if( upperBB <= 209.823 )
						if( upperBB <= 203.696 )
							if( priceRange <= 0.615 )
								if( rangema <= 1.36942 )
									ret := 1.000000 // buy
								if( rangema > 1.36942 )
									ret := 0.400000
							if( priceRange > 0.615 )
								if( dev <= 0.905259 )
									ret := 0.857143 // buy
								if( dev > 0.905259 )
									ret := -0.506329
						if( upperBB > 203.696 )
							if( sqzOnInt <= 0.5 )
								if( priceRange <= 2.01145 )
									ret := 0.846154 // buy
								if( priceRange > 2.01145 )
									ret := 0.000000
							if( sqzOnInt > 0.5 )
								ret := 1.000000 // buy
					if( upperBB > 209.823 )
						if( lowerBB <= 211.018 )
							if( lowerBB <= 208.56 )
								ret := -1.000000 // sell
							if( lowerBB > 208.56 )
								if( avgHighLow <= 219.376 )
									ret := -0.500000
								if( avgHighLow > 219.376 )
									ret := -1.000000 // sell
						if( lowerBB > 211.018 )
							ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMD_5Min_8decdda2(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


