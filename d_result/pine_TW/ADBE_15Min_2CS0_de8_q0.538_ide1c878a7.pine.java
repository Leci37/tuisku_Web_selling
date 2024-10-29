//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: ADBE_15Min_2CS0_e1c878a7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_15Min_2CS0_e1c878a7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_15Min_e1c878a7(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad_mf <= 0.393451 )
		if( ad_mf <= -1399.92 )
			if( ad <= -296461 )
				if( rsi1 <= 10.2358 )
					if( k <= 3.15902 )
						ret := 0.000000
					if( k > 3.15902 )
						ret := -1.000000 // sell
				if( rsi1 > 10.2358 )
					if( d_k <= 7.22611 )
						if( ad_mf <= -329525 )
							if( d_k <= -4.82408 )
								if( mf <= 0.128731 )
									ret := -0.160622
								if( mf > 0.128731 )
									ret := 0.571429
							if( d_k > -4.82408 )
								if( ad_mf <= -382767 )
									ret := 0.255556
								if( ad_mf > -382767 )
									ret := -0.223776
						if( ad_mf > -329525 )
							if( mf <= -0.30968 )
								ret := 0.000000
							if( mf > -0.30968 )
								if( ad_mf <= -304494 )
									ret := 0.718310 // buy
								if( ad_mf > -304494 )
									ret := 0.312500
					if( d_k > 7.22611 )
						if( smoothK_k <= 35.4854 )
							if( smoothK_k <= 12.3498 )
								if( smoothK_k <= 5.46907 )
									ret := 0.344828
								if( smoothK_k > 5.46907 )
									ret := -0.157895
							if( smoothK_k > 12.3498 )
								if( k <= 33.2775 )
									ret := 0.766990 // buy
								if( k > 33.2775 )
									ret := 0.433333
						if( smoothK_k > 35.4854 )
							if( mf <= -0.215703 )
								if( k <= 61.1931 )
									ret := -0.176471
								if( k > 61.1931 )
									ret := 0.473684
							if( mf > -0.215703 )
								if( rsi1 <= 33.3088 )
									ret := -0.090909
								if( rsi1 > 33.3088 )
									ret := 0.604651
			if( ad > -296461 )
				if( mf <= -0.226806 )
					if( smoothK_k <= 91.0351 )
						if( d_k <= 27.2501 )
							if( mf <= -0.391525 )
								if( d_k <= 3.29931 )
									ret := 0.004496
								if( d_k > 3.29931 )
									ret := -0.125896
							if( mf > -0.391525 )
								if( smoothD_d <= 3.66619 )
									ret := -0.104167
								if( smoothD_d > 3.66619 )
									ret := 0.097489
						if( d_k > 27.2501 )
							if( smoothD_d <= 42.409 )
								ret := -0.904762 // sell
							if( smoothD_d > 42.409 )
								if( smoothD_d <= 56.3986 )
									ret := 0.166667
								if( smoothD_d > 56.3986 )
									ret := -0.500000
					if( smoothK_k > 91.0351 )
						if( ad_mf <= -34575.8 )
							if( smoothD_d <= 92.1571 )
								if( d_k <= -4.81312 )
									ret := 0.075472
								if( d_k > -4.81312 )
									ret := 0.656250
							if( smoothD_d > 92.1571 )
								if( ad_mf <= -42635.7 )
									ret := -0.216667
								if( ad_mf > -42635.7 )
									ret := 0.363636
						if( ad_mf > -34575.8 )
							if( ad_mf <= -32016.4 )
								ret := 1.000000 // buy
							if( ad_mf > -32016.4 )
								if( ad_mf <= -15570.6 )
									ret := 0.119403
								if( ad_mf > -15570.6 )
									ret := 0.484211
				if( mf > -0.226806 )
					if( ad_mf <= -1443.08 )
						if( d <= 91.5627 )
							if( rsi1 <= 22.7598 )
								if( d <= 43.7592 )
									ret := 0.128686
								if( d > 43.7592 )
									ret := -0.583333
							if( rsi1 > 22.7598 )
								if( ad <= -95361.2 )
									ret := 0.044976
								if( ad > -95361.2 )
									ret := -0.036840
						if( d > 91.5627 )
							if( rsi1 <= 47.2397 )
								if( k <= 92.8325 )
									ret := -0.324074
								if( k > 92.8325 )
									ret := 0.023810
							if( rsi1 > 47.2397 )
								if( k <= 94.1732 )
									ret := 0.171592
								if( k > 94.1732 )
									ret := -0.007236
					if( ad_mf > -1443.08 )
						if( smoothK_k <= 30.8729 )
							if( d_k <= -3.87635 )
								ret := -1.000000 // sell
							if( d_k > -3.87635 )
								ret := -0.555556
						if( smoothK_k > 30.8729 )
							if( smoothK_k <= 71.6651 )
								if( rsi1 <= 50.9894 )
									ret := 0.769231 // buy
								if( rsi1 > 50.9894 )
									ret := -0.647059
							if( smoothK_k > 71.6651 )
								if( k <= 82.0745 )
									ret := -0.947368 // sell
								if( k > 82.0745 )
									ret := -0.500000
		if( ad_mf > -1399.92 )
			if( rsi1 <= 47.7204 )
				if( d <= 4.59309 )
					if( smoothD_d <= 0.241298 )
						if( smoothD_d <= -0.434141 )
							if( ad_mf <= -332.856 )
								if( ad_mf <= -630.549 )
									ret := 0.012658
								if( ad_mf > -630.549 )
									ret := -0.695652
							if( ad_mf > -332.856 )
								if( rsi1 <= 6.36714 )
									ret := 0.909091 // buy
								if( rsi1 > 6.36714 )
									ret := 0.007874
						if( smoothD_d > -0.434141 )
							if( rsi1 <= 23.4455 )
								if( d_k <= 0.75167 )
									ret := 0.303030
								if( d_k > 0.75167 )
									ret := -0.400000
							if( rsi1 > 23.4455 )
								if( rsi1 <= 42.645 )
									ret := 0.609756
								if( rsi1 > 42.645 )
									ret := -0.047619
					if( smoothD_d > 0.241298 )
						if( k <= 1.91786 )
							if( rsi1 <= 30.4245 )
								if( smoothD_d <= 1.01897 )
									ret := -0.545455
								if( smoothD_d > 1.01897 )
									ret := 0.363636
							if( rsi1 > 30.4245 )
								if( d_k <= 3.75475 )
									ret := -0.947368 // sell
								if( d_k > 3.75475 )
									ret := -0.466667
						if( k > 1.91786 )
							if( smoothK_k <= 4.18345 )
								if( d_k <= -1.75864 )
									ret := -0.208333
								if( d_k > -1.75864 )
									ret := 0.097561
							if( smoothK_k > 4.18345 )
								if( k <= 7.97725 )
									ret := -0.828571 // sell
								if( k > 7.97725 )
									ret := -0.340426
				if( d > 4.59309 )
					if( ad_mf <= -1052.15 )
						if( d_k <= -4.50983 )
							if( smoothK_k <= 14.1529 )
								if( mf <= -0.131249 )
									ret := -0.800000 // sell
								if( mf > -0.131249 )
									ret := -1.000000 // sell
							if( smoothK_k > 14.1529 )
								if( ad <= -1117.12 )
									ret := -0.067416
								if( ad > -1117.12 )
									ret := -0.785714 // sell
						if( d_k > -4.50983 )
							if( smoothK_k <= 2.45006 )
								if( ad_mf <= -1158.31 )
									ret := -0.070175
								if( ad_mf > -1158.31 )
									ret := -0.777778 // sell
							if( smoothK_k > 2.45006 )
								if( smoothD_d <= 6.807 )
									ret := 0.792453 // buy
								if( smoothD_d > 6.807 )
									ret := 0.169492
					if( ad_mf > -1052.15 )
						if( ad <= -764.419 )
							if( smoothD_d <= 82.6643 )
								if( smoothK_k <= -1.82294 )
									ret := -0.500000
								if( smoothK_k > -1.82294 )
									ret := 0.631902
							if( smoothD_d > 82.6643 )
								if( smoothK_k <= 79.4011 )
									ret := -0.555556
								if( smoothK_k > 79.4011 )
									ret := -0.909091 // sell
						if( ad > -764.419 )
							if( ad <= -734.061 )
								if( smoothK_k <= 68.246 )
									ret := -0.120000
								if( smoothK_k > 68.246 )
									ret := -0.846154 // sell
							if( ad > -734.061 )
								if( rsi1 <= 30.8279 )
									ret := 0.348414
								if( rsi1 > 30.8279 )
									ret := 0.180558
			if( rsi1 > 47.7204 )
				if( rsi1 <= 79.5998 )
					if( smoothD_d <= 88.0762 )
						if( d_k <= -0.329743 )
							if( ad_mf <= -193.818 )
								if( ad_mf <= -299.499 )
									ret := 0.006061
								if( ad_mf > -299.499 )
									ret := 0.656250
							if( ad_mf > -193.818 )
								if( k <= 15.7597 )
									ret := 0.185430
								if( k > 15.7597 )
									ret := -0.138702
						if( d_k > -0.329743 )
							if( smoothK_k <= 8.89211 )
								if( smoothK_k <= 7.48392 )
									ret := 0.119923
								if( smoothK_k > 7.48392 )
									ret := 0.530303
							if( smoothK_k > 8.89211 )
								if( smoothK_k <= 21.2947 )
									ret := -0.183533
								if( smoothK_k > 21.2947 )
									ret := 0.012931
					if( smoothD_d > 88.0762 )
						if( rsi1 <= 78.7095 )
							if( ad <= -732.466 )
								if( rsi1 <= 71.1566 )
									ret := 0.534783
								if( rsi1 > 71.1566 )
									ret := 0.081967
							if( ad > -732.466 )
								if( rsi1 <= 69.2002 )
									ret := -0.036574
								if( rsi1 > 69.2002 )
									ret := 0.167866
						if( rsi1 > 78.7095 )
							if( smoothD_d <= 93.2203 )
								if( d_k <= 2.57457 )
									ret := 0.071429
								if( d_k > 2.57457 )
									ret := 0.785714 // buy
							if( smoothD_d > 93.2203 )
								if( d_k <= 0.900159 )
									ret := 0.560000
								if( d_k > 0.900159 )
									ret := 0.923077 // buy
				if( rsi1 > 79.5998 )
					if( smoothD_d <= 90.8367 )
						if( smoothD_d <= 43.4531 )
							if( d <= 32.4008 )
								ret := -0.750000 // sell
							if( d > 32.4008 )
								if( d <= 41.9274 )
									ret := -0.882353 // sell
								if( d > 41.9274 )
									ret := -1.000000 // sell
						if( smoothD_d > 43.4531 )
							if( d <= 77.6448 )
								if( d_k <= 15.812 )
									ret := -0.113636
								if( d_k > 15.812 )
									ret := 1.000000 // buy
							if( d > 77.6448 )
								if( k <= 99.9635 )
									ret := -0.578431
								if( k > 99.9635 )
									ret := 0.083333
					if( smoothD_d > 90.8367 )
						if( rsi1 <= 81.4648 )
							if( d_k <= 1.30536 )
								if( ad_mf <= -0.599189 )
									ret := 0.000000
								if( ad_mf > -0.599189 )
									ret := -0.679612
							if( d_k > 1.30536 )
								if( d_k <= 3.95824 )
									ret := 0.620690
								if( d_k > 3.95824 )
									ret := -0.500000
						if( rsi1 > 81.4648 )
							if( k <= 98.2733 )
								if( rsi1 <= 89.4969 )
									ret := 0.460317
								if( rsi1 > 89.4969 )
									ret := -0.125000
							if( k > 98.2733 )
								if( rsi1 <= 84.7141 )
									ret := 0.444444
								if( rsi1 > 84.7141 )
									ret := -0.286957
	if( ad_mf > 0.393451 )
		if( d_k <= -1.88408 )
			if( ad <= 1757.66 )
				if( ad_mf <= 1616.75 )
					if( mf <= 0.146605 )
						if( d_k <= -18.7998 )
							if( ad_mf <= 1523.6 )
								if( rsi1 <= 44.0192 )
									ret := 0.145455
								if( rsi1 > 44.0192 )
									ret := -0.328063
							if( ad_mf > 1523.6 )
								ret := 0.555556
						if( d_k > -18.7998 )
							if( rsi1 <= 42.9727 )
								if( d <= 14.5384 )
									ret := -0.044379
								if( d > 14.5384 )
									ret := 0.233068
							if( rsi1 > 42.9727 )
								if( k <= 37.3554 )
									ret := -0.359873
								if( k > 37.3554 )
									ret := -0.068909
					if( mf > 0.146605 )
						if( d <= 41.4851 )
							if( smoothK_k <= 19.2618 )
								if( smoothD_d <= 11.2214 )
									ret := -0.297297
								if( smoothD_d > 11.2214 )
									ret := 0.409091
							if( smoothK_k > 19.2618 )
								if( ad_mf <= 503.317 )
									ret := -0.323944
								if( ad_mf > 503.317 )
									ret := -0.762238 // sell
						if( d > 41.4851 )
							if( rsi1 <= 59.1874 )
								if( smoothK_k <= 54.9342 )
									ret := 0.750000 // buy
								if( smoothK_k > 54.9342 )
									ret := -0.050000
							if( rsi1 > 59.1874 )
								if( smoothD_d <= 92.0846 )
									ret := -0.406015
								if( smoothD_d > 92.0846 )
									ret := 0.250000
				if( ad_mf > 1616.75 )
					if( k <= 45.7117 )
						if( ad <= 1696.78 )
							if( rsi1 <= 38.5024 )
								ret := 0.600000
							if( rsi1 > 38.5024 )
								ret := -0.666667
						if( ad > 1696.78 )
							ret := -0.625000
					if( k > 45.7117 )
						if( k <= 82.4652 )
							if( smoothK_k <= 51.2954 )
								ret := -0.727273 // sell
							if( smoothK_k > 51.2954 )
								ret := -1.000000 // sell
						if( k > 82.4652 )
							ret := -0.444444
			if( ad > 1757.66 )
				if( ad <= 3076.03 )
					if( ad_mf <= 2756.15 )
						if( smoothK_k <= 8.28376 )
							if( rsi1 <= 32.3916 )
								if( d_k <= -3.93575 )
									ret := -0.250000
								if( d_k > -3.93575 )
									ret := -0.952381 // sell
							if( rsi1 > 32.3916 )
								if( ad_mf <= 2302.74 )
									ret := 0.380952
								if( ad_mf > 2302.74 )
									ret := -0.636364
						if( smoothK_k > 8.28376 )
							if( k <= 48.7907 )
								if( ad_mf <= 2689.71 )
									ret := 0.451049
								if( ad_mf > 2689.71 )
									ret := -0.857143 // sell
							if( k > 48.7907 )
								if( ad <= 1917.42 )
									ret := 0.461538
								if( ad > 1917.42 )
									ret := -0.187251
					if( ad_mf > 2756.15 )
						if( k <= 98.0791 )
							if( d_k <= -3.42846 )
								if( d <= 53.7625 )
									ret := 0.760000 // buy
								if( d > 53.7625 )
									ret := 0.547619
							if( d_k > -3.42846 )
								ret := -0.222222
						if( k > 98.0791 )
							ret := -0.100000
				if( ad > 3076.03 )
					if( smoothD_d <= 54.8007 )
						if( d_k <= -11.45 )
							if( rsi1 <= 75.0886 )
								if( d_k <= -11.5205 )
									ret := 0.016039
								if( d_k > -11.5205 )
									ret := 0.633333
							if( rsi1 > 75.0886 )
								if( d <= 36.7204 )
									ret := 0.566038
								if( d > 36.7204 )
									ret := 0.154639
						if( d_k > -11.45 )
							if( rsi1 <= 71.2828 )
								if( ad_mf <= 233024 )
									ret := -0.043705
								if( ad_mf > 233024 )
									ret := -0.412607
							if( rsi1 > 71.2828 )
								if( rsi1 <= 74.4625 )
									ret := 0.428571
								if( rsi1 > 74.4625 )
									ret := 0.188406
					if( smoothD_d > 54.8007 )
						if( rsi1 <= 66.4142 )
							if( mf <= -0.323104 )
								if( k <= 87.3403 )
									ret := -0.215909
								if( k > 87.3403 )
									ret := -0.690000
							if( mf > -0.323104 )
								if( smoothK_k <= 69.1875 )
									ret := -0.277778
								if( smoothK_k > 69.1875 )
									ret := -0.099663
						if( rsi1 > 66.4142 )
							if( ad <= 4379.6 )
								if( ad_mf <= 3550.28 )
									ret := -0.222222
								if( ad_mf > 3550.28 )
									ret := -0.717391 // sell
							if( ad > 4379.6 )
								if( smoothK_k <= 76.8202 )
									ret := 0.125813
								if( smoothK_k > 76.8202 )
									ret := -0.062530
		if( d_k > -1.88408 )
			if( ad_mf <= 1.02936e+06 )
				if( k <= 95.7782 )
					if( rsi1 <= 21.4431 )
						if( d <= 31.715 )
							if( ad <= 1290.17 )
								if( d <= 0.359833 )
									ret := -0.266667
								if( d > 0.359833 )
									ret := 0.553191
							if( ad > 1290.17 )
								if( smoothD_d <= 15.2068 )
									ret := 0.122066
								if( smoothD_d > 15.2068 )
									ret := -0.484848
						if( d > 31.715 )
							if( rsi1 <= 19.719 )
								if( rsi1 <= 16.308 )
									ret := 0.727273 // buy
								if( rsi1 > 16.308 )
									ret := 1.000000 // buy
							if( rsi1 > 19.719 )
								ret := 0.222222
					if( rsi1 > 21.4431 )
						if( ad_mf <= 0.3995 )
							if( d_k <= 9.60807 )
								if( d_k <= 4.61975 )
									ret := -0.400000
								if( d_k > 4.61975 )
									ret := -0.789474 // sell
							if( d_k > 9.60807 )
								ret := -0.090909
						if( ad_mf > 0.3995 )
							if( d <= 2.14758 )
								if( mf <= -0.348063 )
									ret := 0.512195
								if( mf > -0.348063 )
									ret := 0.111359
							if( d > 2.14758 )
								if( ad <= 962642 )
									ret := 0.005640
								if( ad > 962642 )
									ret := 0.900000 // buy
				if( k > 95.7782 )
					if( ad_mf <= 3559.5 )
						if( rsi1 <= 85.9435 )
							if( k <= 99.9922 )
								if( d_k <= -1.05453 )
									ret := 0.089552
								if( d_k > -1.05453 )
									ret := -0.608844
							if( k > 99.9922 )
								if( mf <= -0.122998 )
									ret := -0.128205
								if( mf > -0.122998 )
									ret := 0.179487
						if( rsi1 > 85.9435 )
							if( mf <= 0.250761 )
								if( mf <= 0.009917 )
									ret := -0.187500
								if( mf > 0.009917 )
									ret := 0.454545
							if( mf > 0.250761 )
								if( ad_mf <= 1693.94 )
									ret := 0.000000
								if( ad_mf > 1693.94 )
									ret := -0.583333
					if( ad_mf > 3559.5 )
						if( rsi1 <= 43.2982 )
							ret := 0.545455
						if( rsi1 > 43.2982 )
							if( k <= 95.8784 )
								if( smoothD_d <= 93.4753 )
									ret := -0.272727
								if( smoothD_d > 93.4753 )
									ret := -0.700000 // sell
							if( k > 95.8784 )
								if( smoothK_k <= 92.9947 )
									ret := 0.550000
								if( smoothK_k > 92.9947 )
									ret := -0.046275
			if( ad_mf > 1.02936e+06 )
				if( d_k <= -0.553756 )
					ret := -0.272727
				if( d_k > -0.553756 )
					if( d <= 75.7277 )
						if( smoothD_d <= 34.4729 )
							ret := -0.800000 // sell
						if( smoothD_d > 34.4729 )
							ret := -1.000000 // sell
					if( d > 75.7277 )
						ret := -0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_ADBE_15Min_e1c878a7(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


