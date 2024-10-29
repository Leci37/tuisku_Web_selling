//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: AMZN_5Min_1SQU_fbb8a18c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_1SQU_fbb8a18c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_fbb8a18c(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( upperBB <= 187.098 )
		if( val <= 0.004834 )
			if( dev <= 1.36927 )
				if( upperBB <= 129.506 )
					if( avgHighLow <= 128.77 )
						if( dev <= 0.762804 )
							if( upperBB <= 127.413 )
								if( upperBB <= 127.128 )
									ret := 0.053019
								if( upperBB > 127.128 )
									ret := 0.307443
							if( upperBB > 127.413 )
								if( upperKC <= 128.908 )
									ret := -0.042837
								if( upperKC > 128.908 )
									ret := -0.296029
						if( dev > 0.762804 )
							if( val <= -0.08062 )
								if( avgHighLow <= 109.347 )
									ret := -0.294118
								if( avgHighLow > 109.347 )
									ret := 0.677215
							if( val > -0.08062 )
								if( rangema <= 0.557998 )
									ret := 0.035667
								if( rangema > 0.557998 )
									ret := 0.627907
					if( avgHighLow > 128.77 )
						if( upperBB <= 129.374 )
							if( lowerKC <= 128.702 )
								if( rangema <= 0.29439 )
									ret := 0.727273 // buy
								if( rangema > 0.29439 )
									ret := -0.083333
							if( lowerKC > 128.702 )
								if( avgHighLow <= 129.265 )
									ret := 0.192308
								if( avgHighLow > 129.265 )
									ret := 0.866667 // buy
						if( upperBB > 129.374 )
							if( val <= -0.022106 )
								if( lowerKC <= 128.691 )
									ret := 0.600000
								if( lowerKC > 128.691 )
									ret := 0.333333
							if( val > -0.022106 )
								if( avgHighLow <= 128.957 )
									ret := 0.500000
								if( avgHighLow > 128.957 )
									ret := -0.213740
				if( upperBB > 129.506 )
					if( lowerBB <= 131.94 )
						if( lowerKC <= 128.938 )
							if( lowerKC <= 128.272 )
								if( priceRange <= 0.466846 )
									ret := -0.195652
								if( priceRange > 0.466846 )
									ret := 0.666667
							if( lowerKC > 128.272 )
								if( priceRange <= 0.369128 )
									ret := -0.277512
								if( priceRange > 0.369128 )
									ret := -0.728814 // sell
						if( lowerKC > 128.938 )
							if( lowerKC <= 129.246 )
								if( dev <= 0.344967 )
									ret := -0.149254
								if( dev > 0.344967 )
									ret := 0.439791
							if( lowerKC > 129.246 )
								if( basis <= 132.906 )
									ret := -0.117037
								if( basis > 132.906 )
									ret := -0.941176 // sell
					if( lowerBB > 131.94 )
						if( upperBB <= 186.821 )
							if( dev <= 0.090106 )
								if( avgHighLow <= 186.065 )
									ret := 0.104167
								if( avgHighLow > 186.065 )
									ret := -0.517857
							if( dev > 0.090106 )
								if( upperKC <= 186.72 )
									ret := -0.017566
								if( upperKC > 186.72 )
									ret := -0.441176
						if( upperBB > 186.821 )
							if( avgHighLow <= 185.971 )
								ret := -0.714286 // sell
							if( avgHighLow > 185.971 )
								if( ma <= 186.374 )
									ret := 0.859649 // buy
								if( ma > 186.374 )
									ret := 0.163333
			if( dev > 1.36927 )
				if( priceRange <= 0.179693 )
					if( upperKC <= 174.932 )
						ret := 0.000000
					if( upperKC > 174.932 )
						if( rangema <= 0.55 )
							ret := 0.777778 // buy
						if( rangema > 0.55 )
							ret := 1.000000 // buy
				if( priceRange > 0.179693 )
					if( ma <= 179.787 )
						if( dev <= 3.90658 )
							if( rangema <= 1.49594 )
								if( lowerKC <= 105.239 )
									ret := -1.000000 // sell
								if( lowerKC > 105.239 )
									ret := -0.272131
							if( rangema > 1.49594 )
								if( sqzOffInt <= 0.5 )
									ret := -0.258929
								if( sqzOffInt > 0.5 )
									ret := 0.577778
						if( dev > 3.90658 )
							if( upperBB <= 120.799 )
								ret := -0.294118
							if( upperBB > 120.799 )
								if( upperKC <= 183.291 )
									ret := -1.000000 // sell
								if( upperKC > 183.291 )
									ret := -0.545455
					if( ma > 179.787 )
						if( avgHighLow <= 185.29 )
							if( lowerBB <= 179.282 )
								if( lowerBB <= 177.545 )
									ret := 0.822581 // buy
								if( lowerBB > 177.545 )
									ret := 0.439394
							if( lowerBB > 179.282 )
								if( lowerKC <= 183.52 )
									ret := -0.305556
								if( lowerKC > 183.52 )
									ret := 0.639344
						if( avgHighLow > 185.29 )
							if( lowerBB <= 183.791 )
								ret := -1.000000 // sell
							if( lowerBB > 183.791 )
								ret := -0.888889 // sell
		if( val > 0.004834 )
			if( lowerBB <= 106.02 )
				if( upperBB <= 103.859 )
					if( lowerKC <= 102.328 )
						if( ma <= 102.261 )
							if( upperBB <= 101.784 )
								if( lowerKC <= 101.124 )
									ret := 0.250000
								if( lowerKC > 101.124 )
									ret := 0.000000
							if( upperBB > 101.784 )
								if( upperBB <= 102.261 )
									ret := 0.833333 // buy
								if( upperBB > 102.261 )
									ret := 0.400000
						if( ma > 102.261 )
							if( dev <= 0.278596 )
								ret := -1.000000 // sell
							if( dev > 0.278596 )
								if( basis <= 102.62 )
									ret := -1.000000 // sell
								if( basis > 102.62 )
									ret := -0.400000
					if( lowerKC > 102.328 )
						if( avgHighLow <= 103.405 )
							if( upperBB <= 103.126 )
								if( lowerKC <= 102.505 )
									ret := 1.000000 // buy
								if( lowerKC > 102.505 )
									ret := 0.923077 // buy
							if( upperBB > 103.126 )
								if( upperBB <= 103.644 )
									ret := 0.537313
								if( upperBB > 103.644 )
									ret := 0.962963 // buy
						if( avgHighLow > 103.405 )
							if( upperKC <= 103.7 )
								ret := 0.100000
							if( upperKC > 103.7 )
								ret := 0.625000
				if( upperBB > 103.859 )
					if( ma <= 105.737 )
						if( avgHighLow <= 105.352 )
							if( priceRange <= 0.180333 )
								if( dev <= 0.8271 )
									ret := -0.123288
								if( dev > 0.8271 )
									ret := 0.900000 // buy
							if( priceRange > 0.180333 )
								if( upperKC <= 106.265 )
									ret := -0.639610
								if( upperKC > 106.265 )
									ret := 0.785714 // buy
						if( avgHighLow > 105.352 )
							if( upperBB <= 106.038 )
								if( rangema <= 0.23901 )
									ret := -0.125000
								if( rangema > 0.23901 )
									ret := 0.750000 // buy
							if( upperBB > 106.038 )
								if( ma <= 105.603 )
									ret := 0.872727 // buy
								if( ma > 105.603 )
									ret := 0.055556
					if( ma > 105.737 )
						if( lowerBB <= 105.829 )
							if( basis <= 106.176 )
								if( lowerBB <= 105.083 )
									ret := -0.470588
								if( lowerBB > 105.083 )
									ret := -0.817518 // sell
							if( basis > 106.176 )
								if( rangema <= 1.735 )
									ret := -1.000000 // sell
								if( rangema > 1.735 )
									ret := -0.818182 // sell
						if( lowerBB > 105.829 )
							if( upperKC <= 106.792 )
								ret := -0.875000 // sell
							if( upperKC > 106.792 )
								ret := 0.444444
			if( lowerBB > 106.02 )
				if( basis <= 176.006 )
					if( basis <= 175.946 )
						if( avgHighLow <= 176.412 )
							if( upperKC <= 107.888 )
								if( priceRange <= 0.091448 )
									ret := 0.015873
								if( priceRange > 0.091448 )
									ret := 0.739583 // buy
							if( upperKC > 107.888 )
								if( avgHighLow <= 176.027 )
									ret := 0.031377
								if( avgHighLow > 176.027 )
									ret := 0.780488 // buy
						if( avgHighLow > 176.412 )
							if( basis <= 175.218 )
								ret := -1.000000 // sell
							if( basis > 175.218 )
								ret := 0.333333
					if( basis > 175.946 )
						if( avgHighLow <= 175.941 )
							if( lowerKC <= 175.628 )
								if( basis <= 175.984 )
									ret := -1.000000 // sell
								if( basis > 175.984 )
									ret := -0.900000 // sell
							if( lowerKC > 175.628 )
								ret := -0.727273 // sell
						if( avgHighLow > 175.941 )
							ret := -0.083333
				if( basis > 176.006 )
					if( basis <= 176.9 )
						if( dev <= 0.334033 )
							if( ma <= 176.131 )
								ret := -0.461538
							if( ma > 176.131 )
								if( lowerBB <= 176.534 )
									ret := 0.765823 // buy
								if( lowerBB > 176.534 )
									ret := 0.409091
						if( dev > 0.334033 )
							if( upperBB <= 177.29 )
								if( priceRange <= 0.275082 )
									ret := 0.337278
								if( priceRange > 0.275082 )
									ret := -0.257485
							if( upperBB > 177.29 )
								if( basis <= 176.646 )
									ret := 0.542553
								if( basis > 176.646 )
									ret := 0.154639
					if( basis > 176.9 )
						if( priceRange <= 0.827543 )
							if( ma <= 179.45 )
								if( ma <= 178.383 )
									ret := 0.111111
								if( ma > 178.383 )
									ret := -0.181185
							if( ma > 179.45 )
								if( avgHighLow <= 179.346 )
									ret := -0.653846
								if( avgHighLow > 179.346 )
									ret := 0.132441
						if( priceRange > 0.827543 )
							if( priceRange <= 3.82533 )
								if( dev <= 2.98095 )
									ret := -0.111111
								if( dev > 2.98095 )
									ret := -0.846154 // sell
							if( priceRange > 3.82533 )
								if( ma <= 179.456 )
									ret := -1.000000 // sell
								if( ma > 179.456 )
									ret := -0.625000
	if( upperBB > 187.098 )
		if( rangema <= 0.156801 )
			if( rangema <= 0.099532 )
				if( upperBB <= 194.131 )
					if( lowerKC <= 193.457 )
						if( dev <= 0.103857 )
							if( upperBB <= 193.318 )
								if( ma <= 187.824 )
									ret := -0.044776
								if( ma > 187.824 )
									ret := 0.000000
							if( upperBB > 193.318 )
								ret := 0.700000 // buy
						if( dev > 0.103857 )
							if( rangema <= 0.079919 )
								if( basis <= 188.962 )
									ret := -0.448276
								if( basis > 188.962 )
									ret := -0.180556
							if( rangema > 0.079919 )
								if( priceRange <= 0.086558 )
									ret := 0.047059
								if( priceRange > 0.086558 )
									ret := -0.239583
					if( lowerKC > 193.457 )
						ret := -1.000000 // sell
				if( upperBB > 194.131 )
					if( upperBB <= 194.753 )
						if( upperKC <= 194.467 )
							ret := 0.000000
						if( upperKC > 194.467 )
							ret := 1.000000 // buy
					if( upperBB > 194.753 )
						if( basis <= 195.452 )
							if( ma <= 195.413 )
								ret := -0.083333
							if( ma > 195.413 )
								ret := -1.000000 // sell
						if( basis > 195.452 )
							if( ma <= 197.812 )
								if( upperKC <= 197.596 )
									ret := 0.000000
								if( upperKC > 197.596 )
									ret := 0.764706 // buy
							if( ma > 197.812 )
								if( upperKC <= 198.879 )
									ret := -0.225000
								if( upperKC > 198.879 )
									ret := 0.100418
			if( rangema > 0.099532 )
				if( lowerBB <= 193.977 )
					if( dev <= 0.231769 )
						if( val <= 0.011099 )
							if( lowerKC <= 186.875 )
								if( sqzOffInt <= 0.5 )
									ret := 0.909091 // buy
								if( sqzOffInt > 0.5 )
									ret := 0.545455
							if( lowerKC > 186.875 )
								if( lowerBB <= 188.988 )
									ret := -0.133333
								if( lowerBB > 188.988 )
									ret := 0.326241
						if( val > 0.011099 )
							if( priceRange <= 0.184582 )
								if( basis <= 187.887 )
									ret := 0.300000
								if( basis > 187.887 )
									ret := -0.100000
							if( priceRange > 0.184582 )
								ret := -0.692308
					if( dev > 0.231769 )
						if( rangema <= 0.11362 )
							if( dev <= 0.280503 )
								if( basis <= 188.776 )
									ret := 0.901639 // buy
								if( basis > 188.776 )
									ret := 0.583333
							if( dev > 0.280503 )
								if( priceRange <= 0.115 )
									ret := 0.111111
								if( priceRange > 0.115 )
									ret := 0.461538
						if( rangema > 0.11362 )
							if( rangema <= 0.116446 )
								if( val <= 0.023843 )
									ret := 0.125000
								if( val > 0.023843 )
									ret := -0.750000 // sell
							if( rangema > 0.116446 )
								if( lowerKC <= 193.015 )
									ret := 0.154812
								if( lowerKC > 193.015 )
									ret := 0.604651
				if( lowerBB > 193.977 )
					if( val <= -0.000651 )
						if( ma <= 195.127 )
							if( lowerBB <= 194.522 )
								ret := -0.083333
							if( lowerBB > 194.522 )
								ret := -0.923077 // sell
						if( ma > 195.127 )
							if( dev <= 0.245787 )
								if( sqzOnInt <= 0.5 )
									ret := -0.538462
								if( sqzOnInt > 0.5 )
									ret := 0.015873
							if( dev > 0.245787 )
								if( dev <= 0.267161 )
									ret := 0.307692
								if( dev > 0.267161 )
									ret := 0.000000
					if( val > -0.000651 )
						if( upperBB <= 200.149 )
							if( lowerBB <= 198.472 )
								if( dev <= 0.26395 )
									ret := 0.360000
								if( dev > 0.26395 )
									ret := 0.000000
							if( lowerBB > 198.472 )
								if( upperBB <= 199.836 )
									ret := 0.400000
								if( upperBB > 199.836 )
									ret := 0.545455
						if( upperBB > 200.149 )
							ret := -0.300000
		if( rangema > 0.156801 )
			if( rangema <= 0.46166 )
				if( rangema <= 0.4476 )
					if( lowerBB <= 186.216 )
						if( upperBB <= 187.167 )
							if( avgHighLow <= 186.362 )
								if( lowerBB <= 185.454 )
									ret := -0.400000
								if( lowerBB > 185.454 )
									ret := -0.896552 // sell
							if( avgHighLow > 186.362 )
								ret := 0.705882 // buy
						if( upperBB > 187.167 )
							if( avgHighLow <= 186.33 )
								if( basis <= 186.17 )
									ret := 0.230769
								if( basis > 186.17 )
									ret := 0.880952 // buy
							if( avgHighLow > 186.33 )
								if( upperBB <= 187.7 )
									ret := 0.462585
								if( upperBB > 187.7 )
									ret := -0.589286
					if( lowerBB > 186.216 )
						if( lowerBB <= 187.512 )
							if( val <= -0.036637 )
								if( priceRange <= 0.511391 )
									ret := -0.238889
								if( priceRange > 0.511391 )
									ret := 0.714286 // buy
							if( val > -0.036637 )
								if( upperBB <= 187.641 )
									ret := -0.200000
								if( upperBB > 187.641 )
									ret := -0.391374
						if( lowerBB > 187.512 )
							if( avgHighLow <= 198.613 )
								if( upperKC <= 198.201 )
									ret := -0.072654
								if( upperKC > 198.201 )
									ret := 0.661111
							if( avgHighLow > 198.613 )
								if( val <= -0.06506 )
									ret := 0.666667
								if( val > -0.06506 )
									ret := -0.343158
				if( rangema > 0.4476 )
					if( lowerBB <= 188.748 )
						if( dev <= 0.626258 )
							if( upperBB <= 188.726 )
								ret := 0.550000
							if( upperBB > 188.726 )
								ret := 1.000000 // buy
						if( dev > 0.626258 )
							if( upperBB <= 187.748 )
								if( ma <= 186.612 )
									ret := -0.125000
								if( ma > 186.612 )
									ret := -0.666667
							if( upperBB > 187.748 )
								if( lowerBB <= 186.321 )
									ret := 0.875000 // buy
								if( lowerBB > 186.321 )
									ret := 0.285714
					if( lowerBB > 188.748 )
						if( rangema <= 0.450575 )
							if( upperBB <= 198.708 )
								ret := 0.066667
							if( upperBB > 198.708 )
								ret := 1.000000 // buy
						if( rangema > 0.450575 )
							if( upperBB <= 196.569 )
								if( avgHighLow <= 194.564 )
									ret := -0.700000 // sell
								if( avgHighLow > 194.564 )
									ret := -1.000000 // sell
							if( upperBB > 196.569 )
								if( avgHighLow <= 198.713 )
									ret := 0.866667 // buy
								if( avgHighLow > 198.713 )
									ret := 0.066667
			if( rangema > 0.46166 )
				if( ma <= 186.609 )
					if( rangema <= 0.608368 )
						if( dev <= 1.42114 )
							if( priceRange <= 0.324458 )
								if( lowerKC <= 185.719 )
									ret := -1.000000 // sell
								if( lowerKC > 185.719 )
									ret := -0.444444
							if( priceRange > 0.324458 )
								if( val <= 0.049369 )
									ret := -0.992537 // sell
								if( val > 0.049369 )
									ret := -0.833333 // sell
						if( dev > 1.42114 )
							if( lowerBB <= 184.133 )
								ret := -0.583333
							if( lowerBB > 184.133 )
								ret := 0.545455
					if( rangema > 0.608368 )
						if( priceRange <= 0.465611 )
							if( val <= -0.168203 )
								ret := 1.000000 // buy
							if( val > -0.168203 )
								ret := 0.400000
						if( priceRange > 0.465611 )
							if( rangema <= 0.723907 )
								if( lowerKC <= 185.017 )
									ret := 0.472222
								if( lowerKC > 185.017 )
									ret := -0.733333 // sell
							if( rangema > 0.723907 )
								if( basis <= 186.046 )
									ret := -1.000000 // sell
								if( basis > 186.046 )
									ret := -0.600000
				if( ma > 186.609 )
					if( avgHighLow <= 197.175 )
						if( lowerBB <= 194.312 )
							if( dev <= 0.634555 )
								if( basis <= 187.196 )
									ret := 0.718750 // buy
								if( basis > 187.196 )
									ret := 0.045455
							if( dev > 0.634555 )
								if( lowerKC <= 187.005 )
									ret := 0.006550
								if( lowerKC > 187.005 )
									ret := -0.332847
						if( lowerBB > 194.312 )
							if( avgHighLow <= 195.883 )
								if( lowerBB <= 194.334 )
									ret := 1.000000 // buy
								if( lowerBB > 194.334 )
									ret := -0.086420
							if( avgHighLow > 195.883 )
								if( dev <= 1.1138 )
									ret := 0.864407 // buy
								if( dev > 1.1138 )
									ret := 0.357143
					if( avgHighLow > 197.175 )
						if( rangema <= 0.556578 )
							if( dev <= 1.26654 )
								if( basis <= 198.313 )
									ret := 0.375000
								if( basis > 198.313 )
									ret := -0.625000
							if( dev > 1.26654 )
								if( dev <= 1.29654 )
									ret := 0.800000 // buy
								if( dev > 1.29654 )
									ret := 0.210526
						if( rangema > 0.556578 )
							if( lowerKC <= 196.777 )
								if( dev <= 1.12635 )
									ret := -1.000000 // sell
								if( dev > 1.12635 )
									ret := -0.862745 // sell
							if( lowerKC > 196.777 )
								if( upperBB <= 199.925 )
									ret := 0.057692
								if( upperBB > 199.925 )
									ret := -0.768116 // sell
	
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
float op_operation = decision_tree_0_AMZN_5Min_fbb8a18c(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


