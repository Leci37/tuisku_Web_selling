//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: TTD_15Min_2BS0_0e9f3d74 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_2BS0_0e9f3d74", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_0e9f3d74(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.141833 )
		if( bbm <= 0.902678 )
			if( bbp <= -1.95473 )
				if( rsi1 <= 16.1789 )
					if( bullPower <= -1.35733 )
						if( k <= 0.00142 )
							if( bearPower <= -2.99988 )
								ret := 0.823529 // buy
							if( bearPower > -2.99988 )
								if( d <= 2.4302 )
									ret := -0.062500
								if( d > 2.4302 )
									ret := -0.625000
						if( k > 0.00142 )
							if( bbm <= 0.013629 )
								if( d_k <= 2.39358 )
									ret := -0.225806
								if( d_k > 2.39358 )
									ret := 0.785714 // buy
							if( bbm > 0.013629 )
								if( bbp <= -12.1683 )
									ret := 0.333333
								if( bbp > -12.1683 )
									ret := 0.757764 // buy
					if( bullPower > -1.35733 )
						if( smoothD_d <= -2.48595 )
							if( smoothD_d <= -2.964 )
								if( rsi1 <= 12.5822 )
									ret := -0.352941
								if( rsi1 > 12.5822 )
									ret := 0.800000 // buy
							if( smoothD_d > -2.964 )
								if( bbm <= 0.693103 )
									ret := 0.936170 // buy
								if( bbm > 0.693103 )
									ret := 0.523810
						if( smoothD_d > -2.48595 )
							if( k <= 2.73665 )
								if( rsi1 <= 13.4962 )
									ret := -0.368421
								if( rsi1 > 13.4962 )
									ret := 0.500000
							if( k > 2.73665 )
								if( smoothD_d <= 2.09525 )
									ret := 0.592105
								if( smoothD_d > 2.09525 )
									ret := 0.097087
				if( rsi1 > 16.1789 )
					if( rsi1 <= 17.4769 )
						if( d_k <= -2.0815 )
							ret := 0.346154
						if( d_k > -2.0815 )
							if( smoothD_d <= 8.10343 )
								if( rsi1 <= 17.0576 )
									ret := -0.765957 // sell
								if( rsi1 > 17.0576 )
									ret := -0.333333
							if( smoothD_d > 8.10343 )
								ret := 0.444444
					if( rsi1 > 17.4769 )
						if( d <= 0.557208 )
							if( k <= 0.216386 )
								if( bearPower <= -1.77363 )
									ret := 0.157895
								if( bearPower > -1.77363 )
									ret := -0.727273 // sell
							if( k > 0.216386 )
								if( d <= 0.30965 )
									ret := 0.523810
								if( d > 0.30965 )
									ret := -0.333333
						if( d > 0.557208 )
							if( d <= 81.3583 )
								if( smoothK_k <= 68.2105 )
									ret := 0.199230
								if( smoothK_k > 68.2105 )
									ret := -0.234899
							if( d > 81.3583 )
								if( k <= 84.6704 )
									ret := 0.684685
								if( k > 84.6704 )
									ret := 0.150000
			if( bbp > -1.95473 )
				if( bullPower <= -0.021264 )
					if( d <= 23.5791 )
						if( bbp <= -1.94644 )
							if( bearPower <= -1.24635 )
								ret := -1.000000 // sell
							if( bearPower > -1.24635 )
								ret := -0.200000
						if( bbp > -1.94644 )
							if( k <= 43.4075 )
								if( bbm <= 0.173352 )
									ret := 0.114583
								if( bbm > 0.173352 )
									ret := 0.021014
							if( k > 43.4075 )
								ret := -0.714286 // sell
					if( d > 23.5791 )
						if( smoothK_k <= 16.1973 )
							if( k <= 17.0047 )
								if( smoothK_k <= 10.9712 )
									ret := 0.224066
								if( smoothK_k > 10.9712 )
									ret := 0.004717
							if( k > 17.0047 )
								if( bearPower <= -0.359508 )
									ret := 0.618497
								if( bearPower > -0.359508 )
									ret := 0.196078
						if( smoothK_k > 16.1973 )
							if( bearPower <= -0.744099 )
								if( smoothD_d <= 52.4557 )
									ret := 0.145027
								if( smoothD_d > 52.4557 )
									ret := -0.070671
							if( bearPower > -0.744099 )
								if( rsi1 <= 33.7585 )
									ret := 0.210449
								if( rsi1 > 33.7585 )
									ret := 0.098318
				if( bullPower > -0.021264 )
					if( bbp <= -0.142435 )
						if( smoothD_d <= -1.58597 )
							if( d_k <= -0.110397 )
								if( d <= 0.791706 )
									ret := -0.842105 // sell
								if( d > 0.791706 )
									ret := 0.400000
							if( d_k > -0.110397 )
								if( smoothD_d <= -2.99966 )
									ret := -0.111111
								if( smoothD_d > -2.99966 )
									ret := 0.760417 // buy
						if( smoothD_d > -1.58597 )
							if( smoothK_k <= 73.7275 )
								if( k <= 62.478 )
									ret := -0.036532
								if( k > 62.478 )
									ret := -0.182716
							if( smoothK_k > 73.7275 )
								if( rsi1 <= 34.3828 )
									ret := 0.767442 // buy
								if( rsi1 > 34.3828 )
									ret := 0.075508
					if( bbp > -0.142435 )
						ret := 0.666667
		if( bbm > 0.902678 )
			if( bbp <= -5.77843 )
				if( smoothD_d <= 59.1756 )
					if( d_k <= 7.65311 )
						if( k <= 48.9621 )
							if( k <= 42.596 )
								if( rsi1 <= 4.86288 )
									ret := -0.569620
								if( rsi1 > 4.86288 )
									ret := 0.154365
							if( k > 42.596 )
								if( d <= 46.6375 )
									ret := -0.117647
								if( d > 46.6375 )
									ret := -0.840000 // sell
						if( k > 48.9621 )
							if( bbm <= 5.31025 )
								if( bullPower <= -1.62911 )
									ret := 0.265152
								if( bullPower > -1.62911 )
									ret := -0.500000
							if( bbm > 5.31025 )
								if( smoothD_d <= 48.1525 )
									ret := 0.342105
								if( smoothD_d > 48.1525 )
									ret := 0.816901 // buy
					if( d_k > 7.65311 )
						if( smoothD_d <= 27.5339 )
							if( d <= 8.58264 )
								ret := -1.000000 // sell
							if( d > 8.58264 )
								if( bbm <= 1.87041 )
									ret := 0.115385
								if( bbm > 1.87041 )
									ret := -0.455224
						if( smoothD_d > 27.5339 )
							if( bullPower <= -1.70612 )
								if( k <= 10.3106 )
									ret := 0.418605
								if( k > 10.3106 )
									ret := -0.254072
							if( bullPower > -1.70612 )
								if( bullPower <= 0.737114 )
									ret := 0.726316 // buy
								if( bullPower > 0.737114 )
									ret := -0.450000
				if( smoothD_d > 59.1756 )
					if( smoothD_d <= 95.0644 )
						if( d_k <= 23.1398 )
							if( bullPower <= -16.987 )
								ret := 1.000000 // buy
							if( bullPower > -16.987 )
								if( rsi1 <= 52.4473 )
									ret := -0.357247
								if( rsi1 > 52.4473 )
									ret := 0.672414
						if( d_k > 23.1398 )
							if( d <= 64.6792 )
								ret := -0.333333
							if( d > 64.6792 )
								if( d_k <= 25.3799 )
									ret := 0.535714
								if( d_k > 25.3799 )
									ret := 1.000000 // buy
					if( smoothD_d > 95.0644 )
						ret := 0.875000 // buy
			if( bbp > -5.77843 )
				if( bearPower <= -0.804038 )
					if( bearPower <= -10.3815 )
						ret := 0.928571 // buy
					if( bearPower > -10.3815 )
						if( smoothD_d <= -1.14275 )
							if( smoothK_k <= -2.27532 )
								if( d_k <= 0.192359 )
									ret := -0.365957
								if( d_k > 0.192359 )
									ret := 0.066667
							if( smoothK_k > -2.27532 )
								if( bbp <= -5.53032 )
									ret := -0.153846
								if( bbp > -5.53032 )
									ret := 0.515021
						if( smoothD_d > -1.14275 )
							if( d_k <= 0.793106 )
								if( bullPower <= 0.981357 )
									ret := -0.180566
								if( bullPower > 0.981357 )
									ret := 0.069288
							if( d_k > 0.793106 )
								if( d <= 91.8755 )
									ret := -0.052558
								if( d > 91.8755 )
									ret := -0.341232
				if( bearPower > -0.804038 )
					if( smoothK_k <= -2.172 )
						if( k <= 0.119256 )
							ret := -0.454545
						if( k > 0.119256 )
							ret := -0.875000 // sell
					if( smoothK_k > -2.172 )
						if( smoothK_k <= 62.9776 )
							if( d <= 67.6191 )
								if( bbm <= 1.10658 )
									ret := 0.083102
								if( bbm > 1.10658 )
									ret := 0.400000
							if( d > 67.6191 )
								if( bbp <= -0.468849 )
									ret := 0.500000
								if( bbp > -0.468849 )
									ret := 0.772727 // buy
						if( smoothK_k > 62.9776 )
							if( bbp <= -0.37097 )
								if( bbp <= -0.540134 )
									ret := 0.500000
								if( bbp > -0.540134 )
									ret := -0.492958
							if( bbp > -0.37097 )
								if( d_k <= 11.0078 )
									ret := 0.208633
								if( d_k > 11.0078 )
									ret := -0.500000
	if( bbp > -0.141833 )
		if( smoothK_k <= 96.9983 )
			if( smoothD_d <= 96.9729 )
				if( d_k <= -13.8976 )
					if( smoothD_d <= 18.3888 )
						if( bearPower <= 0.376726 )
							if( k <= 38.7999 )
								if( bbm <= 0.242204 )
									ret := 0.135593
								if( bbm > 0.242204 )
									ret := -0.277027
							if( k > 38.7999 )
								if( rsi1 <= 49.4303 )
									ret := 0.000000
								if( rsi1 > 49.4303 )
									ret := -0.676056
						if( bearPower > 0.376726 )
							if( bullPower <= 3.13305 )
								if( bearPower <= 2.12164 )
									ret := -0.621359
								if( bearPower > 2.12164 )
									ret := -1.000000 // sell
							if( bullPower > 3.13305 )
								if( k <= 39.3199 )
									ret := -0.454545
								if( k > 39.3199 )
									ret := 0.384615
					if( smoothD_d > 18.3888 )
						if( d <= 32.215 )
							if( bbp <= 1.92535 )
								if( bbp <= 0.083489 )
									ret := 0.331126
								if( bbp > 0.083489 )
									ret := 0.074294
							if( bbp > 1.92535 )
								if( k <= 49.2916 )
									ret := -0.253886
								if( k > 49.2916 )
									ret := 0.144578
						if( d > 32.215 )
							if( smoothK_k <= 45.7905 )
								if( smoothK_k <= 44.8758 )
									ret := -0.956522 // sell
								if( smoothK_k > 44.8758 )
									ret := -0.611111
							if( smoothK_k > 45.7905 )
								if( d <= 62.5103 )
									ret := -0.118877
								if( d > 62.5103 )
									ret := -0.019363
				if( d_k > -13.8976 )
					if( rsi1 <= 84.8537 )
						if( bbm <= 13.0862 )
							if( bearPower <= 5.31159 )
								if( bullPower <= 2.91755 )
									ret := -0.020150
								if( bullPower > 2.91755 )
									ret := 0.044711
							if( bearPower > 5.31159 )
								if( d <= 97.8305 )
									ret := -0.139696
								if( d > 97.8305 )
									ret := -0.651376
						if( bbm > 13.0862 )
							if( rsi1 <= 67.6598 )
								if( bbm <= 13.6181 )
									ret := 0.000000
								if( bbm > 13.6181 )
									ret := 0.826531 // buy
							if( rsi1 > 67.6598 )
								if( bearPower <= 1.00305 )
									ret := -0.500000
								if( bearPower > 1.00305 )
									ret := 0.742857 // buy
					if( rsi1 > 84.8537 )
						if( k <= 99.9303 )
							if( d_k <= 3.47542 )
								if( smoothK_k <= 80.7358 )
									ret := 0.595376
								if( smoothK_k > 80.7358 )
									ret := 0.163240
							if( d_k > 3.47542 )
								if( bbp <= 21.6445 )
									ret := -0.193548
								if( bbp > 21.6445 )
									ret := -1.000000 // sell
						if( k > 99.9303 )
							if( rsi1 <= 89.1987 )
								if( bullPower <= 1.55772 )
									ret := -0.166667
								if( bullPower > 1.55772 )
									ret := 0.266667
							if( rsi1 > 89.1987 )
								if( d_k <= -0.376581 )
									ret := -0.454545
								if( d_k > -0.376581 )
									ret := -0.880000 // sell
			if( smoothD_d > 96.9729 )
				if( d <= 99.9985 )
					if( d <= 99.9897 )
						if( smoothK_k <= 96.9659 )
							ret := 0.500000
						if( smoothK_k > 96.9659 )
							ret := 0.888889 // buy
					if( d > 99.9897 )
						ret := 0.176471
				if( d > 99.9985 )
					ret := 1.000000 // buy
		if( smoothK_k > 96.9983 )
			if( bullPower <= 12.1062 )
				if( rsi1 <= 63.1597 )
					if( bbm <= 0.400076 )
						if( d <= 76.3783 )
							ret := -0.772727 // sell
						if( d > 76.3783 )
							if( d_k <= -6.34735 )
								if( rsi1 <= 61.6354 )
									ret := 0.255556
								if( rsi1 > 61.6354 )
									ret := -0.294118
							if( d_k > -6.34735 )
								if( bbp <= 1.42811 )
									ret := -0.300000
								if( bbp > 1.42811 )
									ret := 0.090909
					if( bbm > 0.400076 )
						if( bullPower <= 2.97265 )
							if( bbp <= 2.36578 )
								if( smoothD_d <= 83.6126 )
									ret := -0.613333
								if( smoothD_d > 83.6126 )
									ret := -0.067568
							if( bbp > 2.36578 )
								if( rsi1 <= 55.4392 )
									ret := 0.000000
								if( rsi1 > 55.4392 )
									ret := -0.828571 // sell
						if( bullPower > 2.97265 )
							if( smoothD_d <= 92.7059 )
								if( d_k <= -9.92775 )
									ret := -0.714286 // sell
								if( d_k > -9.92775 )
									ret := -0.944444 // sell
							if( smoothD_d > 92.7059 )
								if( bbp <= 5.27855 )
									ret := -0.600000
								if( bbp > 5.27855 )
									ret := -0.300000
				if( rsi1 > 63.1597 )
					if( bbm <= 0.77861 )
						if( smoothD_d <= 94.6768 )
							if( bearPower <= 0.346838 )
								if( d_k <= -5.29006 )
									ret := 0.006993
								if( d_k > -5.29006 )
									ret := 0.651515
							if( bearPower > 0.346838 )
								if( smoothD_d <= 93.4903 )
									ret := -0.275472
								if( smoothD_d > 93.4903 )
									ret := 0.411765
						if( smoothD_d > 94.6768 )
							if( bullPower <= 0.351663 )
								if( d <= 99.9624 )
									ret := 0.020408
								if( d > 99.9624 )
									ret := 0.416667
							if( bullPower > 0.351663 )
								if( bbm <= 0.55995 )
									ret := -0.273775
								if( bbm > 0.55995 )
									ret := -0.480916
					if( bbm > 0.77861 )
						if( d <= 97.8371 )
							if( bearPower <= 0.9259 )
								if( smoothD_d <= 94.2787 )
									ret := -0.055556
								if( smoothD_d > 94.2787 )
									ret := -0.884615 // sell
							if( bearPower > 0.9259 )
								if( d <= 95.2504 )
									ret := 0.340426
								if( d > 95.2504 )
									ret := -0.268293
						if( d > 97.8371 )
							if( d <= 98.6267 )
								if( bbp <= 10.3944 )
									ret := 0.673469
								if( bbp > 10.3944 )
									ret := 0.076923
							if( d > 98.6267 )
								if( d_k <= -0.311709 )
									ret := -0.063636
								if( d_k > -0.311709 )
									ret := 0.211712
			if( bullPower > 12.1062 )
				if( d_k <= -6.3619 )
					ret := -0.210526
				if( d_k > -6.3619 )
					if( smoothD_d <= 94.7647 )
						if( rsi1 <= 89.9417 )
							ret := -0.800000 // sell
						if( rsi1 > 89.9417 )
							ret := -1.000000 // sell
					if( smoothD_d > 94.7647 )
						if( rsi1 <= 89.4454 )
							if( bbm <= 7.2445 )
								ret := -0.181818
							if( bbm > 7.2445 )
								ret := -0.833333 // sell
						if( rsi1 > 89.4454 )
							ret := -0.818182 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_TTD_15Min_0e9f3d74(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


