//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: ETHUSDT_15Min_1BOL_ec2c9a9f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_1BOL_ec2c9a9f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_ec2c9a9f(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( vrsi <= 41.0012 )
		if( dif_source_BBupper <= -77.2155 )
			if( dif_source_BBlower <= -69.8436 )
				if( dif_source_BBupper <= -282.443 )
					if( dif_source_BBupper <= -360.369 )
						if( vrsi <= 12.5808 )
							if( dif_source_BBupper <= -459.507 )
								ret := -0.636364
							if( dif_source_BBupper > -459.507 )
								ret := 0.875000 // buy
						if( vrsi > 12.5808 )
							if( BBupper <= 3106.11 )
								ret := 0.851351 // buy
							if( BBupper > 3106.11 )
								ret := 0.458333
					if( dif_source_BBupper > -360.369 )
						if( BBupper <= 3650.47 )
							if( dif_source_BBlower <= -77.6098 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > -77.6098 )
								ret := 0.250000
						if( BBupper > 3650.47 )
							ret := 1.000000 // buy
				if( dif_source_BBupper > -282.443 )
					if( vrsi <= 8.43068 )
						if( BBupper <= 1704.15 )
							ret := 0.571429
						if( BBupper > 1704.15 )
							if( BBupper <= 2013.04 )
								ret := 1.000000 // buy
							if( BBupper > 2013.04 )
								ret := 0.812500 // buy
					if( vrsi > 8.43068 )
						if( BBupper <= 3895.2 )
							if( dif_source_BBlower <= -93.4095 )
								ret := 0.714286 // buy
							if( dif_source_BBlower > -93.4095 )
								ret := 0.988506 // buy
						if( BBupper > 3895.2 )
							ret := 0.750000 // buy
			if( dif_source_BBlower > -69.8436 )
				if( BBlower <= 1779.21 )
					if( BBupper <= 1252.83 )
						if( BBlower <= 1036.02 )
							if( BBupper <= 1155.49 )
								ret := -0.093525
							if( BBupper > 1155.49 )
								ret := 0.547826
						if( BBlower > 1036.02 )
							if( dif_source_BBupper <= -110.539 )
								ret := -0.456710
							if( dif_source_BBupper > -110.539 )
								ret := 0.060086
					if( BBupper > 1252.83 )
						if( BBlower <= 1706.84 )
							if( dif_source_BBupper <= -94.9798 )
								ret := 0.061751
							if( dif_source_BBupper > -94.9798 )
								ret := 0.318118
						if( BBlower > 1706.84 )
							if( dif_source_BBlower <= 60.578 )
								ret := 0.345336
							if( dif_source_BBlower > 60.578 )
								ret := 0.669725
				if( BBlower > 1779.21 )
					if( BBupper <= 2087.66 )
						if( dif_source_BBlower <= 45.7217 )
							if( dif_source_BBupper <= -160.011 )
								ret := -0.489933
							if( dif_source_BBupper > -160.011 )
								ret := -0.036346
						if( dif_source_BBlower > 45.7217 )
							if( vrsi <= 5.53301 )
								ret := -0.945455 // sell
							if( vrsi > 5.53301 )
								ret := -0.363265
					if( BBupper > 2087.66 )
						if( dif_source_BBlower <= 230.212 )
							if( BBupper <= 2365.54 )
								ret := 0.266546
							if( BBupper > 2365.54 )
								ret := 0.066091
						if( dif_source_BBlower > 230.212 )
							if( BBlower <= 3163.19 )
								ret := -0.019313
							if( BBlower > 3163.19 )
								ret := -0.393701
		if( dif_source_BBupper > -77.2155 )
			if( BBlower <= 1169.25 )
				if( dif_source_BBlower <= 51.4753 )
					if( vrsi <= 31.5954 )
						if( BBlower <= 1039.12 )
							if( vrsi <= 15.5677 )
								ret := 0.521739
							if( vrsi > 15.5677 )
								ret := 0.013889
						if( BBlower > 1039.12 )
							if( dif_source_BBlower <= 34.3892 )
								ret := 0.071429
							if( dif_source_BBlower > 34.3892 )
								ret := 0.702128 // buy
					if( vrsi > 31.5954 )
						if( dif_source_BBupper <= -33.279 )
							if( dif_source_BBlower <= 17.619 )
								ret := 0.200000
							if( dif_source_BBlower > 17.619 )
								ret := 0.857143 // buy
						if( dif_source_BBupper > -33.279 )
							if( BBlower <= 1037.02 )
								ret := -0.700000 // sell
							if( BBlower > 1037.02 )
								ret := 0.442308
				if( dif_source_BBlower > 51.4753 )
					if( BBupper <= 1290.34 )
						if( BBlower <= 903.732 )
							if( dif_source_BBupper <= -55.5599 )
								ret := -0.904762 // sell
							if( dif_source_BBupper > -55.5599 )
								ret := -0.341463
						if( BBlower > 903.732 )
							if( BBupper <= 1162.14 )
								ret := 0.414474
							if( BBupper > 1162.14 )
								ret := -0.072755
					if( BBupper > 1290.34 )
						if( BBlower <= 1098.26 )
							if( dif_source_BBlower <= 203.501 )
								ret := 0.250000
							if( dif_source_BBlower > 203.501 )
								ret := -0.833333 // sell
						if( BBlower > 1098.26 )
							if( vrsi <= 37.0143 )
								ret := 0.917431 // buy
							if( vrsi > 37.0143 )
								ret := 0.250000
			if( BBlower > 1169.25 )
				if( dif_source_BBlower <= 178.798 )
					if( BBupper <= 1841.12 )
						if( BBlower <= 1761.79 )
							if( BBupper <= 1685.48 )
								ret := -0.030773
							if( BBupper > 1685.48 )
								ret := 0.061615
						if( BBlower > 1761.79 )
							if( dif_source_BBlower <= -9.39155 )
								ret := 0.733333 // buy
							if( dif_source_BBlower > -9.39155 )
								ret := 0.126703
					if( BBupper > 1841.12 )
						if( BBlower <= 1712.23 )
							if( BBlower <= 1706.56 )
								ret := -0.545455
							if( BBlower > 1706.56 )
								ret := -0.916667 // sell
						if( BBlower > 1712.23 )
							if( dif_source_BBupper <= 14.5144 )
								ret := -0.054454
							if( dif_source_BBupper > 14.5144 )
								ret := 0.368852
				if( dif_source_BBlower > 178.798 )
					if( BBlower <= 1345.31 )
						if( dif_source_BBlower <= 209.068 )
							if( dif_source_BBlower <= 196.502 )
								ret := 0.674419
							if( dif_source_BBlower > 196.502 )
								ret := -0.892857 // sell
						if( dif_source_BBlower > 209.068 )
							if( dif_source_BBlower <= 296.162 )
								ret := 0.684211
							if( dif_source_BBlower > 296.162 )
								ret := 0.061224
					if( BBlower > 1345.31 )
						if( BBlower <= 1604.88 )
							if( BBlower <= 1487.86 )
								ret := -0.041667
							if( BBlower > 1487.86 )
								ret := -0.702899 // sell
						if( BBlower > 1604.88 )
							if( vrsi <= 29.8536 )
								ret := 0.219873
							if( vrsi > 29.8536 )
								ret := 0.028219
	if( vrsi > 41.0012 )
		if( BBlower <= 3431.24 )
			if( BBupper <= 1642.33 )
				if( BBlower <= 1338.59 )
					if( dif_source_BBlower <= -22.1282 )
						if( dif_source_BBlower <= -35.4415 )
							if( dif_source_BBupper <= -156.78 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -156.78 )
								ret := 0.000000
						if( dif_source_BBlower > -35.4415 )
							if( BBlower <= 1323.56 )
								ret := 1.000000 // buy
							if( BBlower > 1323.56 )
								ret := 0.500000
					if( dif_source_BBlower > -22.1282 )
						if( dif_source_BBupper <= -171.897 )
							if( BBlower <= 1112.08 )
								ret := 0.358575
							if( BBlower > 1112.08 )
								ret := -0.121951
						if( dif_source_BBupper > -171.897 )
							if( dif_source_BBupper <= -115.225 )
								ret := -0.206578
							if( dif_source_BBupper > -115.225 )
								ret := -0.016111
				if( BBlower > 1338.59 )
					if( BBlower <= 1475.14 )
						if( BBupper <= 1496.9 )
							if( BBlower <= 1383.41 )
								ret := 0.510204
							if( BBlower > 1383.41 )
								ret := -0.432584
						if( BBupper > 1496.9 )
							if( BBupper <= 1536.35 )
								ret := 0.666667
							if( BBupper > 1536.35 )
								ret := 0.169241
					if( BBlower > 1475.14 )
						if( BBupper <= 1556.02 )
							if( BBlower <= 1508.22 )
								ret := -0.459259
							if( BBlower > 1508.22 )
								ret := 0.733333 // buy
						if( BBupper > 1556.02 )
							if( vrsi <= 58.1341 )
								ret := -0.035635
							if( vrsi > 58.1341 )
								ret := 0.107627
			if( BBupper > 1642.33 )
				if( dif_source_BBupper <= -273.679 )
					if( BBlower <= 1357 )
						if( BBlower <= 1206.58 )
							if( dif_source_BBupper <= -478.755 )
								ret := 0.121951
							if( dif_source_BBupper > -478.755 )
								ret := -0.952381 // sell
						if( BBlower > 1206.58 )
							if( dif_source_BBupper <= -433.552 )
								ret := 0.750000 // buy
							if( dif_source_BBupper > -433.552 )
								ret := -0.968750 // sell
					if( BBlower > 1357 )
						if( dif_source_BBupper <= -322.007 )
							if( dif_source_BBupper <= -1001.08 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -1001.08 )
								ret := -0.010989
						if( dif_source_BBupper > -322.007 )
							if( BBupper <= 3240.95 )
								ret := -0.436620
							if( BBupper > 3240.95 )
								ret := 0.027295
				if( dif_source_BBupper > -273.679 )
					if( BBlower <= 1472.74 )
						if( dif_source_BBlower <= 222.497 )
							if( dif_source_BBlower <= 22.1317 )
								ret := 0.261905
							if( dif_source_BBlower > 22.1317 )
								ret := -0.688525
						if( dif_source_BBlower > 222.497 )
							if( dif_source_BBlower <= 235.375 )
								ret := 0.740000 // buy
							if( dif_source_BBlower > 235.375 )
								ret := -0.087719
					if( BBlower > 1472.74 )
						if( BBlower <= 1477.47 )
							if( dif_source_BBupper <= -66.5576 )
								ret := 0.677632
							if( dif_source_BBupper > -66.5576 )
								ret := -0.333333
						if( BBlower > 1477.47 )
							if( dif_source_BBupper <= 116.259 )
								ret := -0.017558
							if( dif_source_BBupper > 116.259 )
								ret := 0.520000
		if( BBlower > 3431.24 )
			if( dif_source_BBupper <= -119.156 )
				if( BBupper <= 3783.22 )
					if( BBlower <= 3483.97 )
						if( dif_source_BBlower <= 48.7398 )
							if( dif_source_BBlower <= 13.0385 )
								ret := -0.250000
							if( dif_source_BBlower > 13.0385 )
								ret := 0.768293 // buy
						if( dif_source_BBlower > 48.7398 )
							if( vrsi <= 98.6902 )
								ret := -0.385135
							if( vrsi > 98.6902 )
								ret := 0.809524 // buy
					if( BBlower > 3483.97 )
						if( dif_source_BBlower <= -17.4102 )
							if( BBupper <= 3701.6 )
								ret := 0.750000 // buy
							if( BBupper > 3701.6 )
								ret := -0.411765
						if( dif_source_BBlower > -17.4102 )
							if( BBupper <= 3772.64 )
								ret := -0.740260 // sell
							if( BBupper > 3772.64 )
								ret := -1.000000 // sell
				if( BBupper > 3783.22 )
					if( vrsi <= 50.4923 )
						if( dif_source_BBlower <= 10.1751 )
							if( BBupper <= 3947.19 )
								ret := 0.107143
							if( BBupper > 3947.19 )
								ret := 0.638889
						if( dif_source_BBlower > 10.1751 )
							if( dif_source_BBupper <= -211.515 )
								ret := -0.673913
							if( dif_source_BBupper > -211.515 )
								ret := 0.292135
					if( vrsi > 50.4923 )
						if( dif_source_BBupper <= -192.72 )
							if( BBlower <= 3489.34 )
								ret := 0.742857 // buy
							if( BBlower > 3489.34 )
								ret := -0.102990
						if( dif_source_BBupper > -192.72 )
							if( dif_source_BBupper <= -125.725 )
								ret := 0.460317
							if( dif_source_BBupper > -125.725 )
								ret := -0.139535
			if( dif_source_BBupper > -119.156 )
				if( dif_source_BBlower <= 22.0234 )
					if( BBupper <= 3956.88 )
						if( BBlower <= 3473.65 )
							if( dif_source_BBupper <= -105.963 )
								ret := 0.285714
							if( dif_source_BBupper > -105.963 )
								ret := 0.818182 // buy
						if( BBlower > 3473.65 )
							if( BBlower <= 3663.33 )
								ret := -0.128205
							if( BBlower > 3663.33 )
								ret := 0.313253
					if( BBupper > 3956.88 )
						if( BBupper <= 3964.55 )
							ret := -1.000000 // sell
						if( BBupper > 3964.55 )
							ret := 0.000000
				if( dif_source_BBlower > 22.0234 )
					if( dif_source_BBupper <= -37.4753 )
						if( dif_source_BBupper <= -59.3911 )
							if( dif_source_BBlower <= 292.051 )
								ret := -0.296260
							if( dif_source_BBlower > 292.051 )
								ret := 0.365854
						if( dif_source_BBupper > -59.3911 )
							if( BBlower <= 3631.72 )
								ret := -0.758427 // sell
							if( BBlower > 3631.72 )
								ret := -0.315985
					if( dif_source_BBupper > -37.4753 )
						if( dif_source_BBlower <= 245.473 )
							if( BBupper <= 3912.3 )
								ret := -0.076638
							if( BBupper > 3912.3 )
								ret := 0.335294
						if( dif_source_BBlower > 245.473 )
							if( BBlower <= 3684.19 )
								ret := -1.000000 // sell
							if( BBlower > 3684.19 )
								ret := -0.536585
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
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
float op_operation = decision_tree_0_ETHUSDT_15Min_ec2c9a9f(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


