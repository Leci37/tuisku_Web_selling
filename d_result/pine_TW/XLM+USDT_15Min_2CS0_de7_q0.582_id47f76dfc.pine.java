//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: XLMUSDT_15Min_2CS0_47f76dfc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_2CS0_47f76dfc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_47f76dfc(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( smoothD_d <= 43.7396 )
		if( rsi1 <= 41.6625 )
			if( k <= 23.8668 )
				if( d <= 7.69066 )
					if( mf <= -0.151754 )
						if( ad_mf <= -3.08325e+06 )
							if( mf <= -0.26545 )
								ret := -0.880952 // sell
							if( mf > -0.26545 )
								ret := -0.150000
						if( ad_mf > -3.08325e+06 )
							if( ad_mf <= -2.5537e+06 )
								ret := 0.714286 // buy
							if( ad_mf > -2.5537e+06 )
								ret := -0.219947
					if( mf > -0.151754 )
						if( rsi1 <= 36.3567 )
							if( mf <= -0.045306 )
								ret := -0.443396
							if( mf > -0.045306 )
								ret := -0.588982
						if( rsi1 > 36.3567 )
							if( ad_mf <= 282947 )
								ret := -0.385484
							if( ad_mf > 282947 )
								ret := -0.617555
				if( d > 7.69066 )
					if( mf <= -0.114354 )
						if( d_k <= -6.24506 )
							if( d_k <= -6.62819 )
								ret := -0.370861
							if( d_k > -6.62819 )
								ret := -0.717391 // sell
						if( d_k > -6.24506 )
							if( smoothK_k <= 18.1952 )
								ret := -0.161471
							if( smoothK_k > 18.1952 )
								ret := -0.024129
					if( mf > -0.114354 )
						if( mf <= 0.038785 )
							if( rsi1 <= 33.3059 )
								ret := -0.501932
							if( rsi1 > 33.3059 )
								ret := -0.301407
						if( mf > 0.038785 )
							if( smoothK_k <= 17.8469 )
								ret := -0.503704
							if( smoothK_k > 17.8469 )
								ret := -0.672072
			if( k > 23.8668 )
				if( ad <= -2.10952e+06 )
					if( smoothD_d <= 16.906 )
						if( mf <= -0.153033 )
							if( k <= 25.9969 )
								ret := -1.000000 // sell
							if( k > 25.9969 )
								ret := -0.625000
						if( mf > -0.153033 )
							if( ad_mf <= -3.05262e+06 )
								ret := -1.000000 // sell
							if( ad_mf > -3.05262e+06 )
								ret := 0.750000 // buy
					if( smoothD_d > 16.906 )
						if( ad_mf <= -2.64431e+06 )
							if( d <= 42.2637 )
								ret := 0.625000
							if( d > 42.2637 )
								ret := -0.095238
						if( ad_mf > -2.64431e+06 )
							if( ad <= -2.37048e+06 )
								ret := -0.476190
							if( ad > -2.37048e+06 )
								ret := 0.488889
				if( ad > -2.10952e+06 )
					if( mf <= -0.078412 )
						if( ad_mf <= 1.23199e+06 )
							if( d <= 37.6672 )
								ret := -0.216637
							if( d > 37.6672 )
								ret := -0.073150
						if( ad_mf > 1.23199e+06 )
							if( mf <= -0.202973 )
								ret := 0.095238
							if( mf > -0.202973 )
								ret := -0.555556
					if( mf > -0.078412 )
						if( d_k <= 1.04678 )
							if( ad <= 1.56365e+06 )
								ret := -0.310000
							if( ad > 1.56365e+06 )
								ret := 0.103448
						if( d_k > 1.04678 )
							if( ad_mf <= -0.094796 )
								ret := -0.231105
							if( ad_mf > -0.094796 )
								ret := -0.603424
		if( rsi1 > 41.6625 )
			if( ad <= 36075.2 )
				if( rsi1 <= 53.1124 )
					if( k <= 32.6674 )
						if( d <= 21.996 )
							if( ad <= -5.61134e+06 )
								ret := -0.837838 // sell
							if( ad > -5.61134e+06 )
								ret := -0.163070
						if( d > 21.996 )
							if( mf <= -0.066631 )
								ret := 0.083189
							if( mf > -0.066631 )
								ret := -0.109210
					if( k > 32.6674 )
						if( ad_mf <= -194793 )
							if( smoothD_d <= 21.6077 )
								ret := -0.078431
							if( smoothD_d > 21.6077 )
								ret := 0.219558
						if( ad_mf > -194793 )
							if( ad_mf <= -0.048237 )
								ret := -0.160232
							if( ad_mf > -0.048237 )
								ret := 0.049140
				if( rsi1 > 53.1124 )
					if( k <= 36.0638 )
						if( ad_mf <= -0.058054 )
							if( smoothK_k <= 5.49687 )
								ret := -0.175373
							if( smoothK_k > 5.49687 )
								ret := 0.083102
						if( ad_mf > -0.058054 )
							if( smoothD_d <= 30.3201 )
								ret := 0.455516
							if( smoothD_d > 30.3201 )
								ret := -0.282051
					if( k > 36.0638 )
						if( smoothD_d <= 43.6555 )
							if( rsi1 <= 66.9436 )
								ret := 0.262791
							if( rsi1 > 66.9436 )
								ret := 0.623529
						if( smoothD_d > 43.6555 )
							ret := -0.750000 // sell
			if( ad > 36075.2 )
				if( k <= 38.4397 )
					if( rsi1 <= 58.3103 )
						if( mf <= -0.041253 )
							if( ad_mf <= 1.46358e+06 )
								ret := -0.113208
							if( ad_mf > 1.46358e+06 )
								ret := 0.380282
						if( mf > -0.041253 )
							if( ad <= 1.10257e+06 )
								ret := -0.324621
							if( ad > 1.10257e+06 )
								ret := -0.653555
					if( rsi1 > 58.3103 )
						if( ad <= 942086 )
							if( d <= 13.864 )
								ret := -0.141844
							if( d > 13.864 )
								ret := 0.104021
						if( ad > 942086 )
							if( k <= 29.5389 )
								ret := -0.494340
							if( k > 29.5389 )
								ret := -0.045455
				if( k > 38.4397 )
					if( mf <= -0.057176 )
						if( ad_mf <= 73286.1 )
							if( ad <= 58862.2 )
								ret := 0.080000
							if( ad > 58862.2 )
								ret := -0.621622
						if( ad_mf > 73286.1 )
							if( mf <= -0.058324 )
								ret := 0.209131
							if( mf > -0.058324 )
								ret := 0.941176 // buy
					if( mf > -0.057176 )
						if( d_k <= 2.95285 )
							if( ad <= 1.04371e+06 )
								ret := -0.095352
							if( ad > 1.04371e+06 )
								ret := 0.087302
						if( d_k > 2.95285 )
							if( smoothD_d <= 42.5566 )
								ret := -0.158416
							if( smoothD_d > 42.5566 )
								ret := -0.655172
	if( smoothD_d > 43.7396 )
		if( rsi1 <= 53.9724 )
			if( mf <= -0.010557 )
				if( rsi1 <= 42.3752 )
					if( ad_mf <= -608237 )
						if( ad <= -2.06999e+06 )
							if( d_k <= 4.56318 )
								ret := 0.807143 // buy
							if( d_k > 4.56318 )
								ret := 0.172414
						if( ad > -2.06999e+06 )
							if( ad <= -2.03497e+06 )
								ret := -1.000000 // sell
							if( ad > -2.03497e+06 )
								ret := 0.259873
					if( ad_mf > -608237 )
						if( d_k <= 1.90021 )
							if( k <= 92.75 )
								ret := -0.078932
							if( k > 92.75 )
								ret := 0.269962
						if( d_k > 1.90021 )
							if( mf <= -0.021652 )
								ret := -0.238385
							if( mf > -0.021652 )
								ret := 0.105769
				if( rsi1 > 42.3752 )
					if( ad <= -230186 )
						if( d_k <= 14.4728 )
							if( d <= 71.968 )
								ret := 0.366689
							if( d > 71.968 )
								ret := 0.512272
						if( d_k > 14.4728 )
							if( d <= 52.5432 )
								ret := 0.551724
							if( d > 52.5432 )
								ret := -0.100000
					if( ad > -230186 )
						if( smoothK_k <= 73.1754 )
							if( rsi1 <= 49.517 )
								ret := -0.052474
							if( rsi1 > 49.517 )
								ret := 0.155587
						if( smoothK_k > 73.1754 )
							if( smoothK_k <= 96.1572 )
								ret := 0.223207
							if( smoothK_k > 96.1572 )
								ret := 0.057971
			if( mf > -0.010557 )
				if( k <= 55.7045 )
					if( d <= 64.9067 )
						if( mf <= 0.079336 )
							if( rsi1 <= 37.81 )
								ret := -0.445887
							if( rsi1 > 37.81 )
								ret := -0.085490
						if( mf > 0.079336 )
							if( ad <= 80703.4 )
								ret := -0.127865
							if( ad > 80703.4 )
								ret := -0.422554
					if( d > 64.9067 )
						if( ad <= 1.51128e+06 )
							if( ad_mf <= -110211 )
								ret := 0.189655
							if( ad_mf > -110211 )
								ret := -0.023026
						if( ad > 1.51128e+06 )
							ret := -0.833333 // sell
				if( k > 55.7045 )
					if( rsi1 <= 47.9167 )
						if( ad <= -70455.9 )
							if( rsi1 <= 30.9764 )
								ret := 0.708333 // buy
							if( rsi1 > 30.9764 )
								ret := 0.032473
						if( ad > -70455.9 )
							if( ad <= 2.8635e+06 )
								ret := -0.166297
							if( ad > 2.8635e+06 )
								ret := 0.343750
					if( rsi1 > 47.9167 )
						if( ad <= -151238 )
							if( k <= 72.4458 )
								ret := 0.288462
							if( k > 72.4458 )
								ret := 0.080645
						if( ad > -151238 )
							if( k <= 79.4172 )
								ret := -0.096794
							if( k > 79.4172 )
								ret := 0.130064
		if( rsi1 > 53.9724 )
			if( d <= 85.2974 )
				if( d_k <= -7.389 )
					if( rsi1 <= 62.6548 )
						if( ad_mf <= 64821.9 )
							if( mf <= -0.034379 )
								ret := 0.529605
							if( mf > -0.034379 )
								ret := 0.367965
						if( ad_mf > 64821.9 )
							if( k <= 62.638 )
								ret := 0.554054
							if( k > 62.638 )
								ret := 0.130673
					if( rsi1 > 62.6548 )
						if( ad <= -57021.7 )
							if( mf <= -0.035887 )
								ret := 0.714640 // buy
							if( mf > -0.035887 )
								ret := 0.555263
						if( ad > -57021.7 )
							if( d <= 81.5324 )
								ret := 0.367534
							if( d > 81.5324 )
								ret := 0.493464
				if( d_k > -7.389 )
					if( mf <= 0.089645 )
						if( k <= 68.6898 )
							if( ad <= -27996 )
								ret := 0.374618
							if( ad > -27996 )
								ret := 0.095735
						if( k > 68.6898 )
							if( ad_mf <= -56805.2 )
								ret := 0.457976
							if( ad_mf > -56805.2 )
								ret := 0.250585
					if( mf > 0.089645 )
						if( ad <= 132071 )
							if( ad <= -9.22578e+06 )
								ret := -0.700000 // sell
							if( ad > -9.22578e+06 )
								ret := 0.221323
						if( ad > 132071 )
							if( smoothD_d <= 55.2098 )
								ret := -0.132282
							if( smoothD_d > 55.2098 )
								ret := 0.099629
			if( d > 85.2974 )
				if( mf <= 0.009054 )
					if( rsi1 <= 75.0046 )
						if( k <= 99.9735 )
							if( ad_mf <= -155448 )
								ret := 0.575324
							if( ad_mf > -155448 )
								ret := 0.428494
						if( k > 99.9735 )
							if( d <= 86.9579 )
								ret := 0.695652
							if( d > 86.9579 )
								ret := 0.299875
					if( rsi1 > 75.0046 )
						if( rsi1 <= 75.6703 )
							if( rsi1 <= 75.4298 )
								ret := 1.000000 // buy
							if( rsi1 > 75.4298 )
								ret := 0.846154 // buy
						if( rsi1 > 75.6703 )
							if( ad <= -213652 )
								ret := 0.445122
							if( ad > -213652 )
								ret := 0.647590
				if( mf > 0.009054 )
					if( rsi1 <= 75.0984 )
						if( rsi1 <= 58.3731 )
							if( smoothD_d <= 82.5645 )
								ret := -0.578947
							if( smoothD_d > 82.5645 )
								ret := 0.167064
						if( rsi1 > 58.3731 )
							if( mf <= 0.185187 )
								ret := 0.348709
							if( mf > 0.185187 )
								ret := 0.201800
					if( rsi1 > 75.0984 )
						if( mf <= 0.225778 )
							if( d_k <= 7.36205 )
								ret := 0.531181
							if( d_k > 7.36205 )
								ret := 0.101449
						if( mf > 0.225778 )
							if( rsi1 <= 91.4945 )
								ret := 0.275776
							if( rsi1 > 91.4945 )
								ret := 0.604167
	
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
float op_operation = decision_tree_0_XLMUSDT_15Min_47f76dfc(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


