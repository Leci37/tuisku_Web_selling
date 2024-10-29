//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: APPS_15Min_2CS0_7b3387f9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2CS0_7b3387f9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_7b3387f9(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad_mf <= 0.246039 )
		if( smoothK_k <= 6.07453 )
			if( ad <= -3640.87 )
				if( rsi1 <= 42.7478 )
					if( ad_mf <= -245942 )
						if( d_k <= 1.05624 )
							if( ad_mf <= -308602 )
								ret := -0.250000
							if( ad_mf > -308602 )
								if( mf <= -0.356396 )
									ret := 0.857143 // buy
								if( mf > -0.356396 )
									ret := 0.500000
						if( d_k > 1.05624 )
							if( mf <= -0.592179 )
								if( d <= 14.7807 )
									ret := 0.714286 // buy
								if( d > 14.7807 )
									ret := 1.000000 // buy
							if( mf > -0.592179 )
								if( mf <= -0.530149 )
									ret := -0.214286
								if( mf > -0.530149 )
									ret := 0.681159
					if( ad_mf > -245942 )
						if( ad_mf <= -229113 )
							if( smoothD_d <= 8.57107 )
								ret := -0.352941
							if( smoothD_d > 8.57107 )
								ret := -0.666667
						if( ad_mf > -229113 )
							if( smoothK_k <= 5.71582 )
								if( rsi1 <= 42.6986 )
									ret := 0.131514
								if( rsi1 > 42.6986 )
									ret := 1.000000 // buy
							if( smoothK_k > 5.71582 )
								if( ad_mf <= -31551.8 )
									ret := 0.180000
								if( ad_mf > -31551.8 )
									ret := 0.636364
				if( rsi1 > 42.7478 )
					if( mf <= -0.338617 )
						if( k <= 2.09473 )
							ret := -0.789474 // sell
						if( k > 2.09473 )
							ret := -0.333333
					if( mf > -0.338617 )
						if( ad <= -7060.33 )
							if( mf <= 0.205204 )
								if( ad_mf <= -13396.9 )
									ret := 0.095128
								if( ad_mf > -13396.9 )
									ret := 0.433735
							if( mf > 0.205204 )
								if( d_k <= 2.64753 )
									ret := -0.283582
								if( d_k > 2.64753 )
									ret := 0.055556
						if( ad > -7060.33 )
							if( mf <= 0.392831 )
								if( mf <= -0.149636 )
									ret := 0.222222
								if( mf > -0.149636 )
									ret := -0.428571
							if( mf > 0.392831 )
								ret := 0.666667
			if( ad > -3640.87 )
				if( d_k <= 0.367333 )
					if( ad_mf <= -1299.94 )
						if( smoothD_d <= -0.858152 )
							if( rsi1 <= 25.3063 )
								if( smoothK_k <= -2.80052 )
									ret := 0.882353 // buy
								if( smoothK_k > -2.80052 )
									ret := 0.500000
							if( rsi1 > 25.3063 )
								if( d_k <= -0.18896 )
									ret := -0.095238
								if( d_k > -0.18896 )
									ret := 0.380952
						if( smoothD_d > -0.858152 )
							if( ad_mf <= -3355.36 )
								if( ad_mf <= -3502.72 )
									ret := 0.833333 // buy
								if( ad_mf > -3502.72 )
									ret := 1.000000 // buy
							if( ad_mf > -3355.36 )
								if( ad_mf <= -2247.34 )
									ret := 0.491228
								if( ad_mf > -2247.34 )
									ret := 0.775510 // buy
					if( ad_mf > -1299.94 )
						if( ad_mf <= -636.987 )
							if( ad_mf <= -998.429 )
								if( rsi1 <= 36.2777 )
									ret := 0.733333 // buy
								if( rsi1 > 36.2777 )
									ret := 0.090909
							if( ad_mf > -998.429 )
								if( d <= 2.50815 )
									ret := 0.312500
								if( d > 2.50815 )
									ret := -0.529412
						if( ad_mf > -636.987 )
							if( ad <= -309.11 )
								if( rsi1 <= 32.5586 )
									ret := 1.000000 // buy
								if( rsi1 > 32.5586 )
									ret := 0.659574
							if( ad > -309.11 )
								if( rsi1 <= 47.7099 )
									ret := 0.417476
								if( rsi1 > 47.7099 )
									ret := -0.295775
				if( d_k > 0.367333 )
					if( k <= 3.7915 )
						if( smoothK_k <= 0.563343 )
							if( ad_mf <= -0.316147 )
								if( ad_mf <= -888.53 )
									ret := 0.178571
								if( ad_mf > -888.53 )
									ret := 0.520979
							if( ad_mf > -0.316147 )
								if( rsi1 <= 29.2826 )
									ret := -0.275862
								if( rsi1 > 29.2826 )
									ret := 0.083333
						if( smoothK_k > 0.563343 )
							if( k <= 3.59721 )
								ret := -0.888889 // sell
							if( k > 3.59721 )
								if( rsi1 <= 36.3522 )
									ret := 0.571429
								if( rsi1 > 36.3522 )
									ret := -0.387097
					if( k > 3.7915 )
						if( rsi1 <= 69.2998 )
							if( smoothK_k <= 3.83404 )
								if( smoothD_d <= 4.88171 )
									ret := 0.294118
								if( smoothD_d > 4.88171 )
									ret := 0.506375
							if( smoothK_k > 3.83404 )
								if( d <= 30.2914 )
									ret := 0.058968
								if( d > 30.2914 )
									ret := 0.666667
						if( rsi1 > 69.2998 )
							ret := -0.750000 // sell
		if( smoothK_k > 6.07453 )
			if( ad_mf <= -200.175 )
				if( rsi1 <= 40.9838 )
					if( ad <= -3001 )
						if( ad <= -3295.77 )
							if( d_k <= 5.84111 )
								if( ad_mf <= -151676 )
									ret := 0.360262
								if( ad_mf > -151676 )
									ret := 0.137617
							if( d_k > 5.84111 )
								if( mf <= -0.157352 )
									ret := 0.178902
								if( mf > -0.157352 )
									ret := -0.055958
						if( ad > -3295.77 )
							if( ad <= -3098.11 )
								if( smoothD_d <= 34.4711 )
									ret := -0.041667
								if( smoothD_d > 34.4711 )
									ret := -0.708333 // sell
							if( ad > -3098.11 )
								if( rsi1 <= 34.0494 )
									ret := -0.945946 // sell
								if( rsi1 > 34.0494 )
									ret := -0.142857
					if( ad > -3001 )
						if( ad <= -1548.3 )
							if( mf <= 0.638716 )
								if( ad_mf <= -2423.71 )
									ret := 0.558233
								if( ad_mf > -2423.71 )
									ret := 0.371938
							if( mf > 0.638716 )
								ret := -0.846154 // sell
						if( ad > -1548.3 )
							if( ad_mf <= -308.635 )
								if( d <= 5.08207 )
									ret := -0.846154 // sell
								if( d > 5.08207 )
									ret := 0.145363
							if( ad_mf > -308.635 )
								if( rsi1 <= 34.931 )
									ret := 0.777778 // buy
								if( rsi1 > 34.931 )
									ret := 0.298507
				if( rsi1 > 40.9838 )
					if( ad <= -300.9 )
						if( d_k <= 0.322728 )
							if( ad_mf <= -100311 )
								if( smoothK_k <= 22.3541 )
									ret := -0.115385
								if( smoothK_k > 22.3541 )
									ret := 0.206452
							if( ad_mf > -100311 )
								if( ad <= -43743.3 )
									ret := -0.198799
								if( ad > -43743.3 )
									ret := 0.012223
						if( d_k > 0.322728 )
							if( ad_mf <= -36692.8 )
								if( ad <= -124986 )
									ret := 0.157776
								if( ad > -124986 )
									ret := -0.053198
							if( ad_mf > -36692.8 )
								if( ad <= -36196.3 )
									ret := 0.796875 // buy
								if( ad > -36196.3 )
									ret := 0.096672
					if( ad > -300.9 )
						if( ad <= -280.594 )
							if( smoothK_k <= 95.3917 )
								if( smoothD_d <= 26.5281 )
									ret := 0.230769
								if( smoothD_d > 26.5281 )
									ret := 0.763636 // buy
							if( smoothK_k > 95.3917 )
								ret := -0.230769
						if( ad > -280.594 )
							if( smoothK_k <= 93.2023 )
								if( d_k <= -2.06412 )
									ret := -0.048780
								if( d_k > -2.06412 )
									ret := 0.401274
							if( smoothK_k > 93.2023 )
								ret := -0.333333
			if( ad_mf > -200.175 )
				if( rsi1 <= 47.7201 )
					if( smoothD_d <= 14.8939 )
						if( smoothD_d <= 13.367 )
							if( k <= 26.1172 )
								if( smoothD_d <= 11.261 )
									ret := 0.049759
								if( smoothD_d > 11.261 )
									ret := 0.471154
							if( k > 26.1172 )
								if( smoothD_d <= 11.3082 )
									ret := -0.944444 // sell
								if( smoothD_d > 11.3082 )
									ret := -0.535714
						if( smoothD_d > 13.367 )
							if( smoothK_k <= 16.3537 )
								if( rsi1 <= 33.5095 )
									ret := -0.755556 // sell
								if( rsi1 > 33.5095 )
									ret := -0.322034
							if( smoothK_k > 16.3537 )
								if( k <= 25.0247 )
									ret := 0.352941
								if( k > 25.0247 )
									ret := -0.375000
					if( smoothD_d > 14.8939 )
						if( rsi1 <= 44.7022 )
							if( smoothD_d <= 16.0678 )
								if( smoothK_k <= 10.2025 )
									ret := 0.897959 // buy
								if( smoothK_k > 10.2025 )
									ret := 0.472222
							if( smoothD_d > 16.0678 )
								if( d_k <= -8.78903 )
									ret := -0.008562
								if( d_k > -8.78903 )
									ret := 0.311288
						if( rsi1 > 44.7022 )
							if( d <= 79.1401 )
								if( smoothK_k <= 52.9315 )
									ret := 0.163200
								if( smoothK_k > 52.9315 )
									ret := -0.166667
							if( d > 79.1401 )
								if( smoothK_k <= 79.5233 )
									ret := 0.714286 // buy
								if( smoothK_k > 79.5233 )
									ret := 0.017699
				if( rsi1 > 47.7201 )
					if( d <= 20.4479 )
						if( k <= 29.0166 )
							if( ad_mf <= -0.174411 )
								if( k <= 26.2817 )
									ret := 0.032787
								if( k > 26.2817 )
									ret := 0.800000 // buy
							if( ad_mf > -0.174411 )
								if( k <= 10.9209 )
									ret := -0.770492 // sell
								if( k > 10.9209 )
									ret := -0.242188
						if( k > 29.0166 )
							if( rsi1 <= 60.786 )
								if( smoothK_k <= 34.7611 )
									ret := -0.622951
								if( smoothK_k > 34.7611 )
									ret := 0.750000 // buy
							if( rsi1 > 60.786 )
								if( d_k <= -22.4184 )
									ret := -0.600000
								if( d_k > -22.4184 )
									ret := -0.909091 // sell
					if( d > 20.4479 )
						if( d_k <= 4.33731 )
							if( smoothD_d <= 24.3303 )
								if( rsi1 <= 53.6786 )
									ret := 0.324786
								if( rsi1 > 53.6786 )
									ret := -0.111111
							if( smoothD_d > 24.3303 )
								if( rsi1 <= 57.4047 )
									ret := -0.067014
								if( rsi1 > 57.4047 )
									ret := -0.203149
						if( d_k > 4.33731 )
							if( smoothD_d <= 21.1424 )
								if( smoothK_k <= 8.81751 )
									ret := -0.411765
								if( smoothK_k > 8.81751 )
									ret := 0.785714 // buy
							if( smoothD_d > 21.1424 )
								if( k <= 29.8612 )
									ret := -0.196030
								if( k > 29.8612 )
									ret := 0.080130
	if( ad_mf > 0.246039 )
		if( d <= 17.5001 )
			if( d_k <= -15.9853 )
				if( ad_mf <= 10112.2 )
					if( mf <= -0.377858 )
						ret := 0.153846
					if( mf > -0.377858 )
						if( d_k <= -18.3226 )
							if( smoothK_k <= 30.2821 )
								ret := -1.000000 // sell
							if( smoothK_k > 30.2821 )
								ret := -0.750000 // sell
						if( d_k > -18.3226 )
							if( smoothD_d <= 10.8705 )
								ret := -0.300000
							if( smoothD_d > 10.8705 )
								ret := -0.823529 // sell
				if( ad_mf > 10112.2 )
					if( rsi1 <= 47.1813 )
						if( d <= 16.2946 )
							ret := -0.105263
						if( d > 16.2946 )
							ret := 0.545455
					if( rsi1 > 47.1813 )
						if( mf <= 0.068348 )
							ret := 0.000000
						if( mf > 0.068348 )
							if( smoothD_d <= 11.5021 )
								ret := -0.142857
							if( smoothD_d > 11.5021 )
								if( rsi1 <= 58.6583 )
									ret := -0.545455
								if( rsi1 > 58.6583 )
									ret := -0.916667 // sell
			if( d_k > -15.9853 )
				if( d_k <= 7.39966 )
					if( rsi1 <= 26.0916 )
						if( ad_mf <= 10.287 )
							if( smoothK_k <= -0.327752 )
								if( d <= 0.162886 )
									ret := 1.000000 // buy
								if( d > 0.162886 )
									ret := 0.750000 // buy
							if( smoothK_k > -0.327752 )
								if( d_k <= -2.46582 )
									ret := 0.560976
								if( d_k > -2.46582 )
									ret := 0.180000
						if( ad_mf > 10.287 )
							if( ad <= 6889.19 )
								if( ad <= 2944.93 )
									ret := 0.125828
								if( ad > 2944.93 )
									ret := -0.442623
							if( ad > 6889.19 )
								if( ad_mf <= 53098.6 )
									ret := 0.271784
								if( ad_mf > 53098.6 )
									ret := -0.044898
					if( rsi1 > 26.0916 )
						if( ad <= 61382.9 )
							if( rsi1 <= 49.2606 )
								if( smoothD_d <= -0.781515 )
									ret := -0.233553
								if( smoothD_d > -0.781515 )
									ret := -0.002005
							if( rsi1 > 49.2606 )
								if( ad_mf <= 3379.55 )
									ret := -0.363636
								if( ad_mf > 3379.55 )
									ret := -0.018470
						if( ad > 61382.9 )
							if( smoothK_k <= 19.4218 )
								if( ad_mf <= 61987.6 )
									ret := 1.000000 // buy
								if( ad_mf > 61987.6 )
									ret := 0.175691
							if( smoothK_k > 19.4218 )
								if( d <= 16.444 )
									ret := -0.069565
								if( d > 16.444 )
									ret := -0.633333
				if( d_k > 7.39966 )
					if( ad <= 27.7778 )
						if( rsi1 <= 28.1076 )
							ret := 0.368421
						if( rsi1 > 28.1076 )
							ret := 1.000000 // buy
					if( ad > 27.7778 )
						if( d <= 12.6825 )
							if( mf <= 0.376224 )
								if( smoothK_k <= -0.153793 )
									ret := -0.150442
								if( smoothK_k > -0.153793 )
									ret := 0.235294
							if( mf > 0.376224 )
								ret := 0.600000
						if( d > 12.6825 )
							if( smoothK_k <= -0.273828 )
								if( smoothK_k <= -2.32119 )
									ret := 0.156250
								if( smoothK_k > -2.32119 )
									ret := 0.651163
							if( smoothK_k > -0.273828 )
								if( d_k <= 10.5818 )
									ret := 0.217822
								if( d_k > 10.5818 )
									ret := -0.205128
		if( d > 17.5001 )
			if( smoothK_k <= 6.32471 )
				if( ad_mf <= 0.566135 )
					if( k <= 7.26286 )
						ret := -0.818182 // sell
					if( k > 7.26286 )
						ret := 0.416667
				if( ad_mf > 0.566135 )
					if( mf <= -0.335576 )
						if( mf <= -0.537096 )
							ret := 0.285714
						if( mf > -0.537096 )
							ret := 1.000000 // buy
					if( mf > -0.335576 )
						if( d_k <= 10.4867 )
							ret := -0.500000
						if( d_k > 10.4867 )
							if( ad <= 886.868 )
								if( d <= 21.8513 )
									ret := 1.000000 // buy
								if( d > 21.8513 )
									ret := 0.260870
							if( ad > 886.868 )
								if( smoothK_k <= 6.19505 )
									ret := 0.065789
								if( smoothK_k > 6.19505 )
									ret := 0.600000
			if( smoothK_k > 6.32471 )
				if( ad <= 4602.62 )
					if( ad_mf <= 0.933649 )
						if( smoothK_k <= 87.7285 )
							if( rsi1 <= 40.0453 )
								if( d <= 31.5123 )
									ret := -0.098160
								if( d > 31.5123 )
									ret := 0.309392
							if( rsi1 > 40.0453 )
								if( d <= 19.2951 )
									ret := -0.828571 // sell
								if( d > 19.2951 )
									ret := -0.066800
						if( smoothK_k > 87.7285 )
							if( k <= 97.479 )
								if( smoothD_d <= 84.5644 )
									ret := -0.742574 // sell
								if( smoothD_d > 84.5644 )
									ret := -0.379032
							if( k > 97.479 )
								if( smoothD_d <= 80.2842 )
									ret := 0.500000
								if( smoothD_d > 80.2842 )
									ret := -0.271523
					if( ad_mf > 0.933649 )
						if( ad_mf <= 427.109 )
							if( k <= 33.0485 )
								if( rsi1 <= 58.6611 )
									ret := -0.566667
								if( rsi1 > 58.6611 )
									ret := 0.117647
							if( k > 33.0485 )
								if( ad <= 397.888 )
									ret := -0.220481
								if( ad > 397.888 )
									ret := -0.457249
						if( ad_mf > 427.109 )
							if( mf <= 0.369912 )
								if( mf <= -0.234808 )
									ret := -0.082759
								if( mf > -0.234808 )
									ret := -0.233427
							if( mf > 0.369912 )
								if( ad <= 981.909 )
									ret := -0.285714
								if( ad > 981.909 )
									ret := 0.091241
				if( ad > 4602.62 )
					if( ad_mf <= 373387 )
						if( ad <= 213813 )
							if( smoothD_d <= 88.6885 )
								if( rsi1 <= 45.1819 )
									ret := -0.040329
								if( rsi1 > 45.1819 )
									ret := -0.101402
							if( smoothD_d > 88.6885 )
								if( d <= 91.9987 )
									ret := 0.385965
								if( d > 91.9987 )
									ret := -0.012739
						if( ad > 213813 )
							if( ad <= 220428 )
								if( d <= 46.3367 )
									ret := 0.250000
								if( d > 46.3367 )
									ret := -0.745098 // sell
							if( ad > 220428 )
								if( mf <= -0.002046 )
									ret := 0.297297
								if( mf > -0.002046 )
									ret := -0.233010
					if( ad_mf > 373387 )
						if( smoothD_d <= 43.7996 )
							if( smoothD_d <= 23.8129 )
								if( smoothD_d <= 20.4054 )
									ret := -0.409091
								if( smoothD_d > 20.4054 )
									ret := 0.875000 // buy
							if( smoothD_d > 23.8129 )
								if( ad_mf <= 456149 )
									ret := -0.074074
								if( ad_mf > 456149 )
									ret := -0.623188
						if( smoothD_d > 43.7996 )
							if( rsi1 <= 89.1515 )
								if( k <= 94.748 )
									ret := 0.271028
								if( k > 94.748 )
									ret := 0.662651
							if( rsi1 > 89.1515 )
								ret := -0.636364
	
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
float op_operation = decision_tree_0_APPS_15Min_7b3387f9(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


