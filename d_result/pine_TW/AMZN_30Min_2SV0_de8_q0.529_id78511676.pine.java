//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: AMZN_30Min_2SV0_78511676 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_2SV0_78511676", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_78511676(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP <= 0.923588 )
		if( VIM <= 1.39937 )
			if( rsi1 <= 8.08349 )
				if( k <= 0.124977 )
					if( VIP <= 0.72583 )
						if( smoothD_d <= -2.50181 )
							ret := 0.571429
						if( smoothD_d > -2.50181 )
							if( d_k <= 2.24277 )
								ret := -0.428571
							if( d_k > 2.24277 )
								ret := -0.125000
					if( VIP > 0.72583 )
						ret := -0.714286 // sell
				if( k > 0.124977 )
					if( smoothD_d <= -0.520802 )
						if( VIP_VIM <= -0.648856 )
							ret := 1.000000 // buy
						if( VIP_VIM > -0.648856 )
							ret := 0.545455
					if( smoothD_d > -0.520802 )
						if( d_k <= 4.53184 )
							if( smoothD_d <= 2.88841 )
								ret := -0.470588
							if( smoothD_d > 2.88841 )
								ret := 0.923077 // buy
						if( d_k > 4.53184 )
							ret := 0.875000 // buy
			if( rsi1 > 8.08349 )
				if( VIP <= 0.665517 )
					if( VIP_VIM <= -0.72464 )
						if( d <= 40.8042 )
							if( d <= 0.227231 )
								if( VIP <= 0.596882 )
									ret := -0.942308 // sell
								if( VIP > 0.596882 )
									ret := -0.476190
							if( d > 0.227231 )
								if( smoothK_k <= 8.17594 )
									ret := -0.221402
								if( smoothK_k > 8.17594 )
									ret := -0.669725
						if( d > 40.8042 )
							if( d <= 54.0444 )
								ret := 0.933333 // buy
							if( d > 54.0444 )
								ret := -0.105263
					if( VIP_VIM > -0.72464 )
						if( d_k <= -0.42933 )
							if( d <= 13.3458 )
								if( d <= 5.81479 )
									ret := -0.339130
								if( d > 5.81479 )
									ret := -0.678571
							if( d > 13.3458 )
								if( d <= 29.6455 )
									ret := 0.193548
								if( d > 29.6455 )
									ret := -0.578947
						if( d_k > -0.42933 )
							if( smoothD_d <= -2.71188 )
								if( smoothD_d <= -2.91516 )
									ret := 0.333333
								if( smoothD_d > -2.91516 )
									ret := 0.608696
							if( smoothD_d > -2.71188 )
								if( smoothD_d <= -2.33382 )
									ret := -0.733333 // sell
								if( smoothD_d > -2.33382 )
									ret := -0.022284
				if( VIP > 0.665517 )
					if( d_k <= 20.6478 )
						if( d_k <= 19.0768 )
							if( d_k <= 9.69327 )
								if( d <= 98.0083 )
									ret := -0.078390
								if( d > 98.0083 )
									ret := 0.450000
							if( d_k > 9.69327 )
								if( smoothD_d <= 78.605 )
									ret := -0.015362
								if( smoothD_d > 78.605 )
									ret := 0.390244
						if( d_k > 19.0768 )
							if( d <= 50.7008 )
								if( smoothD_d <= 16.5532 )
									ret := -1.000000 // sell
								if( smoothD_d > 16.5532 )
									ret := 0.000000
							if( d > 50.7008 )
								if( smoothK_k <= 36.7801 )
									ret := -0.925373 // sell
								if( smoothK_k > 36.7801 )
									ret := -0.276596
					if( d_k > 20.6478 )
						if( rsi1 <= 26.5117 )
							if( d <= 46.102 )
								if( smoothK_k <= 3.06085 )
									ret := -0.289474
								if( smoothK_k > 3.06085 )
									ret := 0.197531
							if( d > 46.102 )
								if( VIM <= 1.28709 )
									ret := 0.800000 // buy
								if( VIM > 1.28709 )
									ret := 0.250000
						if( rsi1 > 26.5117 )
							if( rsi1 <= 42.3525 )
								if( k <= 5.39547 )
									ret := -0.362745
								if( k > 5.39547 )
									ret := -0.004065
							if( rsi1 > 42.3525 )
								if( smoothK_k <= 46.7258 )
									ret := 0.458333
								if( smoothK_k > 46.7258 )
									ret := -0.888889 // sell
		if( VIM > 1.39937 )
			if( k <= 7.21435 )
				if( d <= 7.33756 )
					if( smoothK_k <= 1.46125 )
						if( smoothK_k <= -0.685294 )
							if( rsi1 <= 13.848 )
								if( VIP_VIM <= -0.836591 )
									ret := 0.653846
								if( VIP_VIM > -0.836591 )
									ret := 0.214953
							if( rsi1 > 13.848 )
								if( k <= 1.83269 )
									ret := 0.110429
								if( k > 1.83269 )
									ret := 0.568627
						if( smoothK_k > -0.685294 )
							if( smoothD_d <= 0.699124 )
								if( d <= 2.19747 )
									ret := 0.000000
								if( d > 2.19747 )
									ret := -0.631579
							if( smoothD_d > 0.699124 )
								if( VIP_VIM <= -0.748933 )
									ret := 0.565217
								if( VIP_VIM > -0.748933 )
									ret := 0.000000
					if( smoothK_k > 1.46125 )
						if( rsi1 <= 15.1355 )
							if( smoothK_k <= 2.61138 )
								if( k <= 5.26916 )
									ret := 0.100000
								if( k > 5.26916 )
									ret := 0.916667 // buy
							if( smoothK_k > 2.61138 )
								if( VIM <= 1.43087 )
									ret := 0.500000
								if( VIM > 1.43087 )
									ret := -0.684211
						if( rsi1 > 15.1355 )
							if( rsi1 <= 21.6987 )
								if( k <= 6.109 )
									ret := 0.924528 // buy
								if( k > 6.109 )
									ret := 0.600000
							if( rsi1 > 21.6987 )
								if( smoothK_k <= 2.25697 )
									ret := 0.727273 // buy
								if( smoothK_k > 2.25697 )
									ret := 0.153846
				if( d > 7.33756 )
					if( k <= 0.1549 )
						if( rsi1 <= 14.0213 )
							ret := 0.300000
						if( rsi1 > 14.0213 )
							if( smoothD_d <= 5.72173 )
								if( d <= 7.82044 )
									ret := -0.900000 // sell
								if( d > 7.82044 )
									ret := -1.000000 // sell
							if( smoothD_d > 5.72173 )
								if( d <= 18.9494 )
									ret := 0.000000
								if( d > 18.9494 )
									ret := -0.615385
					if( k > 0.1549 )
						if( VIP <= 0.902339 )
							if( rsi1 <= 29.3425 )
								if( smoothD_d <= 17.3768 )
									ret := 0.210526
								if( smoothD_d > 17.3768 )
									ret := -0.342105
							if( rsi1 > 29.3425 )
								if( d <= 12.0804 )
									ret := 0.222222
								if( d > 12.0804 )
									ret := 0.730769 // buy
						if( VIP > 0.902339 )
							if( k <= 4.96341 )
								ret := -0.166667
							if( k > 4.96341 )
								ret := -0.625000
			if( k > 7.21435 )
				if( rsi1 <= 46.7247 )
					if( smoothD_d <= 75.2559 )
						if( d_k <= 23.3761 )
							if( VIP <= 0.611538 )
								if( VIP <= 0.553973 )
									ret := -0.250000
								if( VIP > 0.553973 )
									ret := -0.692308
							if( VIP > 0.611538 )
								if( d_k <= -14.5244 )
									ret := 0.328767
								if( d_k > -14.5244 )
									ret := -0.040053
						if( d_k > 23.3761 )
							if( rsi1 <= 20.1371 )
								ret := -1.000000 // sell
							if( rsi1 > 20.1371 )
								if( rsi1 <= 31.509 )
									ret := -0.142857
								if( rsi1 > 31.509 )
									ret := -0.750000 // sell
					if( smoothD_d > 75.2559 )
						if( rsi1 <= 26.9004 )
							ret := -0.071429
						if( rsi1 > 26.9004 )
							if( VIP_VIM <= -0.68998 )
								ret := -1.000000 // sell
							if( VIP_VIM > -0.68998 )
								if( VIP_VIM <= -0.63573 )
									ret := -0.363636
								if( VIP_VIM > -0.63573 )
									ret := -0.666667
				if( rsi1 > 46.7247 )
					ret := -0.944444 // sell
	if( VIP > 0.923588 )
		if( d <= 2.05968 )
			if( k <= 0.044111 )
				if( k <= 0.005674 )
					if( VIP_VIM <= -0.148718 )
						if( smoothD_d <= -1.29773 )
							if( VIM <= 1.13519 )
								ret := 1.000000 // buy
							if( VIM > 1.13519 )
								if( rsi1 <= 34.3274 )
									ret := 0.776119 // buy
								if( rsi1 > 34.3274 )
									ret := 0.275862
						if( smoothD_d > -1.29773 )
							ret := 0.200000
					if( VIP_VIM > -0.148718 )
						if( rsi1 <= 48.8699 )
							if( rsi1 <= 28.4821 )
								ret := 0.909091 // buy
							if( rsi1 > 28.4821 )
								if( VIP_VIM <= -0.060385 )
									ret := -0.109091
								if( VIP_VIM > -0.060385 )
									ret := 0.421875
						if( rsi1 > 48.8699 )
							if( VIP <= 1.11903 )
								if( smoothD_d <= -2.77662 )
									ret := 0.916667 // buy
								if( smoothD_d > -2.77662 )
									ret := 0.562500
							if( VIP > 1.11903 )
								if( VIM <= 0.907088 )
									ret := 0.000000
								if( VIM > 0.907088 )
									ret := 0.588235
				if( k > 0.005674 )
					if( smoothK_k <= -2.97874 )
						ret := 1.000000 // buy
					if( smoothK_k > -2.97874 )
						if( VIM <= 26.2815 )
							ret := 0.823529 // buy
						if( VIM > 26.2815 )
							ret := 0.555556
			if( k > 0.044111 )
				if( d <= 1.42113 )
					if( smoothK_k <= -2.1707 )
						if( rsi1 <= 35.0151 )
							if( VIP <= 1.08155 )
								if( smoothD_d <= -2.64239 )
									ret := 0.769231 // buy
								if( smoothD_d > -2.64239 )
									ret := -0.222222
							if( VIP > 1.08155 )
								if( d_k <= -0.052825 )
									ret := 0.900000 // buy
								if( d_k > -0.052825 )
									ret := 1.000000 // buy
						if( rsi1 > 35.0151 )
							if( VIP <= 0.942575 )
								if( smoothK_k <= -2.51625 )
									ret := -0.866667 // sell
								if( smoothK_k > -2.51625 )
									ret := 0.000000
							if( VIP > 0.942575 )
								if( rsi1 <= 42.0413 )
									ret := -0.416667
								if( rsi1 > 42.0413 )
									ret := 0.510638
					if( smoothK_k > -2.1707 )
						if( smoothK_k <= -1.77233 )
							if( VIP <= 1.03992 )
								if( d <= 0.86332 )
									ret := -0.190476
								if( d > 0.86332 )
									ret := 0.272727
							if( VIP > 1.03992 )
								if( VIM <= 1.11108 )
									ret := -0.923077 // sell
								if( VIM > 1.11108 )
									ret := -0.636364
						if( smoothK_k > -1.77233 )
							if( rsi1 <= 32.2729 )
								if( VIM <= 1.35693 )
									ret := 0.812500 // buy
								if( VIM > 1.35693 )
									ret := 0.230769
							if( rsi1 > 32.2729 )
								if( d <= 1.31216 )
									ret := 0.113821
								if( d > 1.31216 )
									ret := -0.437500
				if( d > 1.42113 )
					if( VIM <= 1.15608 )
						if( k <= 0.900865 )
							ret := 0.000000
						if( k > 0.900865 )
							if( d_k <= 0.240371 )
								if( VIP_VIM <= 0.111429 )
									ret := 0.600000
								if( VIP_VIM > 0.111429 )
									ret := 0.052632
							if( d_k > 0.240371 )
								ret := 1.000000 // buy
					if( VIM > 1.15608 )
						if( rsi1 <= 31.2473 )
							if( rsi1 <= 28.0547 )
								ret := 0.200000
							if( rsi1 > 28.0547 )
								ret := 0.909091 // buy
						if( rsi1 > 31.2473 )
							if( rsi1 <= 32.8027 )
								ret := -0.666667
							if( rsi1 > 32.8027 )
								if( smoothD_d <= -1.2198 )
									ret := -0.130435
								if( smoothD_d > -1.2198 )
									ret := 0.684211
		if( d > 2.05968 )
			if( rsi1 <= 77.6695 )
				if( smoothD_d <= 43.5474 )
					if( k <= 75.4524 )
						if( d <= 14.5394 )
							if( d_k <= 9.98776 )
								if( k <= 7.2639 )
									ret := 0.006367
								if( k > 7.2639 )
									ret := 0.131859
							if( d_k > 9.98776 )
								if( VIP_VIM <= 0.096129 )
									ret := 0.340136
								if( VIP_VIM > 0.096129 )
									ret := 0.640625
						if( d > 14.5394 )
							if( rsi1 <= 69.2422 )
								if( smoothK_k <= 23.8119 )
									ret := -0.024436
								if( smoothK_k > 23.8119 )
									ret := 0.049047
							if( rsi1 > 69.2422 )
								if( VIM <= 1.29737 )
									ret := 0.222121
								if( VIM > 1.29737 )
									ret := -0.500000
					if( k > 75.4524 )
						if( rsi1 <= 59.5232 )
							ret := 0.888889 // buy
						if( rsi1 > 59.5232 )
							ret := 1.000000 // buy
				if( smoothD_d > 43.5474 )
					if( VIP_VIM <= 0.542522 )
						if( smoothK_k <= 96.1281 )
							if( VIM <= 1.1485 )
								if( rsi1 <= 47.0664 )
									ret := 0.100691
								if( rsi1 > 47.0664 )
									ret := -0.008816
							if( VIM > 1.1485 )
								if( rsi1 <= 38.1615 )
									ret := 0.063492
								if( rsi1 > 38.1615 )
									ret := -0.107430
						if( smoothK_k > 96.1281 )
							if( rsi1 <= 54.803 )
								if( rsi1 <= 37.3031 )
									ret := 0.785714 // buy
								if( rsi1 > 37.3031 )
									ret := -0.330059
							if( rsi1 > 54.803 )
								if( d_k <= -11.3531 )
									ret := -0.388013
								if( d_k > -11.3531 )
									ret := -0.047188
					if( VIP_VIM > 0.542522 )
						if( VIP <= 1.54805 )
							if( k <= 98.1896 )
								if( VIM <= 0.752971 )
									ret := 0.294737
								if( VIM > 0.752971 )
									ret := 0.049423
							if( k > 98.1896 )
								if( smoothK_k <= 96.9438 )
									ret := -0.255952
								if( smoothK_k > 96.9438 )
									ret := 0.097561
						if( VIP > 1.54805 )
							if( rsi1 <= 69.1073 )
								if( k <= 88.1936 )
									ret := 0.278761
								if( k > 88.1936 )
									ret := -0.301370
							if( rsi1 > 69.1073 )
								if( smoothD_d <= 94.3967 )
									ret := -0.386029
								if( smoothD_d > 94.3967 )
									ret := 0.642857
			if( rsi1 > 77.6695 )
				if( d <= 99.7898 )
					if( smoothK_k <= 47.9303 )
						if( VIP <= 1.23166 )
							if( VIP_VIM <= 0.345973 )
								ret := 0.333333
							if( VIP_VIM > 0.345973 )
								if( d <= 27.9623 )
									ret := -0.727273 // sell
								if( d > 27.9623 )
									ret := 0.000000
						if( VIP > 1.23166 )
							if( VIP_VIM <= 0.878656 )
								if( k <= 48.8165 )
									ret := 0.383378
								if( k > 48.8165 )
									ret := 0.750000 // buy
							if( VIP_VIM > 0.878656 )
								if( VIP <= 1.63502 )
									ret := 0.034483
								if( VIP > 1.63502 )
									ret := -0.833333 // sell
					if( smoothK_k > 47.9303 )
						if( smoothD_d <= 66.6832 )
							if( VIM <= 0.755692 )
								if( smoothK_k <= 85.3024 )
									ret := 0.240099
								if( smoothK_k > 85.3024 )
									ret := -1.000000 // sell
							if( VIM > 0.755692 )
								if( smoothD_d <= 60.2425 )
									ret := -0.255521
								if( smoothD_d > 60.2425 )
									ret := 0.006061
						if( smoothD_d > 66.6832 )
							if( smoothK_k <= 67.4787 )
								if( VIP_VIM <= 0.708077 )
									ret := 0.508108
								if( VIP_VIM > 0.708077 )
									ret := 0.108696
							if( smoothK_k > 67.4787 )
								if( d_k <= -23.5186 )
									ret := -0.617647
								if( d_k > -23.5186 )
									ret := 0.110220
				if( d > 99.7898 )
					if( k <= 99.8979 )
						if( VIM <= 0.681034 )
							if( smoothD_d <= 96.857 )
								ret := -1.000000 // sell
							if( smoothD_d > 96.857 )
								if( smoothD_d <= 96.9163 )
									ret := -0.555556
								if( smoothD_d > 96.9163 )
									ret := -0.800000 // sell
						if( VIM > 0.681034 )
							ret := -0.100000
					if( k > 99.8979 )
						if( VIP_VIM <= 0.519115 )
							if( rsi1 <= 81.0973 )
								if( d_k <= -0.022758 )
									ret := -0.625000
								if( d_k > -0.022758 )
									ret := 0.529412
							if( rsi1 > 81.0973 )
								if( rsi1 <= 83.7819 )
									ret := -0.861111 // sell
								if( rsi1 > 83.7819 )
									ret := -0.392857
						if( VIP_VIM > 0.519115 )
							if( smoothK_k <= 96.9541 )
								ret := 0.500000
							if( smoothK_k > 96.9541 )
								if( VIP <= 1.45348 )
									ret := 0.103448
								if( VIP > 1.45348 )
									ret := -0.273973
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMZN_30Min_78511676(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


