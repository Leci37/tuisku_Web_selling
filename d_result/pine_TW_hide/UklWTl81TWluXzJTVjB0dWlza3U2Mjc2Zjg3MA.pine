//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: RIVN_5Min_2SV0_6276f870 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_2SV0_6276f870", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_6276f870(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 23.5575 )
		if( smoothD_d <= 12.6692 )
			if( smoothK_k <= 13.1795 )
				if( VIP <= 0.590319 )
					if( rsi1 <= 17.9547 )
						if( d <= 11.1712 )
							if( rsi1 <= 16.0884 )
								if( d <= 2.4776 )
									ret := -0.039683
								if( d > 2.4776 )
									ret := -0.481203
							if( rsi1 > 16.0884 )
								if( d <= 1.69155 )
									ret := -0.636364
								if( d > 1.69155 )
									ret := -0.932203 // sell
						if( d > 11.1712 )
							if( VIM <= 1.45332 )
								if( smoothK_k <= 1.43341 )
									ret := -0.333333
								if( smoothK_k > 1.43341 )
									ret := 0.533333
							if( VIM > 1.45332 )
								ret := 1.000000 // buy
					if( rsi1 > 17.9547 )
						if( rsi1 <= 20.218 )
							if( VIP <= 0.568393 )
								if( smoothD_d <= 2.98412 )
									ret := 0.956522 // buy
								if( smoothD_d > 2.98412 )
									ret := 0.600000
							if( VIP > 0.568393 )
								ret := 0.238095
						if( rsi1 > 20.218 )
							if( k <= 4.10663 )
								ret := 0.375000
							if( k > 4.10663 )
								ret := -0.250000
				if( VIP > 0.590319 )
					if( smoothD_d <= -2.96206 )
						if( VIM <= 1.39507 )
							if( VIP_VIM <= -0.608301 )
								if( rsi1 <= 19.776 )
									ret := 0.375000
								if( rsi1 > 19.776 )
									ret := 0.619048
							if( VIP_VIM > -0.608301 )
								if( d <= 0.001468 )
									ret := -0.071429
								if( d > 0.001468 )
									ret := -0.652174
						if( VIM > 1.39507 )
							if( rsi1 <= 14.4387 )
								ret := -0.833333 // sell
							if( rsi1 > 14.4387 )
								if( VIP_VIM <= -0.845963 )
									ret := -0.666667
								if( VIP_VIM > -0.845963 )
									ret := -0.500000
					if( smoothD_d > -2.96206 )
						if( VIP <= 0.63982 )
							if( d <= 4.80054 )
								if( d <= 4.47573 )
									ret := 0.260504
								if( d > 4.47573 )
									ret := 0.900000 // buy
							if( d > 4.80054 )
								if( rsi1 <= 15.997 )
									ret := -0.412500
								if( rsi1 > 15.997 )
									ret := 0.092308
						if( VIP > 0.63982 )
							if( rsi1 <= 13.8771 )
								if( rsi1 <= 12.8339 )
									ret := 0.437956
								if( rsi1 > 12.8339 )
									ret := -0.270588
							if( rsi1 > 13.8771 )
								if( k <= 10.3279 )
									ret := 0.335859
								if( k > 10.3279 )
									ret := 0.640000
			if( smoothK_k > 13.1795 )
				if( smoothK_k <= 17.9227 )
					if( rsi1 <= 14.9282 )
						ret := 0.615385
					if( rsi1 > 14.9282 )
						if( d_k <= -8.58025 )
							ret := 0.250000
						if( d_k > -8.58025 )
							if( d <= 9.88551 )
								if( rsi1 <= 19.2098 )
									ret := -0.875000 // sell
								if( rsi1 > 19.2098 )
									ret := 0.307692
							if( d > 9.88551 )
								if( smoothD_d <= 9.83824 )
									ret := -0.789474 // sell
								if( smoothD_d > 9.83824 )
									ret := -0.300000
				if( smoothK_k > 17.9227 )
					if( d <= 13.7215 )
						if( smoothD_d <= 10.1894 )
							ret := 0.333333
						if( smoothD_d > 10.1894 )
							ret := 0.900000 // buy
					if( d > 13.7215 )
						ret := 0.166667
		if( smoothD_d > 12.6692 )
			if( smoothD_d <= 47.0725 )
				if( VIM <= 1.41258 )
					if( VIP_VIM <= -0.311596 )
						if( k <= 9.91978 )
							if( d <= 18.5445 )
								if( smoothK_k <= 5.71068 )
									ret := 0.571429
								if( smoothK_k > 5.71068 )
									ret := -0.909091 // sell
							if( d > 18.5445 )
								if( rsi1 <= 15.5545 )
									ret := 0.454545
								if( rsi1 > 15.5545 )
									ret := -0.708333 // sell
						if( k > 9.91978 )
							if( d_k <= 18.459 )
								if( VIP <= 0.74464 )
									ret := -0.226734
								if( VIP > 0.74464 )
									ret := 0.149068
							if( d_k > 18.459 )
								if( k <= 13.2347 )
									ret := -0.052632
								if( k > 13.2347 )
									ret := 0.758621 // buy
					if( VIP_VIM > -0.311596 )
						if( VIM <= 1.04072 )
							ret := 1.000000 // buy
						if( VIM > 1.04072 )
							ret := 0.590909
				if( VIM > 1.41258 )
					if( smoothK_k <= 29.1605 )
						if( VIP <= 1.00835 )
							if( d_k <= 1.17708 )
								if( d_k <= -0.92492 )
									ret := 0.454545
								if( d_k > -0.92492 )
									ret := 1.000000 // buy
							if( d_k > 1.17708 )
								if( VIM <= 1.54945 )
									ret := -0.139535
								if( VIM > 1.54945 )
									ret := 0.428571
						if( VIP > 1.00835 )
							if( k <= 24.0753 )
								if( smoothK_k <= 10.9125 )
									ret := 0.866667 // buy
								if( smoothK_k > 10.9125 )
									ret := 0.352941
							if( k > 24.0753 )
								ret := 1.000000 // buy
					if( smoothK_k > 29.1605 )
						if( smoothK_k <= 45.6842 )
							if( rsi1 <= 20.3288 )
								ret := -0.333333
							if( rsi1 > 20.3288 )
								ret := -0.647059
						if( smoothK_k > 45.6842 )
							ret := 1.000000 // buy
			if( smoothD_d > 47.0725 )
				if( k <= 39.3888 )
					if( VIP_VIM <= -0.479844 )
						if( rsi1 <= 21.4247 )
							if( smoothD_d <= 52.4957 )
								ret := 1.000000 // buy
							if( smoothD_d > 52.4957 )
								if( d_k <= 27.5756 )
									ret := 1.000000 // buy
								if( d_k > 27.5756 )
									ret := 0.777778 // buy
						if( rsi1 > 21.4247 )
							ret := 0.666667
					if( VIP_VIM > -0.479844 )
						if( d <= 56.2541 )
							ret := 0.615385
						if( d > 56.2541 )
							ret := 0.090909
				if( k > 39.3888 )
					if( d_k <= 20.2842 )
						if( smoothK_k <= 66.3596 )
							if( VIP_VIM <= -0.57038 )
								ret := -0.133333
							if( VIP_VIM > -0.57038 )
								if( k <= 58.7764 )
									ret := -0.850000 // sell
								if( k > 58.7764 )
									ret := -0.363636
						if( smoothK_k > 66.3596 )
							ret := 0.700000 // buy
					if( d_k > 20.2842 )
						if( d_k <= 24.5978 )
							if( d <= 71.7336 )
								ret := 1.000000 // buy
							if( d > 71.7336 )
								ret := 0.800000 // buy
						if( d_k > 24.5978 )
							ret := 0.363636
	if( rsi1 > 23.5575 )
		if( rsi1 <= 61.544 )
			if( VIP <= 1.03972 )
				if( d_k <= -27.0938 )
					if( rsi1 <= 49.9447 )
						if( VIP_VIM <= -0.249003 )
							if( k <= 87.4194 )
								if( VIP <= 0.938826 )
									ret := 0.083333
								if( VIP > 0.938826 )
									ret := 1.000000 // buy
							if( k > 87.4194 )
								ret := -0.312500
						if( VIP_VIM > -0.249003 )
							if( d_k <= -31.6187 )
								ret := 0.000000
							if( d_k > -31.6187 )
								if( VIP <= 0.969671 )
									ret := 0.721649 // buy
								if( VIP > 0.969671 )
									ret := 0.333333
					if( rsi1 > 49.9447 )
						if( smoothD_d <= 28.0326 )
							ret := 1.000000 // buy
						if( smoothD_d > 28.0326 )
							if( VIP <= 0.975085 )
								if( smoothK_k <= 76.6407 )
									ret := -0.875000 // sell
								if( smoothK_k > 76.6407 )
									ret := 0.142857
							if( VIP > 0.975085 )
								if( VIP <= 0.991696 )
									ret := 0.909091 // buy
								if( VIP > 0.991696 )
									ret := -0.081081
				if( d_k > -27.0938 )
					if( rsi1 <= 50.3323 )
						if( VIM <= 0.954035 )
							if( smoothD_d <= 1.71083 )
								ret := -0.600000
							if( smoothD_d > 1.71083 )
								if( smoothD_d <= 23.5096 )
									ret := 0.476190
								if( smoothD_d > 23.5096 )
									ret := 0.137931
						if( VIM > 0.954035 )
							if( d_k <= 31.8803 )
								if( VIP <= 0.644207 )
									ret := 0.419162
								if( VIP > 0.644207 )
									ret := -0.017187
							if( d_k > 31.8803 )
								if( VIP_VIM <= -0.117127 )
									ret := 0.448276
								if( VIP_VIM > -0.117127 )
									ret := 1.000000 // buy
					if( rsi1 > 50.3323 )
						if( k <= 15.3616 )
							if( k <= 9.16704 )
								if( d_k <= 17.2095 )
									ret := -0.157576
								if( d_k > 17.2095 )
									ret := 0.600000
							if( k > 9.16704 )
								if( d_k <= 12.7794 )
									ret := -0.646526
								if( d_k > 12.7794 )
									ret := -0.117647
						if( k > 15.3616 )
							if( smoothK_k <= 36.2636 )
								if( d <= 30.3166 )
									ret := -0.060606
								if( d > 30.3166 )
									ret := 0.236140
							if( smoothK_k > 36.2636 )
								if( k <= 90.0183 )
									ret := -0.127911
								if( k > 90.0183 )
									ret := 0.049220
			if( VIP > 1.03972 )
				if( smoothD_d <= 90.2066 )
					if( d <= 88.8917 )
						if( rsi1 <= 34.6081 )
							if( VIP <= 1.09076 )
								if( smoothD_d <= 8.10932 )
									ret := 0.485714
								if( smoothD_d > 8.10932 )
									ret := -0.092437
							if( VIP > 1.09076 )
								if( k <= 3.07764 )
									ret := 0.128000
								if( k > 3.07764 )
									ret := 0.406028
						if( rsi1 > 34.6081 )
							if( VIP <= 1.16138 )
								if( VIP_VIM <= 0.128705 )
									ret := 0.045126
								if( VIP_VIM > 0.128705 )
									ret := 0.107589
							if( VIP > 1.16138 )
								if( smoothK_k <= 8.11391 )
									ret := -0.150655
								if( smoothK_k > 8.11391 )
									ret := 0.014150
					if( d > 88.8917 )
						if( d_k <= -2.3237 )
							if( d_k <= -6.03263 )
								if( k <= 96.7587 )
									ret := 0.642857
								if( k > 96.7587 )
									ret := 0.042017
							if( d_k > -6.03263 )
								if( VIP <= 1.05826 )
									ret := 0.272727
								if( VIP > 1.05826 )
									ret := -0.368056
						if( d_k > -2.3237 )
							if( smoothD_d <= 88.3243 )
								if( rsi1 <= 61.1874 )
									ret := 0.435754
								if( rsi1 > 61.1874 )
									ret := -0.666667
							if( smoothD_d > 88.3243 )
								if( VIM <= 0.995988 )
									ret := 0.028986
								if( VIM > 0.995988 )
									ret := 0.352201
				if( smoothD_d > 90.2066 )
					if( smoothK_k <= 81.8909 )
						ret := 0.866667 // buy
					if( smoothK_k > 81.8909 )
						if( k <= 91.1902 )
							if( VIP <= 1.12261 )
								if( k <= 88.4618 )
									ret := -0.719298 // sell
								if( k > 88.4618 )
									ret := -0.287037
							if( VIP > 1.12261 )
								if( d <= 95.1137 )
									ret := 0.175926
								if( d > 95.1137 )
									ret := -0.554054
						if( k > 91.1902 )
							if( k <= 93.3312 )
								if( d <= 96.0008 )
									ret := 0.177570
								if( d > 96.0008 )
									ret := 0.562500
							if( k > 93.3312 )
								if( VIM <= 1.19639 )
									ret := -0.004386
								if( VIM > 1.19639 )
									ret := -0.398693
		if( rsi1 > 61.544 )
			if( VIP <= 1.38113 )
				if( d_k <= -13.5408 )
					if( k <= 87.5334 )
						if( smoothD_d <= 62.1145 )
							if( VIM <= 0.919627 )
								if( rsi1 <= 83.4788 )
									ret := -0.289589
								if( rsi1 > 83.4788 )
									ret := 0.360000
							if( VIM > 0.919627 )
								if( d_k <= -27.3945 )
									ret := 0.625000
								if( d_k > -27.3945 )
									ret := 0.016807
						if( smoothD_d > 62.1145 )
							if( smoothK_k <= 81.2802 )
								if( VIP_VIM <= 0.344137 )
									ret := -0.500000
								if( VIP_VIM > 0.344137 )
									ret := 0.357143
							if( smoothK_k > 81.2802 )
								if( VIP_VIM <= 0.539439 )
									ret := -0.737864 // sell
								if( VIP_VIM > 0.539439 )
									ret := 0.181818
					if( k > 87.5334 )
						if( smoothD_d <= 82.0031 )
							if( k <= 98.7662 )
								if( VIP_VIM <= 0.179143 )
									ret := 0.316456
								if( VIP_VIM > 0.179143 )
									ret := -0.081448
							if( k > 98.7662 )
								if( d <= 78.9139 )
									ret := -0.231707
								if( d > 78.9139 )
									ret := 0.710744 // buy
						if( smoothD_d > 82.0031 )
							if( smoothK_k <= 96.9624 )
								ret := -0.500000
							if( smoothK_k > 96.9624 )
								if( VIP_VIM <= 0.392547 )
									ret := -0.600000
								if( VIP_VIM > 0.392547 )
									ret := -1.000000 // sell
				if( d_k > -13.5408 )
					if( VIP_VIM <= 0.405237 )
						if( VIM <= 0.785817 )
							if( smoothK_k <= 32.9112 )
								if( d_k <= 4.52163 )
									ret := 0.538462
								if( d_k > 4.52163 )
									ret := -0.153846
							if( smoothK_k > 32.9112 )
								if( d_k <= 1.30324 )
									ret := -0.412541
								if( d_k > 1.30324 )
									ret := -0.100503
						if( VIM > 0.785817 )
							if( smoothK_k <= 6.70137 )
								if( smoothK_k <= 4.9151 )
									ret := 0.047945
								if( smoothK_k > 4.9151 )
									ret := 0.914894 // buy
							if( smoothK_k > 6.70137 )
								if( smoothK_k <= 16.9135 )
									ret := -0.397394
								if( smoothK_k > 16.9135 )
									ret := -0.038976
					if( VIP_VIM > 0.405237 )
						if( k <= 72.5147 )
							if( smoothK_k <= 67.6435 )
								if( VIM <= 0.704651 )
									ret := 0.190476
								if( VIM > 0.704651 )
									ret := -0.064852
							if( smoothK_k > 67.6435 )
								if( VIP_VIM <= 0.570957 )
									ret := -0.301205
								if( VIP_VIM > 0.570957 )
									ret := -0.857143 // sell
						if( k > 72.5147 )
							if( rsi1 <= 78.6548 )
								if( k <= 73.6379 )
									ret := 0.589041
								if( k > 73.6379 )
									ret := 0.089820
							if( rsi1 > 78.6548 )
								if( k <= 93.9379 )
									ret := -0.252747
								if( k > 93.9379 )
									ret := 0.032817
			if( VIP > 1.38113 )
				if( d <= 88.2738 )
					if( VIP_VIM <= 0.79029 )
						if( d_k <= 20.6845 )
							if( d_k <= -20.5579 )
								if( VIP_VIM <= 0.279855 )
									ret := 0.057692
								if( VIP_VIM > 0.279855 )
									ret := -0.681416
							if( d_k > -20.5579 )
								if( smoothK_k <= 83.9698 )
									ret := -0.167939
								if( smoothK_k > 83.9698 )
									ret := 0.060302
						if( d_k > 20.6845 )
							if( rsi1 <= 64.7801 )
								ret := 0.157895
							if( rsi1 > 64.7801 )
								if( VIP_VIM <= 0.700882 )
									ret := 0.523810
								if( VIP_VIM > 0.700882 )
									ret := 0.900000 // buy
					if( VIP_VIM > 0.79029 )
						if( d_k <= -28.6501 )
							ret := 0.882353 // buy
						if( d_k > -28.6501 )
							if( VIP <= 1.44158 )
								if( d_k <= -0.637789 )
									ret := 0.320000
								if( d_k > -0.637789 )
									ret := 0.636364
							if( VIP > 1.44158 )
								if( smoothK_k <= 80.3402 )
									ret := 0.134545
								if( smoothK_k > 80.3402 )
									ret := -0.306122
				if( d > 88.2738 )
					if( rsi1 <= 96.3867 )
						if( rsi1 <= 80.7537 )
							if( k <= 96.4845 )
								if( rsi1 <= 64.926 )
									ret := 0.140625
								if( rsi1 > 64.926 )
									ret := -0.239808
							if( k > 96.4845 )
								if( d_k <= 0.90957 )
									ret := -0.049618
								if( d_k > 0.90957 )
									ret := 0.425000
						if( rsi1 > 80.7537 )
							if( smoothK_k <= 83.4159 )
								if( VIM <= 0.639101 )
									ret := -0.925000 // sell
								if( VIM > 0.639101 )
									ret := -0.625000
							if( smoothK_k > 83.4159 )
								if( smoothD_d <= 96.554 )
									ret := -0.355769
								if( smoothD_d > 96.554 )
									ret := -0.111765
					if( rsi1 > 96.3867 )
						if( VIM <= 0.455932 )
							ret := -0.941176 // sell
						if( VIM > 0.455932 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_RIVN_5Min_6276f870(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)

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


