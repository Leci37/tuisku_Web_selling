//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: LYFT_1Min_2CS0_438c9f93 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2CS0_438c9f93", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_438c9f93(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= 204.083 )
		if( rsi1 <= 52.4037 )
			if( ad_mf <= -1798.12 )
				if( smoothD_d <= 74.5825 )
					if( ad <= -220009 )
						if( smoothK_k <= 51.8549 )
							if( smoothK_k <= 10.4982 )
								if( smoothK_k <= -1.80637 )
									ret := 0.866667 // buy
								if( smoothK_k > -1.80637 )
									ret := -0.038462
							if( smoothK_k > 10.4982 )
								if( ad_mf <= -276236 )
									ret := 0.609756
								if( ad_mf > -276236 )
									ret := 0.967742 // buy
						if( smoothK_k > 51.8549 )
							if( rsi1 <= 41.9097 )
								ret := -0.307692
							if( rsi1 > 41.9097 )
								ret := 0.400000
					if( ad > -220009 )
						if( ad_mf <= -179538 )
							if( ad <= -194925 )
								if( d_k <= 10.1697 )
									ret := -0.789474 // sell
								if( d_k > 10.1697 )
									ret := 0.210526
							if( ad > -194925 )
								if( d_k <= 0.437657 )
									ret := -0.818182 // sell
								if( d_k > 0.437657 )
									ret := -0.968750 // sell
						if( ad_mf > -179538 )
							if( d_k <= -29.7171 )
								if( ad <= -9769.56 )
									ret := 0.923077 // buy
								if( ad > -9769.56 )
									ret := 0.500000
							if( d_k > -29.7171 )
								if( ad_mf <= -1973.39 )
									ret := 0.055913
								if( ad_mf > -1973.39 )
									ret := -0.319018
				if( smoothD_d > 74.5825 )
					if( k <= 91.2227 )
						if( ad <= -4567.57 )
							if( ad_mf <= -4767.55 )
								if( ad <= -4871.35 )
									ret := 0.195534
								if( ad > -4871.35 )
									ret := -0.750000 // sell
							if( ad_mf > -4767.55 )
								if( d_k <= -1.76674 )
									ret := 1.000000 // buy
								if( d_k > -1.76674 )
									ret := 0.571429
						if( ad > -4567.57 )
							if( ad_mf <= -2423.31 )
								if( d <= 88.4396 )
									ret := -0.540816
								if( d > 88.4396 )
									ret := 0.187500
							if( ad_mf > -2423.31 )
								if( smoothD_d <= 86.6379 )
									ret := 0.564103
								if( smoothD_d > 86.6379 )
									ret := 1.000000 // buy
					if( k > 91.2227 )
						if( smoothD_d <= 91.745 )
							if( smoothD_d <= 90.8861 )
								if( ad_mf <= -27764.5 )
									ret := -0.369231
								if( ad_mf > -27764.5 )
									ret := 0.071918
							if( smoothD_d > 90.8861 )
								if( smoothD_d <= 91.4229 )
									ret := 0.826087 // buy
								if( smoothD_d > 91.4229 )
									ret := 0.000000
						if( smoothD_d > 91.745 )
							if( ad <= -4729.8 )
								if( ad <= -4821.33 )
									ret := -0.243421
								if( ad > -4821.33 )
									ret := -0.769231 // sell
							if( ad > -4729.8 )
								if( mf <= 0.074164 )
									ret := 0.233333
								if( mf > 0.074164 )
									ret := -0.533333
			if( ad_mf > -1798.12 )
				if( ad <= -301.095 )
					if( ad <= -1525.49 )
						if( ad <= -1774.28 )
							if( smoothK_k <= 41.9664 )
								if( rsi1 <= 31.7518 )
									ret := 0.923077 // buy
								if( rsi1 > 31.7518 )
									ret := 0.466667
							if( smoothK_k > 41.9664 )
								if( mf <= -0.01739 )
									ret := 1.000000 // buy
								if( mf > -0.01739 )
									ret := 0.888889 // buy
						if( ad > -1774.28 )
							if( ad <= -1528.88 )
								if( k <= 9.89989 )
									ret := 0.360656
								if( k > 9.89989 )
									ret := -0.054545
							if( ad > -1528.88 )
								ret := -0.764706 // sell
					if( ad > -1525.49 )
						if( d <= 12.6339 )
							if( d <= 0.475154 )
								ret := -0.066667
							if( d > 0.475154 )
								if( smoothK_k <= -2.96624 )
									ret := 0.312500
								if( smoothK_k > -2.96624 )
									ret := 0.662281
						if( d > 12.6339 )
							if( ad_mf <= -977.815 )
								if( d <= 33.4662 )
									ret := 0.256410
								if( d > 33.4662 )
									ret := 0.673267
							if( ad_mf > -977.815 )
								if( smoothD_d <= 18.9763 )
									ret := 0.666667
								if( smoothD_d > 18.9763 )
									ret := 0.104651
				if( ad > -301.095 )
					if( k <= 68.1173 )
						if( rsi1 <= 44.4439 )
							if( smoothK_k <= 60.5365 )
								if( smoothD_d <= -2.64606 )
									ret := 0.552381
								if( smoothD_d > -2.64606 )
									ret := 0.191505
							if( smoothK_k > 60.5365 )
								if( rsi1 <= 38.7745 )
									ret := 0.800000 // buy
								if( rsi1 > 38.7745 )
									ret := 0.416667
						if( rsi1 > 44.4439 )
							if( mf <= 0.187592 )
								if( d <= 51.2493 )
									ret := 0.029876
								if( d > 51.2493 )
									ret := 0.254522
							if( mf > 0.187592 )
								if( rsi1 <= 51.1764 )
									ret := 0.284672
								if( rsi1 > 51.1764 )
									ret := -0.187500
					if( k > 68.1173 )
						if( smoothD_d <= 77.3571 )
							if( d <= 65.2679 )
								if( ad_mf <= 0.352625 )
									ret := 0.267516
								if( ad_mf > 0.352625 )
									ret := -0.367347
							if( d > 65.2679 )
								if( d <= 73.4001 )
									ret := -0.365385
								if( d > 73.4001 )
									ret := 0.030000
						if( smoothD_d > 77.3571 )
							if( smoothD_d <= 84.0868 )
								if( smoothD_d <= 80.5918 )
									ret := 0.169960
								if( smoothD_d > 80.5918 )
									ret := 0.519774
							if( smoothD_d > 84.0868 )
								if( d <= 91.1049 )
									ret := -0.173913
								if( d > 91.1049 )
									ret := 0.177632
		if( rsi1 > 52.4037 )
			if( mf <= 0.495362 )
				if( k <= 7.71088 )
					if( ad <= -21131.7 )
						if( d <= 15.0395 )
							if( rsi1 <= 59.4836 )
								if( ad_mf <= -46770.7 )
									ret := -0.461538
								if( ad_mf > -46770.7 )
									ret := -0.760000 // sell
							if( rsi1 > 59.4836 )
								ret := 0.000000
						if( d > 15.0395 )
							if( ad_mf <= -31966.1 )
								if( ad_mf <= -50495.3 )
									ret := -0.944444 // sell
								if( ad_mf > -50495.3 )
									ret := -0.571429
							if( ad_mf > -31966.1 )
								ret := -1.000000 // sell
					if( ad > -21131.7 )
						if( ad <= -7288.06 )
							if( d_k <= 7.51812 )
								if( k <= 3.98219 )
									ret := -0.050000
								if( k > 3.98219 )
									ret := 0.464286
							if( d_k > 7.51812 )
								if( ad <= -11258.7 )
									ret := -0.916667 // sell
								if( ad > -11258.7 )
									ret := 0.166667
						if( ad > -7288.06 )
							if( k <= 7.52199 )
								if( d_k <= -0.737875 )
									ret := 0.117647
								if( d_k > -0.737875 )
									ret := -0.384181
							if( k > 7.52199 )
								ret := -1.000000 // sell
				if( k > 7.71088 )
					if( smoothD_d <= 66.9816 )
						if( d_k <= -14.6508 )
							if( k <= 58.7777 )
								if( rsi1 <= 69.1274 )
									ret := 0.020134
								if( rsi1 > 69.1274 )
									ret := -0.564103
							if( k > 58.7777 )
								if( smoothK_k <= 58.0238 )
									ret := -0.670732
								if( smoothK_k > 58.0238 )
									ret := -0.204757
						if( d_k > -14.6508 )
							if( smoothD_d <= 14.3292 )
								if( smoothD_d <= 10.659 )
									ret := -0.068592
								if( smoothD_d > 10.659 )
									ret := 0.241935
							if( smoothD_d > 14.3292 )
								if( ad <= -3740.73 )
									ret := -0.018728
								if( ad > -3740.73 )
									ret := -0.156788
					if( smoothD_d > 66.9816 )
						if( k <= 72.3905 )
							if( mf <= 0.317081 )
								if( mf <= 0.212868 )
									ret := 0.082808
								if( mf > 0.212868 )
									ret := -0.153465
							if( mf > 0.317081 )
								if( ad_mf <= -0.462521 )
									ret := 0.268657
								if( ad_mf > -0.462521 )
									ret := 0.631579
						if( k > 72.3905 )
							if( rsi1 <= 86.9697 )
								if( mf <= 0.001759 )
									ret := -0.000516
								if( mf > 0.001759 )
									ret := -0.083167
							if( rsi1 > 86.9697 )
								if( rsi1 <= 93.2156 )
									ret := -0.439024
								if( rsi1 > 93.2156 )
									ret := -0.014925
			if( mf > 0.495362 )
				if( d <= 44.3035 )
					if( d_k <= -15.7392 )
						if( d <= 29.9816 )
							ret := -0.250000
						if( d > 29.9816 )
							if( smoothK_k <= 56.4772 )
								ret := -0.916667 // sell
							if( smoothK_k > 56.4772 )
								ret := -0.454545
					if( d_k > -15.7392 )
						if( d_k <= 0.862039 )
							if( d_k <= -11.1951 )
								ret := 0.625000
							if( d_k > -11.1951 )
								if( rsi1 <= 60.0484 )
									ret := -0.666667
								if( rsi1 > 60.0484 )
									ret := 0.214286
						if( d_k > 0.862039 )
							if( k <= 31.9446 )
								if( ad <= -56.2879 )
									ret := -0.181818
								if( ad > -56.2879 )
									ret := 0.347826
							if( k > 31.9446 )
								ret := 1.000000 // buy
				if( d > 44.3035 )
					if( smoothD_d <= 48.2356 )
						if( mf <= 0.594325 )
							if( smoothD_d <= 45.2427 )
								ret := -0.933333 // sell
							if( smoothD_d > 45.2427 )
								ret := -1.000000 // sell
						if( mf > 0.594325 )
							ret := -0.692308
					if( smoothD_d > 48.2356 )
						if( smoothK_k <= 51.1956 )
							ret := 0.631579
						if( smoothK_k > 51.1956 )
							if( ad <= -845 )
								if( smoothD_d <= 68.3512 )
									ret := -0.894737 // sell
								if( smoothD_d > 68.3512 )
									ret := 0.105263
							if( ad > -845 )
								if( mf <= 0.576114 )
									ret := -0.300000
								if( mf > 0.576114 )
									ret := -0.680328
	if( ad > 204.083 )
		if( ad_mf <= 1244.63 )
			if( smoothD_d <= 4.0515 )
				if( mf <= -0.265533 )
					ret := -0.190476
				if( mf > -0.265533 )
					if( mf <= -0.120175 )
						ret := 0.615385
					if( mf > -0.120175 )
						if( rsi1 <= 42.462 )
							if( ad <= 784.415 )
								ret := 0.266667
							if( ad > 784.415 )
								ret := 0.625000
						if( rsi1 > 42.462 )
							if( smoothK_k <= 3.65236 )
								ret := -0.125000
							if( smoothK_k > 3.65236 )
								ret := -0.444444
			if( smoothD_d > 4.0515 )
				if( ad_mf <= 1184.03 )
					if( smoothK_k <= 33.8345 )
						if( d <= 41.5767 )
							if( d_k <= 8.87911 )
								if( mf <= -0.23214 )
									ret := -0.800000 // sell
								if( mf > -0.23214 )
									ret := -0.214533
							if( d_k > 8.87911 )
								if( ad_mf <= 678.357 )
									ret := 0.555556
								if( ad_mf > 678.357 )
									ret := -0.144928
						if( d > 41.5767 )
							if( d_k <= 14.7473 )
								ret := 1.000000 // buy
							if( d_k > 14.7473 )
								if( k <= 28.3541 )
									ret := -0.062500
								if( k > 28.3541 )
									ret := 0.272727
					if( smoothK_k > 33.8345 )
						if( ad <= 381.242 )
							if( ad <= 264.151 )
								if( d_k <= -2.41248 )
									ret := 0.230769
								if( d_k > -2.41248 )
									ret := -0.650794
							if( ad > 264.151 )
								if( rsi1 <= 67.8691 )
									ret := -0.032787
								if( rsi1 > 67.8691 )
									ret := 0.641026
						if( ad > 381.242 )
							if( d_k <= 1.21876 )
								if( d_k <= -13.8636 )
									ret := -0.225564
								if( d_k > -13.8636 )
									ret := -0.528184
							if( d_k > 1.21876 )
								if( ad_mf <= 649.085 )
									ret := -0.478632
								if( ad_mf > 649.085 )
									ret := -0.061224
				if( ad_mf > 1184.03 )
					if( d <= 81.1271 )
						if( smoothK_k <= 58.4824 )
							if( mf <= 0.019756 )
								if( rsi1 <= 47.3053 )
									ret := -0.142857
								if( rsi1 > 47.3053 )
									ret := -0.714286 // sell
							if( mf > 0.019756 )
								if( k <= 37.0129 )
									ret := -0.961538 // sell
								if( k > 37.0129 )
									ret := -0.750000 // sell
						if( smoothK_k > 58.4824 )
							if( mf <= 0.021419 )
								ret := -1.000000 // sell
							if( mf > 0.021419 )
								ret := -0.666667
					if( d > 81.1271 )
						ret := -0.352941
		if( ad_mf > 1244.63 )
			if( smoothK_k <= 90.7149 )
				if( ad <= 168940 )
					if( k <= 9.85745 )
						if( ad <= 18871.6 )
							if( ad_mf <= 15864.6 )
								if( mf <= 0.163642 )
									ret := 0.132104
								if( mf > 0.163642 )
									ret := -0.064368
							if( ad_mf > 15864.6 )
								if( smoothK_k <= 2.56496 )
									ret := 0.596774
								if( smoothK_k > 2.56496 )
									ret := -0.010417
						if( ad > 18871.6 )
							if( ad_mf <= 20405.1 )
								if( smoothK_k <= 4.95366 )
									ret := -0.517241
								if( smoothK_k > 4.95366 )
									ret := 0.333333
							if( ad_mf > 20405.1 )
								if( smoothK_k <= 0.682243 )
									ret := -0.128302
								if( smoothK_k > 0.682243 )
									ret := 0.043315
					if( k > 9.85745 )
						if( k <= 49.4358 )
							if( rsi1 <= 27.0637 )
								if( k <= 15.3786 )
									ret := 0.048387
								if( k > 15.3786 )
									ret := 0.225904
							if( rsi1 > 27.0637 )
								if( k <= 49.3265 )
									ret := -0.078622
								if( k > 49.3265 )
									ret := -0.550000
						if( k > 49.4358 )
							if( ad_mf <= 134216 )
								if( rsi1 <= 45.9796 )
									ret := 0.099250
								if( rsi1 > 45.9796 )
									ret := -0.045463
							if( ad_mf > 134216 )
								if( smoothD_d <= 84.8851 )
									ret := -0.609195
								if( smoothD_d > 84.8851 )
									ret := 0.375000
				if( ad > 168940 )
					if( d <= 21.321 )
						if( mf <= -0.136484 )
							ret := 0.428571
						if( mf > -0.136484 )
							if( mf <= 0.270206 )
								if( mf <= 0.035587 )
									ret := -1.000000 // sell
								if( mf > 0.035587 )
									ret := -0.744186 // sell
							if( mf > 0.270206 )
								if( k <= 4.48333 )
									ret := -0.900000 // sell
								if( k > 4.48333 )
									ret := -1.000000 // sell
					if( d > 21.321 )
						if( smoothD_d <= 86.2902 )
							if( ad <= 852911 )
								if( rsi1 <= 55.5359 )
									ret := 0.416667
								if( rsi1 > 55.5359 )
									ret := -0.443114
							if( ad > 852911 )
								if( d <= 56.4547 )
									ret := -0.967742 // sell
								if( d > 56.4547 )
									ret := -0.785714 // sell
						if( smoothD_d > 86.2902 )
							if( rsi1 <= 67.8815 )
								ret := 0.800000 // buy
							if( rsi1 > 67.8815 )
								ret := 0.142857
			if( smoothK_k > 90.7149 )
				if( ad_mf <= 78225.4 )
					if( smoothK_k <= 96.9232 )
						if( ad <= 7742.77 )
							if( d <= 98.2615 )
								if( rsi1 <= 85.4715 )
									ret := -0.121339
								if( rsi1 > 85.4715 )
									ret := -0.655172
							if( d > 98.2615 )
								if( d_k <= -0.357442 )
									ret := 0.562500
								if( d_k > -0.357442 )
									ret := 0.107143
						if( ad > 7742.77 )
							if( mf <= 0.257612 )
								if( mf <= 0.248815 )
									ret := -0.311628
								if( mf > 0.248815 )
									ret := -0.848485 // sell
							if( mf > 0.257612 )
								if( rsi1 <= 81.8864 )
									ret := -0.047970
								if( rsi1 > 81.8864 )
									ret := -0.475248
					if( smoothK_k > 96.9232 )
						if( d <= 95.6232 )
							if( ad <= 46957.2 )
								if( smoothD_d <= 83.9529 )
									ret := -0.243902
								if( smoothD_d > 83.9529 )
									ret := 0.108209
							if( ad > 46957.2 )
								if( mf <= 0.158165 )
									ret := 0.750000 // buy
								if( mf > 0.158165 )
									ret := 0.416667
						if( d > 95.6232 )
							if( ad_mf <= 11558.1 )
								if( d_k <= -3.44307 )
									ret := -0.606061
								if( d_k > -3.44307 )
									ret := 0.004950
							if( ad_mf > 11558.1 )
								if( ad <= 11596.3 )
									ret := -1.000000 // sell
								if( ad > 11596.3 )
									ret := -0.256757
				if( ad_mf > 78225.4 )
					if( rsi1 <= 69.8395 )
						if( rsi1 <= 58.6833 )
							ret := 0.000000
						if( rsi1 > 58.6833 )
							if( ad_mf <= 105403 )
								if( ad_mf <= 89161.5 )
									ret := 0.529412
								if( ad_mf > 89161.5 )
									ret := 1.000000 // buy
							if( ad_mf > 105403 )
								ret := 0.333333
					if( rsi1 > 69.8395 )
						if( ad_mf <= 84267.4 )
							ret := 0.785714 // buy
						if( ad_mf > 84267.4 )
							if( ad_mf <= 120251 )
								if( rsi1 <= 78.6315 )
									ret := 0.071429
								if( rsi1 > 78.6315 )
									ret := -0.612903
							if( ad_mf > 120251 )
								if( rsi1 <= 81.4453 )
									ret := -0.184211
								if( rsi1 > 81.4453 )
									ret := 0.655172
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_LYFT_1Min_438c9f93(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


