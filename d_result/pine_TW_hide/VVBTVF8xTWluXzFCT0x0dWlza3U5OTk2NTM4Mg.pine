//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: UPST_1Min_1BOL_99965382 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1BOL_99965382", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_99965382(dif_source_BBupper, crossover_rsi_bblowerInt, BBupper, vrsi, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( BBlower <= 19.9112 )
		if( BBupper <= 22.4523 )
			if( vrsi <= 76.0228 )
				if( dif_source_BBlower <= 3.06289 )
					if( dif_source_BBupper <= -1.25531 )
						ret := 0.800000 // buy
					if( dif_source_BBupper > -1.25531 )
						if( vrsi <= 72.6161 )
							ret := 1.000000 // buy
						if( vrsi > 72.6161 )
							ret := 0.750000 // buy
				if( dif_source_BBlower > 3.06289 )
					ret := 0.250000
			if( vrsi > 76.0228 )
				if( BBupper <= 21.9095 )
					ret := -0.428571
				if( BBupper > 21.9095 )
					ret := -0.833333 // sell
		if( BBupper > 22.4523 )
			if( vrsi <= 58.4991 )
				if( dif_source_BBupper <= -4.05046 )
					if( dif_source_BBupper <= -4.20614 )
						if( dif_source_BBlower <= 1.07866 )
							if( BBlower <= 19.345 )
								if( vrsi <= 47.2798 )
									ret := 1.000000 // buy
								if( vrsi > 47.2798 )
									ret := 0.750000 // buy
							if( BBlower > 19.345 )
								if( BBlower <= 19.4941 )
									ret := -0.800000 // sell
								if( BBlower > 19.4941 )
									ret := 0.136364
						if( dif_source_BBlower > 1.07866 )
							if( BBupper <= 26.4837 )
								if( BBupper <= 25.9366 )
									ret := 0.444444
								if( BBupper > 25.9366 )
									ret := 0.869565 // buy
							if( BBupper > 26.4837 )
								if( dif_source_BBupper <= -5.07028 )
									ret := 0.666667
								if( dif_source_BBupper > -5.07028 )
									ret := -0.375000
					if( dif_source_BBupper > -4.20614 )
						if( dif_source_BBlower <= 1.17119 )
							ret := -1.000000 // sell
						if( dif_source_BBlower > 1.17119 )
							ret := -0.250000
				if( dif_source_BBupper > -4.05046 )
					if( vrsi <= 46.7068 )
						if( dif_source_BBupper <= -0.063928 )
							if( dif_source_BBlower <= 2.19128 )
								if( BBlower <= 19.5473 )
									ret := 0.923077 // buy
								if( BBlower > 19.5473 )
									ret := 0.210526
							if( dif_source_BBlower > 2.19128 )
								if( vrsi <= 14.9255 )
									ret := 0.500000
								if( vrsi > 14.9255 )
									ret := 0.945055 // buy
						if( dif_source_BBupper > -0.063928 )
							ret := 0.000000
					if( vrsi > 46.7068 )
						if( BBlower <= 19.3624 )
							if( BBupper <= 23.3858 )
								ret := 0.000000
							if( BBupper > 23.3858 )
								if( dif_source_BBupper <= -2.06813 )
									ret := 0.500000
								if( dif_source_BBupper > -2.06813 )
									ret := 0.857143 // buy
						if( BBlower > 19.3624 )
							if( vrsi <= 57.4641 )
								if( vrsi <= 52.3226 )
									ret := 0.250000
								if( vrsi > 52.3226 )
									ret := -0.466667
							if( vrsi > 57.4641 )
								ret := 1.000000 // buy
			if( vrsi > 58.4991 )
				if( BBupper <= 25.4144 )
					if( dif_source_BBlower <= 3.43033 )
						if( vrsi <= 65.763 )
							if( BBlower <= 19.086 )
								ret := -0.800000 // sell
							if( BBlower > 19.086 )
								ret := -1.000000 // sell
						if( vrsi > 65.763 )
							if( vrsi <= 71.5849 )
								ret := 0.800000 // buy
							if( vrsi > 71.5849 )
								if( dif_source_BBlower <= 1.53559 )
									ret := 0.000000
								if( dif_source_BBlower > 1.53559 )
									ret := -0.857143 // sell
					if( dif_source_BBlower > 3.43033 )
						if( vrsi <= 71.4053 )
							if( dif_source_BBupper <= -0.480534 )
								if( dif_source_BBlower <= 4.41471 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 4.41471 )
									ret := 0.400000
							if( dif_source_BBupper > -0.480534 )
								if( vrsi <= 69.2499 )
									ret := -0.400000
								if( vrsi > 69.2499 )
									ret := 0.571429
						if( vrsi > 71.4053 )
							if( BBlower <= 19.2206 )
								ret := 0.800000 // buy
							if( BBlower > 19.2206 )
								if( dif_source_BBupper <= -0.320801 )
									ret := -0.533333
								if( dif_source_BBupper > -0.320801 )
									ret := -0.900000 // sell
				if( BBupper > 25.4144 )
					if( dif_source_BBupper <= -3.96408 )
						if( vrsi <= 77.893 )
							if( vrsi <= 63.3911 )
								ret := 0.800000 // buy
							if( vrsi > 63.3911 )
								if( BBupper <= 26.1335 )
									ret := -0.500000
								if( BBupper > 26.1335 )
									ret := 0.000000
						if( vrsi > 77.893 )
							ret := 0.833333 // buy
					if( dif_source_BBupper > -3.96408 )
						if( vrsi <= 79.5162 )
							ret := 1.000000 // buy
						if( vrsi > 79.5162 )
							ret := 0.250000
	if( BBlower > 19.9112 )
		if( vrsi <= 53.2031 )
			if( BBlower <= 53.1573 )
				if( BBupper <= 23.7072 )
					if( dif_source_BBlower <= -0.085806 )
						if( vrsi <= 37.9785 )
							if( dif_source_BBupper <= -0.552349 )
								if( vrsi <= 6.76674 )
									ret := 0.375000
								if( vrsi > 6.76674 )
									ret := 0.699346
							if( dif_source_BBupper > -0.552349 )
								if( vrsi <= 9.83871 )
									ret := -0.222222
								if( vrsi > 9.83871 )
									ret := 0.404762
						if( vrsi > 37.9785 )
							if( BBlower <= 22.7535 )
								if( BBlower <= 22.4571 )
									ret := 0.136364
								if( BBlower > 22.4571 )
									ret := -0.833333 // sell
							if( BBlower > 22.7535 )
								if( BBlower <= 22.8893 )
									ret := 1.000000 // buy
								if( BBlower > 22.8893 )
									ret := 0.000000
					if( dif_source_BBlower > -0.085806 )
						if( vrsi <= 33.0943 )
							if( vrsi <= 32.0976 )
								if( BBupper <= 23.4725 )
									ret := 0.130123
								if( BBupper > 23.4725 )
									ret := 0.281481
							if( vrsi > 32.0976 )
								if( BBlower <= 23.1158 )
									ret := 0.322917
								if( BBlower > 23.1158 )
									ret := 0.826087 // buy
						if( vrsi > 33.0943 )
							if( BBupper <= 23.4812 )
								if( dif_source_BBlower <= 0.444371 )
									ret := 0.020751
								if( dif_source_BBlower > 0.444371 )
									ret := 0.135935
							if( BBupper > 23.4812 )
								if( BBlower <= 22.7305 )
									ret := 0.562500
								if( BBlower > 22.7305 )
									ret := 0.150175
				if( BBupper > 23.7072 )
					if( BBlower <= 45.8077 )
						if( BBupper <= 24.216 )
							if( BBupper <= 24.2128 )
								if( dif_source_BBupper <= -0.450787 )
									ret := 0.120779
								if( dif_source_BBupper > -0.450787 )
									ret := -0.198362
							if( BBupper > 24.2128 )
								if( dif_source_BBupper <= -0.281195 )
									ret := -0.846154 // sell
								if( dif_source_BBupper > -0.281195 )
									ret := -0.142857
						if( BBupper > 24.216 )
							if( BBupper <= 24.769 )
								if( dif_source_BBupper <= -0.60542 )
									ret := 0.352174
								if( dif_source_BBupper > -0.60542 )
									ret := 0.170970
							if( BBupper > 24.769 )
								if( BBlower <= 44.006 )
									ret := 0.069318
								if( BBlower > 44.006 )
									ret := -0.263158
					if( BBlower > 45.8077 )
						if( vrsi <= 27.242 )
							if( dif_source_BBupper <= -1.59347 )
								if( BBupper <= 57.0282 )
									ret := 0.904762 // buy
								if( BBupper > 57.0282 )
									ret := 0.125000
							if( dif_source_BBupper > -1.59347 )
								if( BBupper <= 56.3391 )
									ret := 0.700000 // buy
								if( BBupper > 56.3391 )
									ret := -1.000000 // sell
						if( vrsi > 27.242 )
							if( BBlower <= 47.5094 )
								if( dif_source_BBlower <= 7.98759 )
									ret := 0.443478
								if( dif_source_BBlower > 7.98759 )
									ret := -0.384615
							if( BBlower > 47.5094 )
								if( vrsi <= 47.1439 )
									ret := -0.482143
								if( vrsi > 47.1439 )
									ret := 0.684211
			if( BBlower > 53.1573 )
				if( dif_source_BBupper <= -1.40366 )
					if( BBlower <= 53.3234 )
						ret := 0.750000 // buy
					if( BBlower > 53.3234 )
						if( dif_source_BBupper <= -1.57752 )
							ret := 0.250000
						if( dif_source_BBupper > -1.57752 )
							if( vrsi <= 19.9222 )
								ret := -0.200000
							if( vrsi > 19.9222 )
								ret := 0.000000
				if( dif_source_BBupper > -1.40366 )
					if( vrsi <= 48.8543 )
						if( BBupper <= 55.6596 )
							if( dif_source_BBupper <= -0.801414 )
								ret := -0.714286 // sell
							if( dif_source_BBupper > -0.801414 )
								if( BBlower <= 53.3923 )
									ret := 0.333333
								if( BBlower > 53.3923 )
									ret := -0.500000
						if( BBupper > 55.6596 )
							if( BBupper <= 55.7053 )
								ret := -1.000000 // sell
							if( BBupper > 55.7053 )
								if( vrsi <= 22.5823 )
									ret := -0.500000
								if( vrsi > 22.5823 )
									ret := -0.941176 // sell
					if( vrsi > 48.8543 )
						if( BBlower <= 53.6065 )
							ret := 0.250000
						if( BBlower > 53.6065 )
							ret := 0.000000
		if( vrsi > 53.2031 )
			if( BBlower <= 32.7371 )
				if( BBupper <= 22.5699 )
					if( dif_source_BBlower <= 2.03797 )
						if( dif_source_BBupper <= 0.189197 )
							if( BBupper <= 22.5437 )
								if( dif_source_BBlower <= 0.435983 )
									ret := 0.015329
								if( dif_source_BBlower > 0.435983 )
									ret := 0.195652
							if( BBupper > 22.5437 )
								if( vrsi <= 72.5262 )
									ret := 0.101124
								if( vrsi > 72.5262 )
									ret := 0.626374
						if( dif_source_BBupper > 0.189197 )
							if( BBlower <= 21.3781 )
								if( dif_source_BBlower <= 1.25329 )
									ret := -0.666667
								if( dif_source_BBlower > 1.25329 )
									ret := 0.625000
							if( BBlower > 21.3781 )
								if( BBlower <= 21.6634 )
									ret := 1.000000 // buy
								if( BBlower > 21.6634 )
									ret := 0.625000
					if( dif_source_BBlower > 2.03797 )
						if( BBlower <= 20.1542 )
							ret := -0.200000
						if( BBlower > 20.1542 )
							if( BBlower <= 20.5588 )
								ret := -1.000000 // sell
							if( BBlower > 20.5588 )
								ret := -0.250000
				if( BBupper > 22.5699 )
					if( vrsi <= 71.3524 )
						if( dif_source_BBupper <= 0.17128 )
							if( dif_source_BBupper <= -0.388697 )
								if( BBupper <= 37.5584 )
									ret := 0.063557
								if( BBupper > 37.5584 )
									ret := -0.573770
							if( dif_source_BBupper > -0.388697 )
								if( BBlower <= 21.997 )
									ret := -0.383117
								if( BBlower > 21.997 )
									ret := -0.045383
						if( dif_source_BBupper > 0.17128 )
							if( BBlower <= 30.1419 )
								if( BBlower <= 26.9878 )
									ret := 0.234694
								if( BBlower > 26.9878 )
									ret := 0.650000
							if( BBlower > 30.1419 )
								if( BBlower <= 32.4198 )
									ret := -0.761905 // sell
								if( BBlower > 32.4198 )
									ret := 0.000000
					if( vrsi > 71.3524 )
						if( dif_source_BBupper <= 0.61589 )
							if( BBlower <= 20.897 )
								if( dif_source_BBupper <= -1.607 )
									ret := 0.000000
								if( dif_source_BBupper > -1.607 )
									ret := -0.750000 // sell
							if( BBlower > 20.897 )
								if( dif_source_BBlower <= 2.65346 )
									ret := -0.071100
								if( dif_source_BBlower > 2.65346 )
									ret := 0.171930
						if( dif_source_BBupper > 0.61589 )
							if( dif_source_BBlower <= 1.3614 )
								ret := 0.400000
							if( dif_source_BBlower > 1.3614 )
								if( BBlower <= 23.7353 )
									ret := -0.725000 // sell
								if( BBlower > 23.7353 )
									ret := -0.397959
			if( BBlower > 32.7371 )
				if( BBlower <= 33.4592 )
					if( dif_source_BBlower <= -0.249263 )
						ret := -1.000000 // sell
					if( dif_source_BBlower > -0.249263 )
						if( BBupper <= 33.9659 )
							if( dif_source_BBupper <= -0.342267 )
								if( BBupper <= 33.9138 )
									ret := 0.156250
								if( BBupper > 33.9138 )
									ret := 1.000000 // buy
							if( dif_source_BBupper > -0.342267 )
								if( dif_source_BBupper <= -0.222469 )
									ret := -0.291667
								if( dif_source_BBupper > -0.222469 )
									ret := -0.846154 // sell
						if( BBupper > 33.9659 )
							if( BBupper <= 38.7224 )
								if( vrsi <= 54.9887 )
									ret := -0.131579
								if( vrsi > 54.9887 )
									ret := 0.444976
							if( BBupper > 38.7224 )
								if( BBupper <= 38.9884 )
									ret := 1.000000 // buy
								if( BBupper > 38.9884 )
									ret := 0.250000
				if( BBlower > 33.4592 )
					if( BBupper <= 56.3899 )
						if( dif_source_BBlower <= 3.80129 )
							if( BBlower <= 34.8946 )
								if( dif_source_BBlower <= 0.448348 )
									ret := 0.136232
								if( dif_source_BBlower > 0.448348 )
									ret := -0.203686
							if( BBlower > 34.8946 )
								if( dif_source_BBupper <= -1.30232 )
									ret := 0.155941
								if( dif_source_BBupper > -1.30232 )
									ret := 0.016905
						if( dif_source_BBlower > 3.80129 )
							if( vrsi <= 74.8946 )
								if( BBupper <= 55.4876 )
									ret := 0.309524
								if( BBupper > 55.4876 )
									ret := -1.000000 // sell
							if( vrsi > 74.8946 )
								if( BBlower <= 36.78 )
									ret := -0.500000
								if( BBlower > 36.78 )
									ret := 0.843478 // buy
					if( BBupper > 56.3899 )
						if( BBupper <= 56.6025 )
							ret := -1.000000 // sell
						if( BBupper > 56.6025 )
							if( BBlower <= 49.1889 )
								if( vrsi <= 56.2387 )
									ret := -0.571429
								if( vrsi > 56.2387 )
									ret := -1.000000 // sell
							if( BBlower > 49.1889 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UPST_1Min_99965382(dif_source_BBupper, crossover_rsi_bblowerInt, BBupper, vrsi, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower)

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


