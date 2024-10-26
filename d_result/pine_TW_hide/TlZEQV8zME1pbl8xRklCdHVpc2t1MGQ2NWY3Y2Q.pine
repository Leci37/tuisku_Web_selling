//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: NVDA_30Min_1FIB_0d65f7cd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1FIB_0d65f7cd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_0d65f7cd(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lower_4 <= 101.204 )
		if( basis_max <= -2.90894 )
			if( lower_3 <= 101.886 )
				if( lower_1 <= 26.2245 )
					if( upper_6 <= 33.5701 )
						if( lower_3 <= 24.6951 )
							if( basis_max <= -3.84289 )
								if( lower_4 <= 24.0509 )
									ret := 0.736842 // buy
								if( lower_4 > 24.0509 )
									ret := 0.970588 // buy
							if( basis_max > -3.84289 )
								ret := 0.200000
						if( lower_3 > 24.6951 )
							if( lower_5 <= 23.9715 )
								if( lower_3 <= 24.7771 )
									ret := 0.052632
								if( lower_3 > 24.7771 )
									ret := 0.650000
							if( lower_5 > 23.9715 )
								ret := -1.000000 // sell
					if( upper_6 > 33.5701 )
						if( lower_6 <= -1110.93 )
							if( lower_6 <= -1327.75 )
								if( upper_2 <= 818.295 )
									ret := -0.800000 // sell
								if( upper_2 > 818.295 )
									ret := 0.235294
							if( lower_6 > -1327.75 )
								if( lower_3 <= -447.107 )
									ret := 0.757576 // buy
								if( lower_3 > -447.107 )
									ret := 0.000000
						if( lower_6 > -1110.93 )
							if( upper_5 <= 1005.31 )
								if( upper_1 <= 399.39 )
									ret := 0.000000
								if( upper_1 > 399.39 )
									ret := 0.857143 // buy
							if( upper_5 > 1005.31 )
								if( upper_4 <= 885.151 )
									ret := -1.000000 // sell
								if( upper_4 > 885.151 )
									ret := 0.000000
				if( lower_1 > 26.2245 )
					if( lower_4 <= 99.8446 )
						if( lower_1 <= 26.8352 )
							if( upper_3 <= 29.4254 )
								if( upper_4 <= 29.8514 )
									ret := -0.913043 // sell
								if( upper_4 > 29.8514 )
									ret := -0.428571
							if( upper_3 > 29.4254 )
								if( lower_1 <= 26.7693 )
									ret := 0.357143
								if( lower_1 > 26.7693 )
									ret := -0.750000 // sell
						if( lower_1 > 26.8352 )
							if( basis_max <= -4.12568 )
								if( lower_6 <= 95.0881 )
									ret := 0.118508
								if( lower_6 > 95.0881 )
									ret := 0.460000
							if( basis_max > -4.12568 )
								if( basis_minus <= 4.08543 )
									ret := 0.263348
								if( basis_minus > 4.08543 )
									ret := 0.709091 // buy
					if( lower_4 > 99.8446 )
						if( upper_3 <= 106.164 )
							if( lower_5 <= 100.214 )
								if( lower_1 <= 102.578 )
									ret := 0.750000 // buy
								if( lower_1 > 102.578 )
									ret := 0.357143
							if( lower_5 > 100.214 )
								ret := 0.000000
						if( upper_3 > 106.164 )
							if( lower_1 <= 102.799 )
								if( lower_5 <= 99.6141 )
									ret := -0.723684 // sell
								if( lower_5 > 99.6141 )
									ret := -0.033333
							if( lower_1 > 102.799 )
								if( basis_minus <= 5.8209 )
									ret := -0.488372
								if( basis_minus > 5.8209 )
									ret := 0.081181
			if( lower_3 > 101.886 )
				if( basis_max <= -13.8057 )
					if( lower_4 <= 100.09 )
						if( lower_5 <= -53.685 )
							if( lower_6 <= -270.162 )
								ret := 0.333333
							if( lower_6 > -270.162 )
								if( lower_6 <= -266.764 )
									ret := -1.000000 // sell
								if( lower_6 > -266.764 )
									ret := -0.250000
						if( lower_5 > -53.685 )
							if( lower_3 <= 102.055 )
								ret := 1.000000 // buy
							if( lower_3 > 102.055 )
								if( lower_6 <= 88.9257 )
									ret := 0.857143 // buy
								if( lower_6 > 88.9257 )
									ret := 0.296296
					if( lower_4 > 100.09 )
						if( lower_3 <= 103.457 )
							if( lower_5 <= 97.5445 )
								if( lower_1 <= 108.47 )
									ret := -0.142857
								if( lower_1 > 108.47 )
									ret := -0.736842 // sell
							if( lower_5 > 97.5445 )
								if( basis_minus <= 15.1672 )
									ret := -0.384615
								if( basis_minus > 15.1672 )
									ret := 0.576923
						if( lower_3 > 103.457 )
							if( lower_5 <= 95.7879 )
								if( lower_2 <= 108.218 )
									ret := 0.000000
								if( lower_2 > 108.218 )
									ret := 0.285714
							if( lower_5 > 95.7879 )
								if( lower_5 <= 95.82 )
									ret := 1.000000 // buy
								if( lower_5 > 95.82 )
									ret := 0.520000
				if( basis_max > -13.8057 )
					if( upper_2 <= 114.114 )
						if( lower_1 <= 105.476 )
							if( upper_2 <= 108.717 )
								ret := 1.000000 // buy
							if( upper_2 > 108.717 )
								if( upper_1 <= 108.136 )
									ret := -0.333333
								if( upper_1 > 108.136 )
									ret := 0.875000 // buy
						if( lower_1 > 105.476 )
							if( lower_2 <= 103.774 )
								ret := -0.200000
							if( lower_2 > 103.774 )
								ret := 0.500000
					if( upper_2 > 114.114 )
						if( basis <= 109.448 )
							ret := 1.000000 // buy
						if( basis > 109.448 )
							ret := 0.500000
		if( basis_max > -2.90894 )
			if( basis_minus <= 1.51591 )
				if( upper_4 <= 36.4032 )
					if( lower_6 <= 30.8482 )
						if( upper_5 <= 33.1625 )
							if( upper_1 <= 32.3565 )
								if( upper_2 <= 32.5688 )
									ret := 0.000000
								if( upper_2 > 32.5688 )
									ret := 0.862069 // buy
							if( upper_1 > 32.3565 )
								if( upper_4 <= 32.9618 )
									ret := 0.171429
								if( upper_4 > 32.9618 )
									ret := 0.857143 // buy
						if( upper_5 > 33.1625 )
							if( upper_2 <= 32.7266 )
								if( basis_minus <= 1.3675 )
									ret := -0.500000
								if( basis_minus > 1.3675 )
									ret := -0.937500 // sell
							if( upper_2 > 32.7266 )
								if( basis_max <= -1.37623 )
									ret := 1.000000 // buy
								if( basis_max > -1.37623 )
									ret := 0.111111
					if( lower_6 > 30.8482 )
						if( lower_4 <= 34.7701 )
							if( upper_3 <= 32.8968 )
								if( upper_2 <= 32.6701 )
									ret := 0.941176 // buy
								if( upper_2 > 32.6701 )
									ret := 0.300000
							if( upper_3 > 32.8968 )
								ret := 1.000000 // buy
						if( lower_4 > 34.7701 )
							if( upper_3 <= 36.1966 )
								if( upper_5 <= 36.3522 )
									ret := 0.000000
								if( upper_5 > 36.3522 )
									ret := 0.714286 // buy
							if( upper_3 > 36.1966 )
								if( lower_1 <= 35.5224 )
									ret := 0.250000
								if( lower_1 > 35.5224 )
									ret := 0.000000
				if( upper_4 > 36.4032 )
					if( lower_5 <= 45.8144 )
						if( basis_minus <= 0.90731 )
							if( upper_3 <= 37.1208 )
								if( basis_minus <= 0.85304 )
									ret := 0.250000
								if( basis_minus > 0.85304 )
									ret := 0.937500 // buy
							if( upper_3 > 37.1208 )
								ret := 0.000000
						if( basis_minus > 0.90731 )
							if( basis_minus <= 0.978987 )
								if( upper_6 <= 37.683 )
									ret := -0.250000
								if( upper_6 > 37.683 )
									ret := -0.969697 // sell
							if( basis_minus > 0.978987 )
								if( upper_6 <= 47.7264 )
									ret := 0.064378
								if( upper_6 > 47.7264 )
									ret := -0.229167
					if( lower_5 > 45.8144 )
						if( upper_6 <= 48.419 )
							if( basis_minus <= 1.37871 )
								if( lower_5 <= 46.0939 )
									ret := 0.880597 // buy
								if( lower_5 > 46.0939 )
									ret := 0.000000
							if( basis_minus > 1.37871 )
								ret := 0.000000
						if( upper_6 > 48.419 )
							if( lower_2 <= 46.7089 )
								if( lower_6 <= 45.7691 )
									ret := 0.038462
								if( lower_6 > 45.7691 )
									ret := 0.800000 // buy
							if( lower_2 > 46.7089 )
								if( lower_5 <= 60.964 )
									ret := -0.600000
								if( lower_5 > 60.964 )
									ret := 0.000000
			if( basis_minus > 1.51591 )
				if( lower_4 <= 65.5893 )
					if( upper_6 <= 49.099 )
						if( upper_6 <= 48.2665 )
							if( upper_4 <= 29.2943 )
								if( upper_4 <= 29.2238 )
									ret := 0.322581
								if( upper_4 > 29.2238 )
									ret := -0.692308
							if( upper_4 > 29.2943 )
								if( lower_5 <= 26.3873 )
									ret := 0.424242
								if( lower_5 > 26.3873 )
									ret := -0.003058
						if( upper_6 > 48.2665 )
							if( basis_minus <= 1.70547 )
								if( upper_6 <= 48.8148 )
									ret := -0.918919 // sell
								if( upper_6 > 48.8148 )
									ret := -0.333333
							if( basis_minus > 1.70547 )
								if( upper_4 <= 47.3788 )
									ret := -0.750000 // sell
								if( upper_4 > 47.3788 )
									ret := -0.033333
					if( upper_6 > 49.099 )
						if( upper_3 <= 62.8379 )
							if( upper_2 <= 47.4592 )
								if( basis_minus <= 2.66944 )
									ret := 0.600000
								if( basis_minus > 2.66944 )
									ret := 1.000000 // buy
							if( upper_2 > 47.4592 )
								if( lower_2 <= 52.5325 )
									ret := -0.030303
								if( lower_2 > 52.5325 )
									ret := 0.461538
						if( upper_3 > 62.8379 )
							if( lower_5 <= 64.3362 )
								if( lower_5 <= 60.9996 )
									ret := -0.149780
								if( lower_5 > 60.9996 )
									ret := -0.843750 // sell
							if( lower_5 > 64.3362 )
								if( lower_4 <= 64.9274 )
									ret := 0.636364
								if( lower_4 > 64.9274 )
									ret := 0.162791
				if( lower_4 > 65.5893 )
					if( upper_6 <= 95.3331 )
						if( lower_2 <= 66.4517 )
							ret := -1.000000 // sell
						if( lower_2 > 66.4517 )
							if( basis <= 67.7367 )
								if( upper_4 <= 69.3279 )
									ret := -0.051282
								if( upper_4 > 69.3279 )
									ret := 0.500000
							if( basis > 67.7367 )
								if( upper_2 <= 94.1206 )
									ret := -0.764706 // sell
								if( upper_2 > 94.1206 )
									ret := -0.375000
					if( upper_6 > 95.3331 )
						if( lower_6 <= 90.2994 )
							ret := 1.000000 // buy
						if( lower_6 > 90.2994 )
							if( upper_5 <= 94.9921 )
								ret := -0.250000
							if( upper_5 > 94.9921 )
								ret := 0.000000
	if( lower_4 > 101.204 )
		if( lower_5 <= 100.973 )
			if( lower_6 <= 96.3007 )
				if( lower_6 <= 94.8589 )
					if( lower_6 <= 91.0228 )
						if( basis_minus <= 33.9988 )
							if( lower_4 <= 102.238 )
								ret := -0.250000
							if( lower_4 > 102.238 )
								if( basis_minus <= 33.3167 )
									ret := 0.250000
								if( basis_minus > 33.3167 )
									ret := 0.000000
						if( basis_minus > 33.9988 )
							if( lower_5 <= 96.5564 )
								if( lower_6 <= -119.34 )
									ret := -0.111111
								if( lower_6 > -119.34 )
									ret := 0.384615
							if( lower_5 > 96.5564 )
								ret := 1.000000 // buy
					if( lower_6 > 91.0228 )
						if( upper_5 <= 135.245 )
							if( lower_1 <= 110.112 )
								if( lower_1 <= 109.923 )
									ret := -0.066667
								if( lower_1 > 109.923 )
									ret := -0.866667 // sell
							if( lower_1 > 110.112 )
								if( lower_4 <= 102.483 )
									ret := 0.125000
								if( lower_4 > 102.483 )
									ret := 0.666667
						if( upper_5 > 135.245 )
							if( lower_1 <= 116.321 )
								if( upper_2 <= 126.654 )
									ret := -0.947368 // sell
								if( upper_2 > 126.654 )
									ret := -0.250000
							if( lower_1 > 116.321 )
								ret := -1.000000 // sell
				if( lower_6 > 94.8589 )
					if( upper_4 <= 126.256 )
						if( lower_6 <= 96.0638 )
							ret := -0.333333
						if( lower_6 > 96.0638 )
							if( lower_5 <= 99.377 )
								ret := 0.250000
							if( lower_5 > 99.377 )
								ret := 0.000000
					if( upper_4 > 126.256 )
						if( basis <= 117.876 )
							ret := 1.000000 // buy
						if( basis > 117.876 )
							ret := 0.166667
			if( lower_6 > 96.3007 )
				if( basis <= 109.498 )
					if( basis <= 106.436 )
						if( lower_1 <= 104.523 )
							if( basis_minus <= 6.28884 )
								if( upper_3 <= 106.338 )
									ret := 0.000000
								if( upper_3 > 106.338 )
									ret := -1.000000 // sell
							if( basis_minus > 6.28884 )
								if( lower_1 <= 104.279 )
									ret := -0.333333
								if( lower_1 > 104.279 )
									ret := 0.095238
						if( lower_1 > 104.523 )
							if( upper_2 <= 109.149 )
								ret := -0.500000
							if( upper_2 > 109.149 )
								ret := -1.000000 // sell
					if( basis > 106.436 )
						if( lower_1 <= 104.864 )
							ret := 1.000000 // buy
						if( lower_1 > 104.864 )
							if( lower_5 <= 100.398 )
								ret := 0.000000
							if( lower_5 > 100.398 )
								ret := 0.750000 // buy
				if( basis > 109.498 )
					if( lower_3 <= 103.426 )
						if( lower_3 <= 103.397 )
							if( upper_3 <= 116.35 )
								if( upper_1 <= 112.762 )
									ret := -0.714286 // sell
								if( upper_1 > 112.762 )
									ret := -1.000000 // sell
							if( upper_3 > 116.35 )
								ret := -0.500000
						if( lower_3 > 103.397 )
							ret := -0.166667
					if( lower_3 > 103.426 )
						if( upper_3 <= 121.806 )
							if( lower_6 <= 97.8205 )
								ret := -1.000000 // sell
							if( lower_6 > 97.8205 )
								ret := -0.750000 // sell
						if( upper_3 > 121.806 )
							ret := -0.750000 // sell
		if( lower_5 > 100.973 )
			if( lower_5 <= 102.122 )
				if( upper_2 <= 117.718 )
					if( upper_4 <= 105.956 )
						ret := 1.000000 // buy
					if( upper_4 > 105.956 )
						if( upper_5 <= 111.993 )
							if( upper_1 <= 105.061 )
								if( lower_5 <= 101.892 )
									ret := 0.459459
								if( lower_5 > 101.892 )
									ret := 0.000000
							if( upper_1 > 105.061 )
								if( lower_6 <= 100.245 )
									ret := 0.000000
								if( lower_6 > 100.245 )
									ret := -0.857143 // sell
						if( upper_5 > 111.993 )
							if( upper_5 <= 112.455 )
								if( basis_max <= -7.09546 )
									ret := 0.714286 // buy
								if( basis_max > -7.09546 )
									ret := 1.000000 // buy
							if( upper_5 > 112.455 )
								if( lower_5 <= 101.427 )
									ret := 0.800000 // buy
								if( lower_5 > 101.427 )
									ret := 0.231707
				if( upper_2 > 117.718 )
					if( basis_minus <= 15.4468 )
						if( lower_6 <= 97.7718 )
							ret := 0.500000
						if( lower_6 > 97.7718 )
							if( upper_1 <= 116.134 )
								if( upper_2 <= 117.82 )
									ret := 1.000000 // buy
								if( upper_2 > 117.82 )
									ret := 0.500000
							if( upper_1 > 116.134 )
								ret := 1.000000 // buy
					if( basis_minus > 15.4468 )
						if( basis <= 113.87 )
							ret := -1.000000 // sell
						if( basis > 113.87 )
							if( lower_6 <= 96.0576 )
								if( lower_2 <= 111.204 )
									ret := 0.500000
								if( lower_2 > 111.204 )
									ret := 0.800000 // buy
							if( lower_6 > 96.0576 )
								ret := 0.000000
			if( lower_5 > 102.122 )
				if( lower_4 <= 279.025 )
					if( upper_1 <= 296.695 )
						if( basis_max <= -5.14178 )
							if( upper_5 <= 172.029 )
								if( basis_max <= -10.5385 )
									ret := 0.026033
								if( basis_max > -10.5385 )
									ret := 0.135816
							if( upper_5 > 172.029 )
								if( lower_2 <= 185.482 )
									ret := -0.041245
								if( lower_2 > 185.482 )
									ret := 0.038021
						if( basis_max > -5.14178 )
							if( lower_5 <= 205.489 )
								if( upper_6 <= 200.547 )
									ret := -0.181197
								if( upper_6 > 200.547 )
									ret := 0.204762
							if( lower_5 > 205.489 )
								if( basis_minus <= 4.63302 )
									ret := -0.837209 // sell
								if( basis_minus > 4.63302 )
									ret := -0.391753
					if( upper_1 > 296.695 )
						if( upper_1 <= 301.182 )
							if( upper_2 <= 305.722 )
								if( upper_6 <= 317.439 )
									ret := -0.909091 // sell
								if( upper_6 > 317.439 )
									ret := -0.029126
							if( upper_2 > 305.722 )
								if( upper_4 <= 322.548 )
									ret := -0.836207 // sell
								if( upper_4 > 322.548 )
									ret := 0.333333
						if( upper_1 > 301.182 )
							if( basis <= 289.782 )
								if( lower_5 <= 240.754 )
									ret := 0.333333
								if( lower_5 > 240.754 )
									ret := 0.920000 // buy
							if( basis > 289.782 )
								if( basis <= 297.754 )
									ret := -0.426332
								if( basis > 297.754 )
									ret := 0.020619
				if( lower_4 > 279.025 )
					if( lower_4 <= 282.214 )
						if( lower_3 <= 283.133 )
							if( upper_1 <= 288.415 )
								ret := 0.000000
							if( upper_1 > 288.415 )
								if( upper_3 <= 305.879 )
									ret := 0.514286
								if( upper_3 > 305.879 )
									ret := 0.888889 // buy
						if( lower_3 > 283.133 )
							if( basis <= 293.239 )
								if( upper_6 <= 311.852 )
									ret := -0.272727
								if( upper_6 > 311.852 )
									ret := -1.000000 // sell
							if( basis > 293.239 )
								if( lower_4 <= 279.592 )
									ret := -0.500000
								if( lower_4 > 279.592 )
									ret := 0.441341
					if( lower_4 > 282.214 )
						if( lower_4 <= 291.485 )
							if( basis_max <= -17.297 )
								if( lower_6 <= 275.497 )
									ret := -0.105263
								if( lower_6 > 275.497 )
									ret := -0.556485
							if( basis_max > -17.297 )
								if( basis_minus <= 15.9799 )
									ret := -0.032258
								if( basis_minus > 15.9799 )
									ret := 0.714286 // buy
						if( lower_4 > 291.485 )
							if( lower_6 <= 1048.9 )
								if( lower_3 <= 408.965 )
									ret := 0.145920
								if( lower_3 > 408.965 )
									ret := 0.048492
							if( lower_6 > 1048.9 )
								if( basis_max <= -71.9527 )
									ret := 0.916667 // buy
								if( basis_max > -71.9527 )
									ret := 0.300000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Fibonacci_Bollinger 
//@version=5
//indicator shorttitle="FBB", title="Fibonacci Bollinger Bands", overlay=true)

// Inputs
length_FiboBB = input.int(200, minval=1)
src = input(hlc3, title="Source")
mult = input.float(3.0, minval=0.001, maxval=50)

// Calculations
basis = ta.vwma(src, length_FiboBB)
dev = mult * ta.stdev(src, length_FiboBB)

// Upper Bands
upper_1 = basis + (0.236 * dev)
upper_2 = basis + (0.382 * dev)
upper_3 = basis + (0.5 * dev)
upper_4 = basis + (0.618 * dev)
upper_5 = basis + (0.764 * dev)
upper_6 = basis + (1 * dev)

// Lower Bands
lower_1 = basis - (0.236 * dev)
lower_2 = basis - (0.382 * dev)
lower_3 = basis - (0.5 * dev)
lower_4 = basis - (0.618 * dev)
lower_5 = basis - (0.764 * dev)
lower_6 = basis - (1 * dev)

basis_minus = basis -lower_6
basis_max = basis -upper_6

// Plotting
plot(basis, color=color.fuchsia, linewidth=2)
plot(upper_1, color=color.white, linewidth=1, title="0.236")
plot(upper_2, color=color.white, linewidth=1, title="0.382")
plot(upper_3, color=color.white, linewidth=1, title="0.5")
plot(upper_4, color=color.white, linewidth=1, title="0.618")
plot(upper_5, color=color.white, linewidth=1, title="0.764")
plot(upper_6, color=color.red, linewidth=2, title="1")
plot(lower_1, color=color.white, linewidth=1, title="0.236")
plot(lower_2, color=color.white, linewidth=1, title="0.382")
plot(lower_3, color=color.white, linewidth=1, title="0.5")
plot(lower_4, color=color.white, linewidth=1, title="0.618")
plot(lower_5, color=color.white, linewidth=1, title="0.764")
plot(lower_6, color=color.green, linewidth=2, title="1")

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
float op_operation = decision_tree_0_NVDA_30Min_0d65f7cd(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


