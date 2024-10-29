//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: MSFT_5Min_2CS0_04555ff2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2CS0_04555ff2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_04555ff2(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= 2398.07 )
		if( rsi1 <= 48.1805 )
			if( ad_mf <= -11525.5 )
				if( smoothD_d <= 88.3174 )
					if( ad <= -13882.7 )
						if( ad_mf <= -610361 )
							if( ad <= -927860 )
								if( ad_mf <= -2.10677e+06 )
									ret := 0.319149
								if( ad_mf > -2.10677e+06 )
									ret := -0.201183
							if( ad > -927860 )
								if( ad_mf <= -744645 )
									ret := 0.700000 // buy
								if( ad_mf > -744645 )
									ret := 0.118812
						if( ad_mf > -610361 )
							if( ad <= -552694 )
								if( ad_mf <= -588788 )
									ret := -0.140000
								if( ad_mf > -588788 )
									ret := -0.733333 // sell
							if( ad > -552694 )
								if( k <= 96.5318 )
									ret := 0.031542
								if( k > 96.5318 )
									ret := -0.454545
					if( ad > -13882.7 )
						if( d_k <= 9.41676 )
							if( d_k <= 5.25861 )
								if( d_k <= 1.38558 )
									ret := -0.445783
								if( d_k > 1.38558 )
									ret := -0.047619
							if( d_k > 5.25861 )
								if( d_k <= 7.37617 )
									ret := -0.947368 // sell
								if( d_k > 7.37617 )
									ret := -0.100000
						if( d_k > 9.41676 )
							if( ad_mf <= -13156.7 )
								ret := -0.444444
							if( ad_mf > -13156.7 )
								if( d_k <= 14.6732 )
									ret := 0.375000
								if( d_k > 14.6732 )
									ret := 0.809524 // buy
				if( smoothD_d > 88.3174 )
					if( d <= 93.1327 )
						if( d_k <= 3.57419 )
							if( d_k <= 0.055314 )
								ret := -0.454545
							if( d_k > 0.055314 )
								ret := -0.833333 // sell
						if( d_k > 3.57419 )
							ret := -0.058824
					if( d > 93.1327 )
						if( d_k <= 1.50287 )
							if( smoothK_k <= 93.9655 )
								if( ad_mf <= -115509 )
									ret := 0.250000
								if( ad_mf > -115509 )
									ret := 0.608696
							if( smoothK_k > 93.9655 )
								if( ad_mf <= -147191 )
									ret := 0.444444
								if( ad_mf > -147191 )
									ret := -0.315789
						if( d_k > 1.50287 )
							if( ad <= -117290 )
								if( mf <= -0.168151 )
									ret := -0.444444
								if( mf > -0.168151 )
									ret := 0.277778
							if( ad > -117290 )
								if( d <= 96.1502 )
									ret := -0.739130 // sell
								if( d > 96.1502 )
									ret := 0.100000
			if( ad_mf > -11525.5 )
				if( smoothD_d <= 17.7182 )
					if( ad <= 2169.47 )
						if( ad <= 2057.18 )
							if( mf <= -0.444669 )
								if( mf <= -0.449062 )
									ret := 0.213836
								if( mf > -0.449062 )
									ret := 0.846154 // buy
							if( mf > -0.444669 )
								if( mf <= -0.115891 )
									ret := -0.047923
								if( mf > -0.115891 )
									ret := 0.075514
						if( ad > 2057.18 )
							if( ad <= 2097 )
								if( ad_mf <= 2079.12 )
									ret := -0.900000 // sell
								if( ad_mf > 2079.12 )
									ret := -1.000000 // sell
							if( ad > 2097 )
								if( smoothD_d <= 6.52476 )
									ret := 0.083333
								if( smoothD_d > 6.52476 )
									ret := -0.642857
					if( ad > 2169.47 )
						if( d_k <= -2.65738 )
							if( ad <= 2275.61 )
								ret := -0.368421
							if( ad > 2275.61 )
								if( ad_mf <= 2322.04 )
									ret := 0.571429
								if( ad_mf > 2322.04 )
									ret := -0.250000
						if( d_k > -2.65738 )
							if( k <= 13.2071 )
								if( ad_mf <= 2255.86 )
									ret := 0.880597 // buy
								if( ad_mf > 2255.86 )
									ret := 0.588235
							if( k > 13.2071 )
								ret := 0.400000
				if( smoothD_d > 17.7182 )
					if( ad_mf <= -0.266221 )
						if( ad_mf <= -10839.2 )
							if( mf <= 0.011913 )
								if( ad <= -11142.9 )
									ret := 0.421053
								if( ad > -11142.9 )
									ret := 0.947368 // buy
							if( mf > 0.011913 )
								ret := -0.142857
						if( ad_mf > -10839.2 )
							if( ad <= -9980.82 )
								if( rsi1 <= 44.4868 )
									ret := -0.720588 // sell
								if( rsi1 > 44.4868 )
									ret := 0.571429
							if( ad > -9980.82 )
								if( smoothK_k <= 39.4775 )
									ret := 0.112394
								if( smoothK_k > 39.4775 )
									ret := 0.209552
					if( ad_mf > -0.266221 )
						if( smoothD_d <= 18.1714 )
							if( rsi1 <= 31.7311 )
								ret := 0.900000 // buy
							if( rsi1 > 31.7311 )
								if( ad_mf <= 670.84 )
									ret := 0.210526
								if( ad_mf > 670.84 )
									ret := 0.928571 // buy
						if( smoothD_d > 18.1714 )
							if( rsi1 <= 28.0395 )
								if( d <= 34.4878 )
									ret := 0.405405
								if( d > 34.4878 )
									ret := 0.000000
							if( rsi1 > 28.0395 )
								if( smoothK_k <= 8.30058 )
									ret := 0.458333
								if( smoothK_k > 8.30058 )
									ret := -0.000350
		if( rsi1 > 48.1805 )
			if( k <= 44.9651 )
				if( ad_mf <= -537717 )
					if( ad_mf <= -1.08779e+06 )
						ret := 0.230769
					if( ad_mf > -1.08779e+06 )
						if( smoothD_d <= 33.2965 )
							if( smoothK_k <= 20.0452 )
								ret := -0.909091 // sell
							if( smoothK_k > 20.0452 )
								ret := -0.285714
						if( smoothD_d > 33.2965 )
							if( d_k <= 4.78114 )
								ret := -0.900000 // sell
							if( d_k > 4.78114 )
								ret := -1.000000 // sell
				if( ad_mf > -537717 )
					if( mf <= -0.278144 )
						if( k <= 39.709 )
							if( ad <= -3263.76 )
								if( smoothK_k <= 12.5057 )
									ret := 0.833333 // buy
								if( smoothK_k > 12.5057 )
									ret := 0.262500
							if( ad > -3263.76 )
								if( d_k <= 4.48014 )
									ret := -0.018987
								if( d_k > 4.48014 )
									ret := 0.236686
						if( k > 39.709 )
							if( d <= 35.8486 )
								if( ad_mf <= -932.488 )
									ret := 0.400000
								if( ad_mf > -932.488 )
									ret := -0.038462
							if( d > 35.8486 )
								if( smoothK_k <= 38.2104 )
									ret := -0.615385
								if( smoothK_k > 38.2104 )
									ret := -0.178571
					if( mf > -0.278144 )
						if( ad <= -74803.9 )
							if( smoothD_d <= 3.82979 )
								if( k <= 9.26059 )
									ret := 0.561404
								if( k > 9.26059 )
									ret := 0.300000
							if( smoothD_d > 3.82979 )
								if( ad <= -75034.2 )
									ret := 0.011754
								if( ad > -75034.2 )
									ret := 1.000000 // buy
						if( ad > -74803.9 )
							if( d_k <= 29.5896 )
								if( d <= 63.1379 )
									ret := -0.093621
								if( d > 63.1379 )
									ret := -0.465753
							if( d_k > 29.5896 )
								if( k <= 21.9645 )
									ret := -0.500000
								if( k > 21.9645 )
									ret := -0.846154 // sell
			if( k > 44.9651 )
				if( d_k <= 12.443 )
					if( d <= 98.0335 )
						if( d_k <= -6.1672 )
							if( smoothK_k <= 42.3794 )
								ret := 0.600000
							if( smoothK_k > 42.3794 )
								if( smoothK_k <= 83.295 )
									ret := -0.054323
								if( smoothK_k > 83.295 )
									ret := 0.010373
						if( d_k > -6.1672 )
							if( ad <= -279986 )
								if( ad <= -328168 )
									ret := -0.183844
								if( ad > -328168 )
									ret := -0.582278
							if( ad > -279986 )
								if( rsi1 <= 48.2468 )
									ret := -0.833333 // sell
								if( rsi1 > 48.2468 )
									ret := 0.034439
					if( d > 98.0335 )
						if( mf <= -0.115521 )
							if( smoothD_d <= 95.382 )
								if( ad_mf <= -7974.77 )
									ret := 0.333333
								if( ad_mf > -7974.77 )
									ret := -0.456522
							if( smoothD_d > 95.382 )
								if( smoothD_d <= 95.4742 )
									ret := 0.909091 // buy
								if( smoothD_d > 95.4742 )
									ret := 0.081967
						if( mf > -0.115521 )
							if( mf <= 0.563691 )
								if( rsi1 <= 62.0332 )
									ret := 0.159292
								if( rsi1 > 62.0332 )
									ret := -0.247039
							if( mf > 0.563691 )
								if( mf <= 0.604307 )
									ret := 0.444444
								if( mf > 0.604307 )
									ret := 0.047619
				if( d_k > 12.443 )
					if( smoothD_d <= 74.368 )
						if( mf <= 0.286232 )
							if( rsi1 <= 50.572 )
								if( smoothD_d <= 58.2474 )
									ret := -0.846154 // sell
								if( smoothD_d > 58.2474 )
									ret := -0.160377
							if( rsi1 > 50.572 )
								if( d_k <= 15.146 )
									ret := 0.043651
								if( d_k > 15.146 )
									ret := 0.247024
						if( mf > 0.286232 )
							if( d_k <= 16.1874 )
								if( ad_mf <= -0.459611 )
									ret := 0.104167
								if( ad_mf > -0.459611 )
									ret := -0.380952
							if( d_k > 16.1874 )
								if( ad <= -597.364 )
									ret := -0.500000
								if( ad > -597.364 )
									ret := 0.000000
					if( smoothD_d > 74.368 )
						if( smoothD_d <= 75.9979 )
							if( d_k <= 23.898 )
								if( ad <= -81309.5 )
									ret := 0.952381 // buy
								if( ad > -81309.5 )
									ret := 0.142857
							if( d_k > 23.898 )
								ret := 0.909091 // buy
						if( smoothD_d > 75.9979 )
							if( d_k <= 18.0875 )
								if( ad <= -137726 )
									ret := 0.693548
								if( ad > -137726 )
									ret := 0.182561
							if( d_k > 18.0875 )
								if( smoothD_d <= 76.907 )
									ret := -0.642857
								if( smoothD_d > 76.907 )
									ret := 0.103448
	if( ad > 2398.07 )
		if( ad <= 10093.9 )
			if( ad_mf <= 8632.55 )
				if( mf <= 0.28326 )
					if( smoothD_d <= 36.5466 )
						if( k <= 18.8355 )
							if( ad <= 2684.02 )
								if( ad <= 2647.56 )
									ret := -0.144330
								if( ad > 2647.56 )
									ret := -0.888889 // sell
							if( ad > 2684.02 )
								if( smoothD_d <= 27.0713 )
									ret := 0.034169
								if( smoothD_d > 27.0713 )
									ret := -0.720000 // sell
						if( k > 18.8355 )
							if( ad <= 2512.68 )
								if( smoothK_k <= 20.3017 )
									ret := -0.214286
								if( smoothK_k > 20.3017 )
									ret := 0.537037
							if( ad > 2512.68 )
								if( rsi1 <= 39.3391 )
									ret := 0.022388
								if( rsi1 > 39.3391 )
									ret := -0.337679
					if( smoothD_d > 36.5466 )
						if( d_k <= 22.1418 )
							if( k <= 65.2389 )
								if( rsi1 <= 58.1534 )
									ret := 0.027864
								if( rsi1 > 58.1534 )
									ret := 0.265683
							if( k > 65.2389 )
								if( rsi1 <= 50.6803 )
									ret := 0.144444
								if( rsi1 > 50.6803 )
									ret := -0.088100
						if( d_k > 22.1418 )
							if( k <= 46.5095 )
								if( smoothK_k <= 35.1989 )
									ret := -0.675000
								if( smoothK_k > 35.1989 )
									ret := 0.000000
							if( k > 46.5095 )
								ret := -0.888889 // sell
				if( mf > 0.28326 )
					if( rsi1 <= 61.6444 )
						if( smoothD_d <= 90.1878 )
							if( rsi1 <= 59.0307 )
								if( d_k <= -13.495 )
									ret := 0.228571
								if( d_k > -13.495 )
									ret := -0.365432
							if( rsi1 > 59.0307 )
								if( k <= 38.0528 )
									ret := -0.954545 // sell
								if( k > 38.0528 )
									ret := -0.550000
						if( smoothD_d > 90.1878 )
							ret := 0.444444
					if( rsi1 > 61.6444 )
						if( ad_mf <= 3453.35 )
							if( d <= 86.2009 )
								if( d_k <= -4.27118 )
									ret := 0.632653
								if( d_k > -4.27118 )
									ret := 0.195652
							if( d > 86.2009 )
								if( d_k <= -0.372595 )
									ret := 0.214286
								if( d_k > -0.372595 )
									ret := -0.342857
						if( ad_mf > 3453.35 )
							if( ad <= 4753.96 )
								if( k <= 47.1057 )
									ret := -0.130435
								if( k > 47.1057 )
									ret := -0.471429
							if( ad > 4753.96 )
								if( d <= 51.3823 )
									ret := -0.620690
								if( d > 51.3823 )
									ret := 0.010526
			if( ad_mf > 8632.55 )
				if( d <= 14.4513 )
					if( d_k <= -1.17804 )
						if( k <= 10.9819 )
							ret := -0.300000
						if( k > 10.9819 )
							ret := 0.230769
					if( d_k > -1.17804 )
						if( rsi1 <= 39.2939 )
							if( ad_mf <= 9166.8 )
								ret := 0.300000
							if( ad_mf > 9166.8 )
								ret := 0.555556
						if( rsi1 > 39.2939 )
							ret := 0.916667 // buy
				if( d > 14.4513 )
					if( mf <= -0.137755 )
						if( mf <= -0.21828 )
							if( smoothK_k <= 51.8594 )
								if( smoothK_k <= 36.5285 )
									ret := -0.285714
								if( smoothK_k > 36.5285 )
									ret := -0.846154 // sell
							if( smoothK_k > 51.8594 )
								ret := 0.133333
						if( mf > -0.21828 )
							if( smoothK_k <= 46.3679 )
								ret := 0.705882 // buy
							if( smoothK_k > 46.3679 )
								if( d_k <= -5.31358 )
									ret := -0.533333
								if( d_k > -5.31358 )
									ret := 0.666667
					if( mf > -0.137755 )
						if( rsi1 <= 35.1973 )
							ret := 0.166667
						if( rsi1 > 35.1973 )
							if( rsi1 <= 54.8655 )
								if( d <= 18.134 )
									ret := 0.000000
								if( d > 18.134 )
									ret := -0.734597 // sell
							if( rsi1 > 54.8655 )
								if( smoothK_k <= 72.3652 )
									ret := -0.279720
								if( smoothK_k > 72.3652 )
									ret := -0.626582
		if( ad > 10093.9 )
			if( k <= 46.4968 )
				if( k <= 46.3265 )
					if( ad_mf <= 22196.7 )
						if( mf <= -0.196077 )
							if( ad_mf <= 14961.3 )
								if( smoothD_d <= 28.8699 )
									ret := -0.200000
								if( smoothD_d > 28.8699 )
									ret := 0.724138 // buy
							if( ad_mf > 14961.3 )
								if( d_k <= 7.31751 )
									ret := 0.726190 // buy
								if( d_k > 7.31751 )
									ret := -0.285714
						if( mf > -0.196077 )
							if( d_k <= 15.1633 )
								if( ad <= 21277.5 )
									ret := -0.186441
								if( ad > 21277.5 )
									ret := -0.734513 // sell
							if( d_k > 15.1633 )
								if( ad <= 20058.2 )
									ret := 0.319588
								if( ad > 20058.2 )
									ret := -0.968750 // sell
					if( ad_mf > 22196.7 )
						if( mf <= 0.825883 )
							if( ad_mf <= 407966 )
								if( ad_mf <= 22583.6 )
									ret := 0.775000 // buy
								if( ad_mf > 22583.6 )
									ret := 0.042868
							if( ad_mf > 407966 )
								if( d <= 28.3866 )
									ret := -0.267241
								if( d > 28.3866 )
									ret := 0.004695
						if( mf > 0.825883 )
							ret := 0.750000 // buy
				if( k > 46.3265 )
					if( smoothD_d <= 43.0688 )
						ret := 0.894737 // buy
					if( smoothD_d > 43.0688 )
						ret := 0.312500
			if( k > 46.4968 )
				if( mf <= -0.254458 )
					if( rsi1 <= 54.3428 )
						if( d_k <= -7.35344 )
							if( smoothD_d <= 55.3029 )
								if( rsi1 <= 52.5543 )
									ret := -0.384615
								if( rsi1 > 52.5543 )
									ret := 0.461538
							if( smoothD_d > 55.3029 )
								if( rsi1 <= 42.6127 )
									ret := -0.093750
								if( rsi1 > 42.6127 )
									ret := 0.714286 // buy
						if( d_k > -7.35344 )
							if( d <= 85.1076 )
								if( rsi1 <= 26.9212 )
									ret := 0.500000
								if( rsi1 > 26.9212 )
									ret := -0.482759
							if( d > 85.1076 )
								if( k <= 93.7891 )
									ret := -0.937500 // sell
								if( k > 93.7891 )
									ret := -0.500000
					if( rsi1 > 54.3428 )
						if( k <= 86.6521 )
							if( d_k <= 7.30431 )
								if( k <= 56.3776 )
									ret := -0.625000
								if( k > 56.3776 )
									ret := -0.872727 // sell
							if( d_k > 7.30431 )
								ret := -0.285714
						if( k > 86.6521 )
							if( ad <= 39589.5 )
								if( smoothK_k <= 90.7884 )
									ret := 0.000000
								if( smoothK_k > 90.7884 )
									ret := -0.357143
							if( ad > 39589.5 )
								if( smoothD_d <= 85.0742 )
									ret := -0.100000
								if( smoothD_d > 85.0742 )
									ret := -0.722222 // sell
				if( mf > -0.254458 )
					if( d <= 61.7706 )
						if( rsi1 <= 44.8108 )
							if( rsi1 <= 43.9629 )
								if( ad <= 36209.2 )
									ret := 0.330935
								if( ad > 36209.2 )
									ret := -0.133962
							if( rsi1 > 43.9629 )
								if( smoothK_k <= 59.3505 )
									ret := 0.636364
								if( smoothK_k > 59.3505 )
									ret := -0.235294
						if( rsi1 > 44.8108 )
							if( rsi1 <= 48.1767 )
								if( d <= 41.0492 )
									ret := -0.517647
								if( d > 41.0492 )
									ret := -0.197411
							if( rsi1 > 48.1767 )
								if( ad <= 15014 )
									ret := 0.186747
								if( ad > 15014 )
									ret := -0.122852
					if( d > 61.7706 )
						if( ad_mf <= 209288 )
							if( d_k <= -12.327 )
								if( d <= 66.364 )
									ret := 0.000000
								if( d > 66.364 )
									ret := 0.176357
							if( d_k > -12.327 )
								if( k <= 51.3312 )
									ret := 0.285714
								if( k > 51.3312 )
									ret := -0.017875
						if( ad_mf > 209288 )
							if( ad_mf <= 212281 )
								if( smoothD_d <= 81.0121 )
									ret := -0.911765 // sell
								if( smoothD_d > 81.0121 )
									ret := -0.333333
							if( ad_mf > 212281 )
								if( ad_mf <= 215184 )
									ret := 0.636364
								if( ad_mf > 215184 )
									ret := -0.118239
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_04555ff2(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


