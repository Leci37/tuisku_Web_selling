//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: ADSK_15Min_2SV0_bdb6380c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2SV0_bdb6380c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_bdb6380c(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP <= 0.734175 )
		if( d <= 0.30116 )
			if( rsi1 <= 12.5165 )
				if( k <= 3.1e-05 )
					if( d_k <= 0.175787 )
						if( VIP <= 0.488943 )
							if( VIM <= 1.51016 )
								ret := 0.846154 // buy
							if( VIM > 1.51016 )
								ret := 0.200000
						if( VIP > 0.488943 )
							if( rsi1 <= 11.0801 )
								if( VIP <= 0.678554 )
									ret := -0.394737
								if( VIP > 0.678554 )
									ret := 0.571429
							if( rsi1 > 11.0801 )
								ret := 0.600000
					if( d_k > 0.175787 )
						ret := -0.400000
				if( k > 3.1e-05 )
					if( d_k <= -0.020835 )
						if( d <= 0.116289 )
							if( d_k <= -0.102847 )
								ret := -0.600000
							if( d_k > -0.102847 )
								ret := 0.250000
						if( d > 0.116289 )
							if( smoothK_k <= -2.3967 )
								ret := 0.950000 // buy
							if( smoothK_k > -2.3967 )
								ret := 0.181818
					if( d_k > -0.020835 )
						if( rsi1 <= 2.62062 )
							ret := 0.769231 // buy
						if( rsi1 > 2.62062 )
							ret := 1.000000 // buy
			if( rsi1 > 12.5165 )
				if( VIP_VIM <= -0.735388 )
					if( VIM <= 1.38003 )
						ret := 0.600000
					if( VIM > 1.38003 )
						if( d <= 0.03663 )
							if( smoothD_d <= -2.99968 )
								if( VIP <= 0.594619 )
									ret := -0.333333
								if( VIP > 0.594619 )
									ret := -0.666667
							if( smoothD_d > -2.99968 )
								ret := -1.000000 // sell
						if( d > 0.03663 )
							if( VIM <= 1.42792 )
								ret := -0.636364
							if( VIM > 1.42792 )
								ret := 0.105263
				if( VIP_VIM > -0.735388 )
					if( smoothD_d <= -2.99612 )
						if( VIM <= 1.34826 )
							if( VIP_VIM <= -0.573497 )
								if( rsi1 <= 19.5092 )
									ret := 0.565217
								if( rsi1 > 19.5092 )
									ret := 0.142857
							if( VIP_VIM > -0.573497 )
								ret := 0.619048
						if( VIM > 1.34826 )
							ret := -0.266667
					if( smoothD_d > -2.99612 )
						if( d_k <= -0.020506 )
							if( k <= 0.22887 )
								ret := 0.588235
							if( k > 0.22887 )
								ret := 0.125000
						if( d_k > -0.020506 )
							if( smoothD_d <= -2.89092 )
								ret := -0.900000 // sell
							if( smoothD_d > -2.89092 )
								ret := 0.000000
		if( d > 0.30116 )
			if( smoothD_d <= 23.1776 )
				if( rsi1 <= 14.2811 )
					if( VIM <= 1.42126 )
						if( d <= 1.02409 )
							if( smoothK_k <= -2.44629 )
								ret := -0.333333
							if( smoothK_k > -2.44629 )
								if( d_k <= -0.300021 )
									ret := -0.736842 // sell
								if( d_k > -0.300021 )
									ret := -1.000000 // sell
						if( d > 1.02409 )
							if( VIP <= 0.633464 )
								if( k <= 0.958329 )
									ret := 0.225000
								if( k > 0.958329 )
									ret := -0.481707
							if( VIP > 0.633464 )
								if( d <= 11.9374 )
									ret := 0.285714
								if( d > 11.9374 )
									ret := -0.607143
					if( VIM > 1.42126 )
						if( d <= 19.9591 )
							if( VIM <= 1.50114 )
								if( smoothK_k <= 0.057304 )
									ret := 0.132450
								if( smoothK_k > 0.057304 )
									ret := 0.516129
							if( VIM > 1.50114 )
								if( smoothK_k <= 11.6925 )
									ret := -0.026846
								if( smoothK_k > 11.6925 )
									ret := -0.636364
						if( d > 19.9591 )
							ret := -0.857143 // sell
				if( rsi1 > 14.2811 )
					if( d <= 2.39332 )
						if( VIP <= 0.561265 )
							ret := 0.375000
						if( VIP > 0.561265 )
							if( VIP_VIM <= -0.690048 )
								if( VIP_VIM <= -0.71279 )
									ret := -0.575758
								if( VIP_VIM > -0.71279 )
									ret := -0.882353 // sell
							if( VIP_VIM > -0.690048 )
								if( d <= 2.01783 )
									ret := -0.155689
								if( d > 2.01783 )
									ret := -0.714286 // sell
					if( d > 2.39332 )
						if( VIP_VIM <= -0.631904 )
							if( k <= 2.98215 )
								if( d_k <= 19.1848 )
									ret := -0.515464
								if( d_k > 19.1848 )
									ret := 0.600000
							if( k > 2.98215 )
								if( d <= 2.72116 )
									ret := 0.764706 // buy
								if( d > 2.72116 )
									ret := -0.201581
						if( VIP_VIM > -0.631904 )
							if( smoothK_k <= 5.40495 )
								if( rsi1 <= 25.1978 )
									ret := -0.040650
								if( rsi1 > 25.1978 )
									ret := 0.425000
							if( smoothK_k > 5.40495 )
								if( smoothK_k <= 5.65891 )
									ret := -1.000000 // sell
								if( smoothK_k > 5.65891 )
									ret := -0.175439
			if( smoothD_d > 23.1776 )
				if( smoothD_d <= 34.8992 )
					if( k <= 25.8776 )
						if( VIM <= 1.17341 )
							ret := 0.307692
						if( VIM > 1.17341 )
							if( VIP_VIM <= -0.53772 )
								if( smoothK_k <= 6.47982 )
									ret := 0.156250
								if( smoothK_k > 6.47982 )
									ret := -0.416667
							if( VIP_VIM > -0.53772 )
								ret := -0.823529 // sell
					if( k > 25.8776 )
						if( k <= 32.5999 )
							if( k <= 29.1214 )
								if( VIP_VIM <= -0.662189 )
									ret := 0.875000 // buy
								if( VIP_VIM > -0.662189 )
									ret := 0.272727
							if( k > 29.1214 )
								if( smoothD_d <= 24.3755 )
									ret := 0.785714 // buy
								if( smoothD_d > 24.3755 )
									ret := 0.979167 // buy
						if( k > 32.5999 )
							if( k <= 33.4885 )
								ret := -0.800000 // sell
							if( k > 33.4885 )
								if( smoothD_d <= 29.752 )
									ret := 0.000000
								if( smoothD_d > 29.752 )
									ret := 0.456522
				if( smoothD_d > 34.8992 )
					if( d_k <= -9.30912 )
						if( VIM <= 1.34579 )
							if( VIM <= 1.2671 )
								if( VIP <= 0.713009 )
									ret := 0.857143 // buy
								if( VIP > 0.713009 )
									ret := 0.222222
							if( VIM > 1.2671 )
								if( VIM <= 1.29973 )
									ret := -0.545455
								if( VIM > 1.29973 )
									ret := 0.160000
						if( VIM > 1.34579 )
							if( d <= 49.7543 )
								ret := 0.285714
							if( d > 49.7543 )
								ret := 0.950000 // buy
					if( d_k > -9.30912 )
						if( rsi1 <= 19.683 )
							if( VIP_VIM <= -0.621209 )
								if( smoothD_d <= 39.0286 )
									ret := -1.000000 // sell
								if( smoothD_d > 39.0286 )
									ret := 0.033898
							if( VIP_VIM > -0.621209 )
								if( k <= 64.5262 )
									ret := 0.700000 // buy
								if( k > 64.5262 )
									ret := 0.157895
						if( rsi1 > 19.683 )
							if( d <= 52.9096 )
								if( VIP_VIM <= -0.528565 )
									ret := -0.349206
								if( VIP_VIM > -0.528565 )
									ret := 0.222222
							if( d > 52.9096 )
								if( d <= 61.8661 )
									ret := -0.958333 // sell
								if( d > 61.8661 )
									ret := -0.416667
	if( VIP > 0.734175 )
		if( rsi1 <= 20.641 )
			if( VIM <= 1.25426 )
				if( VIM <= 1.16443 )
					if( smoothK_k <= 2.07208 )
						ret := -0.153846
					if( smoothK_k > 2.07208 )
						ret := 0.772727 // buy
				if( VIM > 1.16443 )
					if( d_k <= 2.89176 )
						if( d_k <= 0.658792 )
							if( d_k <= -4.1315 )
								if( VIP_VIM <= -0.434435 )
									ret := 0.100000
								if( VIP_VIM > -0.434435 )
									ret := 0.500000
							if( d_k > -4.1315 )
								if( smoothK_k <= 7.48179 )
									ret := 0.156250
								if( smoothK_k > 7.48179 )
									ret := -0.500000
						if( d_k > 0.658792 )
							ret := 0.625000
					if( d_k > 2.89176 )
						if( smoothK_k <= -0.939128 )
							ret := -0.071429
						if( smoothK_k > -0.939128 )
							if( rsi1 <= 19.1382 )
								if( smoothK_k <= 10.9421 )
									ret := -0.857143 // sell
								if( smoothK_k > 10.9421 )
									ret := -1.000000 // sell
							if( rsi1 > 19.1382 )
								if( smoothD_d <= 26.8581 )
									ret := -0.823529 // sell
								if( smoothD_d > 26.8581 )
									ret := -0.153846
			if( VIM > 1.25426 )
				if( smoothD_d <= 0.994091 )
					if( d_k <= 3.07323 )
						if( d_k <= 0.975691 )
							if( d_k <= 0.050134 )
								if( k <= 3.28091 )
									ret := 0.223140
								if( k > 3.28091 )
									ret := -0.172043
							if( d_k > 0.050134 )
								if( VIM <= 1.41195 )
									ret := 0.404255
								if( VIM > 1.41195 )
									ret := -0.542857
						if( d_k > 0.975691 )
							if( d <= 2.77626 )
								if( rsi1 <= 17.0877 )
									ret := 0.725806 // buy
								if( rsi1 > 17.0877 )
									ret := 0.000000
							if( d > 2.77626 )
								if( k <= 1.58098 )
									ret := -0.387097
								if( k > 1.58098 )
									ret := 0.800000 // buy
					if( d_k > 3.07323 )
						if( smoothD_d <= 0.526478 )
							ret := -0.941176 // sell
						if( smoothD_d > 0.526478 )
							ret := -0.733333 // sell
				if( smoothD_d > 0.994091 )
					if( smoothK_k <= 1.55276 )
						if( smoothD_d <= 21.5321 )
							if( VIP <= 0.789558 )
								if( smoothK_k <= -2.80997 )
									ret := -0.142857
								if( smoothK_k > -2.80997 )
									ret := 0.491228
							if( VIP > 0.789558 )
								if( d_k <= 3.69983 )
									ret := 0.511628
								if( d_k > 3.69983 )
									ret := 0.843137 // buy
						if( smoothD_d > 21.5321 )
							ret := -0.444444
					if( smoothK_k > 1.55276 )
						if( d_k <= -11.9166 )
							if( smoothD_d <= 30.892 )
								if( d <= 19.213 )
									ret := 0.600000
								if( d > 19.213 )
									ret := 1.000000 // buy
							if( smoothD_d > 30.892 )
								ret := 0.461538
						if( d_k > -11.9166 )
							if( smoothD_d <= 5.45667 )
								if( smoothK_k <= 3.09498 )
									ret := 0.000000
								if( smoothK_k > 3.09498 )
									ret := 0.557252
							if( smoothD_d > 5.45667 )
								if( k <= 42.5371 )
									ret := 0.181495
								if( k > 42.5371 )
									ret := 0.671642
		if( rsi1 > 20.641 )
			if( rsi1 <= 32.2378 )
				if( smoothK_k <= 69.0315 )
					if( smoothD_d <= -2.90436 )
						if( VIP_VIM <= -0.288708 )
							if( VIP <= 0.838491 )
								if( VIP_VIM <= -0.436211 )
									ret := 0.534483
								if( VIP_VIM > -0.436211 )
									ret := 0.847826 // buy
							if( VIP > 0.838491 )
								if( d <= 0.00132 )
									ret := 0.250000
								if( d > 0.00132 )
									ret := -0.578947
						if( VIP_VIM > -0.288708 )
							if( k <= 0.005094 )
								ret := 0.833333 // buy
							if( k > 0.005094 )
								ret := 1.000000 // buy
					if( smoothD_d > -2.90436 )
						if( d <= 73.3988 )
							if( smoothD_d <= 62.4166 )
								if( rsi1 <= 29.33 )
									ret := 0.025261
								if( rsi1 > 29.33 )
									ret := 0.136716
							if( smoothD_d > 62.4166 )
								if( rsi1 <= 26.7567 )
									ret := 0.019608
								if( rsi1 > 26.7567 )
									ret := -0.485294
						if( d > 73.3988 )
							if( smoothK_k <= 67.316 )
								if( d <= 80.9825 )
									ret := 0.539326
								if( d > 80.9825 )
									ret := -0.393939
							if( smoothK_k > 67.316 )
								if( VIM <= 1.2908 )
									ret := 1.000000 // buy
								if( VIM > 1.2908 )
									ret := 0.777778 // buy
				if( smoothK_k > 69.0315 )
					if( smoothK_k <= 76.2397 )
						if( VIP_VIM <= -0.389306 )
							if( smoothD_d <= 72.8997 )
								if( VIP <= 0.788216 )
									ret := -0.333333
								if( VIP > 0.788216 )
									ret := -0.666667
							if( smoothD_d > 72.8997 )
								ret := 0.357143
						if( VIP_VIM > -0.389306 )
							if( VIP <= 0.874447 )
								if( d <= 84.1167 )
									ret := -0.750000 // sell
								if( d > 84.1167 )
									ret := -0.200000
							if( VIP > 0.874447 )
								if( rsi1 <= 28.7221 )
									ret := -0.538462
								if( rsi1 > 28.7221 )
									ret := -0.964912 // sell
					if( smoothK_k > 76.2397 )
						if( d <= 85.7966 )
							if( VIM <= 1.35486 )
								if( rsi1 <= 28.3177 )
									ret := 0.312500
								if( rsi1 > 28.3177 )
									ret := -0.166667
							if( VIM > 1.35486 )
								if( VIP <= 0.924265 )
									ret := 0.823529 // buy
								if( VIP > 0.924265 )
									ret := 0.285714
						if( d > 85.7966 )
							if( VIP <= 0.853849 )
								if( rsi1 <= 29.8643 )
									ret := -0.879310 // sell
								if( rsi1 > 29.8643 )
									ret := -0.421053
							if( VIP > 0.853849 )
								if( d <= 93.654 )
									ret := 0.470588
								if( d > 93.654 )
									ret := -0.444444
			if( rsi1 > 32.2378 )
				if( VIP_VIM <= -0.291284 )
					if( VIP_VIM <= -0.505752 )
						if( VIM <= 1.3005 )
							if( rsi1 <= 34.5543 )
								if( smoothD_d <= 12.3445 )
									ret := 0.666667
								if( smoothD_d > 12.3445 )
									ret := 1.000000 // buy
							if( rsi1 > 34.5543 )
								ret := 0.058824
						if( VIM > 1.3005 )
							if( d <= 42.8627 )
								if( d_k <= -21.9271 )
									ret := -0.760870 // sell
								if( d_k > -21.9271 )
									ret := -0.001499
							if( d > 42.8627 )
								if( k <= 33.9141 )
									ret := -0.666667
								if( k > 33.9141 )
									ret := 0.245146
					if( VIP_VIM > -0.505752 )
						if( smoothD_d <= 48.8692 )
							if( k <= 39.2518 )
								if( d_k <= 22.1601 )
									ret := -0.071625
								if( d_k > 22.1601 )
									ret := -0.560000
							if( k > 39.2518 )
								if( smoothK_k <= 71.4138 )
									ret := -0.311193
								if( smoothK_k > 71.4138 )
									ret := 0.625000
						if( smoothD_d > 48.8692 )
							if( d <= 87.9328 )
								if( VIP <= 0.790703 )
									ret := -0.475000
								if( VIP > 0.790703 )
									ret := 0.078372
							if( d > 87.9328 )
								if( VIM <= 1.53794 )
									ret := -0.393130
								if( VIM > 1.53794 )
									ret := 0.148148
				if( VIP_VIM > -0.291284 )
					if( smoothD_d <= 94.8462 )
						if( VIM <= 0.947758 )
							if( VIP <= 1.07485 )
								if( rsi1 <= 41.4145 )
									ret := 0.816327 // buy
								if( rsi1 > 41.4145 )
									ret := -0.091483
							if( VIP > 1.07485 )
								if( smoothD_d <= 92.3066 )
									ret := 0.047633
								if( smoothD_d > 92.3066 )
									ret := -0.058971
						if( VIM > 0.947758 )
							if( VIM <= 1.82681 )
								if( smoothK_k <= 88.4172 )
									ret := -0.017871
								if( smoothK_k > 88.4172 )
									ret := 0.057177
							if( VIM > 1.82681 )
								if( d <= 19.0829 )
									ret := -0.328125
								if( d > 19.0829 )
									ret := 0.214689
					if( smoothD_d > 94.8462 )
						if( k <= 98.2357 )
							if( VIP <= 1.18712 )
								if( VIP_VIM <= 0.025513 )
									ret := 0.541667
								if( VIP_VIM > 0.025513 )
									ret := -0.041096
							if( VIP > 1.18712 )
								if( d_k <= 3.58906 )
									ret := -0.377841
								if( d_k > 3.58906 )
									ret := 0.464286
						if( k > 98.2357 )
							if( k <= 99.9964 )
								if( VIP <= 1.6615 )
									ret := 0.019331
								if( VIP > 1.6615 )
									ret := 0.406250
							if( k > 99.9964 )
								if( VIP <= 1.03098 )
									ret := -0.666667
								if( VIP > 1.03098 )
									ret := -0.106503
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ADSK_15Min_bdb6380c(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


