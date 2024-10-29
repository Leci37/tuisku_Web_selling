//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: MSFT_1Min_2SV0_e3a465d2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2SV0_e3a465d2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_e3a465d2(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( VIP <= 4.50009 )
		if( rsi1 <= 47.4738 )
			if( d_k <= 5.69175 )
				if( VIM <= 1.53008 )
					if( VIP <= 0.907599 )
						if( d_k <= -19.3589 )
							if( smoothD_d <= 52.6451 )
								if( smoothD_d <= 51.3892 )
									ret := -0.260047
								if( smoothD_d > 51.3892 )
									ret := 0.826087 // buy
							if( smoothD_d > 52.6451 )
								if( VIM <= 1.15305 )
									ret := -0.728261 // sell
								if( VIM > 1.15305 )
									ret := -0.337079
						if( d_k > -19.3589 )
							if( smoothK_k <= 96.4856 )
								if( VIP_VIM <= -0.882448 )
									ret := -0.305344
								if( VIP_VIM > -0.882448 )
									ret := -0.021571
							if( smoothK_k > 96.4856 )
								if( VIP_VIM <= -0.27184 )
									ret := 0.298851
								if( VIP_VIM > -0.27184 )
									ret := 0.694915
					if( VIP > 0.907599 )
						if( rsi1 <= 39.326 )
							if( VIP <= 1.19799 )
								if( k <= 6.02426 )
									ret := 0.011442
								if( k > 6.02426 )
									ret := 0.221034
							if( VIP > 1.19799 )
								if( rsi1 <= 33.9124 )
									ret := 0.728261 // buy
								if( rsi1 > 33.9124 )
									ret := 0.300000
						if( rsi1 > 39.326 )
							if( d_k <= -4.25992 )
								if( k <= 24.1915 )
									ret := -0.347222
								if( k > 24.1915 )
									ret := -0.011507
							if( d_k > -4.25992 )
								if( smoothK_k <= 17.4615 )
									ret := -0.005283
								if( smoothK_k > 17.4615 )
									ret := 0.143805
				if( VIM > 1.53008 )
					if( rsi1 <= 35.3519 )
						if( smoothK_k <= 2.0988 )
							if( rsi1 <= 2.10331 )
								if( d_k <= -0.074952 )
									ret := 1.000000 // buy
								if( d_k > -0.074952 )
									ret := 0.923077 // buy
							if( rsi1 > 2.10331 )
								if( smoothD_d <= -2.96885 )
									ret := -0.418367
								if( smoothD_d > -2.96885 )
									ret := 0.086897
						if( smoothK_k > 2.0988 )
							if( smoothD_d <= 0.667759 )
								if( smoothK_k <= 2.64594 )
									ret := 0.583333
								if( smoothK_k > 2.64594 )
									ret := -0.385965
							if( smoothD_d > 0.667759 )
								if( d <= 79.0545 )
									ret := 0.323288
								if( d > 79.0545 )
									ret := 0.790323 // buy
					if( rsi1 > 35.3519 )
						if( k <= 35.781 )
							if( k <= 24.6296 )
								if( smoothD_d <= 1.28118 )
									ret := -0.360515
								if( smoothD_d > 1.28118 )
									ret := 0.019370
							if( k > 24.6296 )
								if( rsi1 <= 46.91 )
									ret := -0.336343
								if( rsi1 > 46.91 )
									ret := 0.684211
						if( k > 35.781 )
							if( smoothK_k <= 33.0958 )
								ret := 1.000000 // buy
							if( smoothK_k > 33.0958 )
								if( smoothK_k <= 82.3134 )
									ret := 0.089466
								if( smoothK_k > 82.3134 )
									ret := -0.129870
			if( d_k > 5.69175 )
				if( VIM <= 1.37364 )
					if( VIP_VIM <= -0.553924 )
						if( smoothD_d <= 5.38552 )
							if( VIP_VIM <= -0.74953 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.74953 )
								if( d <= 7.31449 )
									ret := 0.217391
								if( d > 7.31449 )
									ret := 0.692308
						if( smoothD_d > 5.38552 )
							if( k <= 30.7256 )
								if( k <= 0.700749 )
									ret := 0.013333
								if( k > 0.700749 )
									ret := -0.525000
							if( k > 30.7256 )
								if( VIM <= 1.26312 )
									ret := -0.576923
								if( VIM > 1.26312 )
									ret := 0.310811
					if( VIP_VIM > -0.553924 )
						if( d_k <= 6.3149 )
							if( d_k <= 5.85129 )
								if( smoothK_k <= 28.698 )
									ret := 0.262295
								if( smoothK_k > 28.698 )
									ret := 0.682927
							if( d_k > 5.85129 )
								if( rsi1 <= 26.6636 )
									ret := 0.605263
								if( rsi1 > 26.6636 )
									ret := 0.185841
						if( d_k > 6.3149 )
							if( smoothK_k <= -0.489249 )
								if( VIP <= 0.76036 )
									ret := 0.373494
								if( VIP > 0.76036 )
									ret := -0.184655
							if( smoothK_k > -0.489249 )
								if( k <= 2.8212 )
									ret := 0.775000 // buy
								if( k > 2.8212 )
									ret := 0.065552
				if( VIM > 1.37364 )
					if( rsi1 <= 31.5665 )
						if( VIP_VIM <= -1.02727 )
							if( d <= 16.628 )
								if( d_k <= 9.63981 )
									ret := -0.235294
								if( d_k > 9.63981 )
									ret := 0.933333 // buy
							if( d > 16.628 )
								if( VIP_VIM <= -1.3379 )
									ret := 0.879310 // buy
								if( VIP_VIM > -1.3379 )
									ret := 0.584158
						if( VIP_VIM > -1.02727 )
							if( k <= 24.6521 )
								if( d <= 36.7975 )
									ret := 0.288165
								if( d > 36.7975 )
									ret := -0.457627
							if( k > 24.6521 )
								if( k <= 40.0727 )
									ret := 0.646667
								if( k > 40.0727 )
									ret := 0.094737
					if( rsi1 > 31.5665 )
						if( smoothK_k <= 35.178 )
							if( VIM <= 3.79802 )
								if( VIP <= 0.876056 )
									ret := 0.666667
								if( VIP > 0.876056 )
									ret := -0.002591
							if( VIM > 3.79802 )
								if( smoothD_d <= 39.1045 )
									ret := 0.570000
								if( smoothD_d > 39.1045 )
									ret := -0.357143
						if( smoothK_k > 35.178 )
							if( d_k <= 6.3221 )
								if( smoothD_d <= 69.262 )
									ret := 0.206897
								if( smoothD_d > 69.262 )
									ret := -0.386364
							if( d_k > 6.3221 )
								if( d_k <= 22.4368 )
									ret := 0.283498
								if( d_k > 22.4368 )
									ret := 0.773585 // buy
		if( rsi1 > 47.4738 )
			if( VIP_VIM <= 0.864632 )
				if( k <= 3.42563 )
					if( rsi1 <= 48.2463 )
						if( k <= 1.69011 )
							if( VIP_VIM <= 0.022598 )
								if( d_k <= 2.58637 )
									ret := -0.850000 // sell
								if( d_k > 2.58637 )
									ret := -0.538462
							if( VIP_VIM > 0.022598 )
								ret := -0.230769
						if( k > 1.69011 )
							if( smoothK_k <= 0.056326 )
								ret := 0.083333
							if( smoothK_k > 0.056326 )
								ret := -0.700000 // sell
					if( rsi1 > 48.2463 )
						if( rsi1 <= 69.5086 )
							if( d <= 0.850212 )
								if( VIM <= 0.983463 )
									ret := 0.602740
								if( VIM > 0.983463 )
									ret := -0.094595
							if( d > 0.850212 )
								if( VIP <= 1.02943 )
									ret := 0.019608
								if( VIP > 1.02943 )
									ret := -0.314621
						if( rsi1 > 69.5086 )
							ret := 0.523810
				if( k > 3.42563 )
					if( rsi1 <= 91.5258 )
						if( VIM <= 0.903112 )
							if( rsi1 <= 61.2399 )
								if( k <= 53.7079 )
									ret := -0.008204
								if( k > 53.7079 )
									ret := 0.199896
							if( rsi1 > 61.2399 )
								if( k <= 97.2289 )
									ret := -0.024110
								if( k > 97.2289 )
									ret := 0.052394
						if( VIM > 0.903112 )
							if( smoothD_d <= 1.769 )
								if( VIM <= 1.20109 )
									ret := 0.311741
								if( VIM > 1.20109 )
									ret := -0.298507
							if( smoothD_d > 1.769 )
								if( VIM <= 0.903488 )
									ret := -0.543478
								if( VIM > 0.903488 )
									ret := -0.047562
					if( rsi1 > 91.5258 )
						if( smoothK_k <= 96.9071 )
							if( VIM <= 0.593039 )
								ret := -0.095238
							if( VIM > 0.593039 )
								if( d <= 96.1302 )
									ret := 0.450000
								if( d > 96.1302 )
									ret := 0.944444 // buy
						if( smoothK_k > 96.9071 )
							if( rsi1 <= 93.1966 )
								ret := -0.100000
							if( rsi1 > 93.1966 )
								ret := -0.470588
			if( VIP_VIM > 0.864632 )
				if( rsi1 <= 94.4278 )
					if( VIM <= 2.14668 )
						if( VIM <= 0.667013 )
							if( rsi1 <= 83.2941 )
								if( d_k <= -7.42395 )
									ret := -0.235294
								if( d_k > -7.42395 )
									ret := 0.561798
							if( rsi1 > 83.2941 )
								if( d <= 99.9878 )
									ret := -0.267399
								if( d > 99.9878 )
									ret := 0.405405
						if( VIM > 0.667013 )
							if( smoothD_d <= 88.3814 )
								if( smoothD_d <= 22.6131 )
									ret := -0.660714
								if( smoothD_d > 22.6131 )
									ret := -0.191843
							if( smoothD_d > 88.3814 )
								if( d_k <= -0.87088 )
									ret := -0.677966
								if( d_k > -0.87088 )
									ret := -0.451957
					if( VIM > 2.14668 )
						if( rsi1 <= 86.4207 )
							if( rsi1 <= 83.1048 )
								if( d_k <= 19.859 )
									ret := -0.011494
								if( d_k > 19.859 )
									ret := 0.689655
							if( rsi1 > 83.1048 )
								ret := 0.588235
						if( rsi1 > 86.4207 )
							if( d <= 98.0025 )
								ret := -0.750000 // sell
							if( d > 98.0025 )
								ret := -0.909091 // sell
				if( rsi1 > 94.4278 )
					if( VIM <= 0.507616 )
						if( rsi1 <= 95.2042 )
							ret := 1.000000 // buy
						if( rsi1 > 95.2042 )
							if( k <= 99.9713 )
								ret := 1.000000 // buy
							if( k > 99.9713 )
								ret := 0.000000
					if( VIM > 0.507616 )
						if( VIM <= 0.570562 )
							ret := -0.416667
						if( VIM > 0.570562 )
							if( smoothK_k <= 95.3003 )
								ret := -0.200000
							if( smoothK_k > 95.3003 )
								if( k <= 99.7609 )
									ret := 0.923077 // buy
								if( k > 99.7609 )
									ret := 0.521739
	if( VIP > 4.50009 )
		if( smoothK_k <= 7.69791 )
			if( d_k <= 25.4331 )
				if( VIM <= 36.1936 )
					if( VIM <= 6.40974 )
						if( d <= 17.2323 )
							if( VIP <= 5.24859 )
								if( d_k <= 0.697209 )
									ret := 0.328571
								if( d_k > 0.697209 )
									ret := 0.810526 // buy
							if( VIP > 5.24859 )
								if( smoothD_d <= -1.77643 )
									ret := -0.416667
								if( smoothD_d > -1.77643 )
									ret := 0.516129
						if( d > 17.2323 )
							if( smoothK_k <= 2.59209 )
								ret := 0.615385
							if( smoothK_k > 2.59209 )
								if( VIM <= 5.29248 )
									ret := -0.285714
								if( VIM > 5.29248 )
									ret := -0.444444
					if( VIM > 6.40974 )
						if( VIP_VIM <= -0.912867 )
							if( d_k <= 8.91521 )
								if( VIP <= 13.1738 )
									ret := 0.546341
								if( VIP > 13.1738 )
									ret := 0.238806
							if( d_k > 8.91521 )
								if( k <= 6.17024 )
									ret := -0.052632
								if( k > 6.17024 )
									ret := -0.384615
						if( VIP_VIM > -0.912867 )
							if( d <= 15.8972 )
								if( d <= 8.36413 )
									ret := 0.098214
								if( d > 8.36413 )
									ret := -0.370370
							if( d > 15.8972 )
								if( d <= 20.1741 )
									ret := 0.812500 // buy
								if( d > 20.1741 )
									ret := 0.240000
				if( VIM > 36.1936 )
					if( smoothK_k <= -2.84466 )
						if( VIM <= 43.625 )
							ret := -1.000000 // sell
						if( VIM > 43.625 )
							if( VIP_VIM <= -0.269628 )
								ret := -0.500000
							if( VIP_VIM > -0.269628 )
								ret := 0.000000
					if( smoothK_k > -2.84466 )
						if( VIP <= 77.351 )
							if( d <= 11.5411 )
								if( smoothD_d <= 1.5855 )
									ret := -0.076923
								if( smoothD_d > 1.5855 )
									ret := -0.692308
							if( d > 11.5411 )
								ret := 0.090909
						if( VIP > 77.351 )
							if( VIP <= 680.762 )
								if( VIP <= 123.113 )
									ret := 0.769231 // buy
								if( VIP > 123.113 )
									ret := 0.347826
							if( VIP > 680.762 )
								ret := -0.461538
			if( d_k > 25.4331 )
				ret := 1.000000 // buy
		if( smoothK_k > 7.69791 )
			if( rsi1 <= 75.2998 )
				if( smoothK_k <= 23.3656 )
					if( k <= 17.7718 )
						if( k <= 15.2719 )
							if( smoothD_d <= 4.38538 )
								if( VIP <= 5.61672 )
									ret := 0.842105 // buy
								if( VIP > 5.61672 )
									ret := 0.222222
							if( smoothD_d > 4.38538 )
								if( VIM <= 11.0772 )
									ret := 0.055556
								if( VIM > 11.0772 )
									ret := -0.296296
						if( k > 15.2719 )
							if( VIP_VIM <= 0.263529 )
								if( d_k <= 4.58599 )
									ret := 0.350000
								if( d_k > 4.58599 )
									ret := -0.232558
							if( VIP_VIM > 0.263529 )
								if( VIP <= 9.37045 )
									ret := 0.200000
								if( VIP > 9.37045 )
									ret := 0.739130 // buy
					if( k > 17.7718 )
						if( smoothD_d <= 33.7655 )
							if( d_k <= -0.518308 )
								if( smoothD_d <= 14.0584 )
									ret := -0.298343
								if( smoothD_d > 14.0584 )
									ret := 0.229885
							if( d_k > -0.518308 )
								if( smoothD_d <= 19.6455 )
									ret := -0.835821 // sell
								if( smoothD_d > 19.6455 )
									ret := -0.288889
						if( smoothD_d > 33.7655 )
							if( VIP <= 8.07324 )
								if( smoothD_d <= 34.9332 )
									ret := 0.882353 // buy
								if( smoothD_d > 34.9332 )
									ret := 0.258065
							if( VIP > 8.07324 )
								if( smoothD_d <= 36.7055 )
									ret := -0.523810
								if( smoothD_d > 36.7055 )
									ret := 0.052632
				if( smoothK_k > 23.3656 )
					if( k <= 30.1778 )
						if( smoothD_d <= 41.2581 )
							if( VIP <= 17.3144 )
								if( VIM <= 5.08788 )
									ret := 0.000000
								if( VIM > 5.08788 )
									ret := 0.641921
							if( VIP > 17.3144 )
								if( VIM <= 72.1031 )
									ret := -0.256410
								if( VIM > 72.1031 )
									ret := 0.636364
						if( smoothD_d > 41.2581 )
							if( VIP <= 5.47894 )
								ret := 0.600000
							if( VIP > 5.47894 )
								if( d_k <= 23.05 )
									ret := -0.428571
								if( d_k > 23.05 )
									ret := 0.166667
					if( k > 30.1778 )
						if( VIM <= 44.0739 )
							if( smoothK_k <= 31.9111 )
								if( smoothD_d <= 21.4469 )
									ret := -0.463415
								if( smoothD_d > 21.4469 )
									ret := -0.056537
							if( smoothK_k > 31.9111 )
								if( d_k <= 19.187 )
									ret := 0.130556
								if( d_k > 19.187 )
									ret := -0.257426
						if( VIM > 44.0739 )
							if( smoothK_k <= 59.1514 )
								if( d <= 31.4837 )
									ret := -0.898305 // sell
								if( d > 31.4837 )
									ret := -0.379845
							if( smoothK_k > 59.1514 )
								if( VIP_VIM <= -1.07143 )
									ret := 0.736842 // buy
								if( VIP_VIM > -1.07143 )
									ret := -0.102362
			if( rsi1 > 75.2998 )
				if( rsi1 <= 78.8347 )
					if( k <= 99.9394 )
						if( VIM <= 28.3771 )
							if( d <= 63.2083 )
								ret := -0.950000 // sell
							if( d > 63.2083 )
								if( VIP_VIM <= 1.25318 )
									ret := -0.383721
								if( VIP_VIM > 1.25318 )
									ret := -0.761194 // sell
						if( VIM > 28.3771 )
							if( VIM <= 49.1844 )
								ret := 0.583333
							if( VIM > 49.1844 )
								if( VIM <= 85.9583 )
									ret := -0.500000
								if( VIM > 85.9583 )
									ret := 0.307692
					if( k > 99.9394 )
						ret := 0.214286
				if( rsi1 > 78.8347 )
					if( smoothD_d <= 88.4852 )
						if( smoothD_d <= 87.5697 )
							if( d_k <= -6.94395 )
								if( smoothK_k <= 81.6693 )
									ret := 0.615385
								if( smoothK_k > 81.6693 )
									ret := 0.152542
							if( d_k > -6.94395 )
								if( smoothD_d <= 83.7414 )
									ret := 0.042553
								if( smoothD_d > 83.7414 )
									ret := -0.703704 // sell
						if( smoothD_d > 87.5697 )
							ret := 0.950000 // buy
					if( smoothD_d > 88.4852 )
						if( k <= 94.4304 )
							if( k <= 93.2502 )
								if( smoothK_k <= 88.4387 )
									ret := -0.562500
								if( smoothK_k > 88.4387 )
									ret := -0.142857
							if( k > 93.2502 )
								ret := -0.714286 // sell
						if( k > 94.4304 )
							if( d_k <= -1.25584 )
								if( VIP_VIM <= 1.00583 )
									ret := 0.066667
								if( VIP_VIM > 1.00583 )
									ret := -0.422222
							if( d_k > -1.25584 )
								if( smoothD_d <= 96.0378 )
									ret := 0.228070
								if( smoothD_d > 96.0378 )
									ret := -0.191489
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_MSFT_1Min_e3a465d2(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


