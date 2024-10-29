//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: AAPL_5Min_1BOL_f9620aae Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_1BOL_f9620aae", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_f9620aae(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( vrsi <= 64.7055 )
		if( dif_source_BBupper <= -0.372186 )
			if( BBlower <= 170.547 )
				if( BBupper <= 179.055 )
					if( BBupper <= 172.706 )
						ret := 0.066944
					if( BBupper > 172.706 )
						if( dif_source_BBlower <= 6.4608 )
							ret := 0.225843
						if( dif_source_BBlower > 6.4608 )
							if( BBlower <= 167.569 )
								if( BBupper <= 177.27 )
									ret := 0.133929
								if( BBupper > 177.27 )
									ret := -0.421875
							if( BBlower > 167.569 )
								if( dif_source_BBupper <= -0.899094 )
									ret := -0.790000 // sell
								if( dif_source_BBupper > -0.899094 )
									ret := -0.230769
				if( BBupper > 179.055 )
					if( dif_source_BBlower <= 18.3475 )
						if( dif_source_BBupper <= -7.58795 )
							if( BBupper <= 179.711 )
								ret := 0.250000
							if( BBupper > 179.711 )
								ret := 0.615385
						if( dif_source_BBupper > -7.58795 )
							if( dif_source_BBupper <= -6.57067 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -6.57067 )
								if( BBupper <= 190.026 )
									ret := 0.867925 // buy
								if( BBupper > 190.026 )
									ret := 0.083333
					if( dif_source_BBlower > 18.3475 )
						if( vrsi <= 45.3567 )
							if( vrsi <= 34.9107 )
								ret := 0.058824
							if( vrsi > 34.9107 )
								ret := -0.600000
						if( vrsi > 45.3567 )
							ret := 0.782609 // buy
			if( BBlower > 170.547 )
				if( vrsi <= 18.523 )
					if( BBupper <= 182.498 )
						if( dif_source_BBlower <= -0.532405 )
							if( BBupper <= 182.399 )
								if( dif_source_BBlower <= -0.849097 )
									ret := 0.287770
								if( dif_source_BBlower > -0.849097 )
									ret := 0.625000
							if( BBupper > 182.399 )
								ret := -1.000000 // sell
						if( dif_source_BBlower > -0.532405 )
							if( BBlower <= 177.78 )
								if( dif_source_BBlower <= 0.655461 )
									ret := -0.130332
								if( dif_source_BBlower > 0.655461 )
									ret := 0.108310
							if( BBlower > 177.78 )
								if( dif_source_BBlower <= -0.133229 )
									ret := 0.647059
								if( dif_source_BBlower > -0.133229 )
									ret := -0.543253
					if( BBupper > 182.498 )
						if( dif_source_BBlower <= -7.80612 )
							if( BBupper <= 226.611 )
								ret := -1.000000 // sell
							if( BBupper > 226.611 )
								ret := -0.857143 // sell
						if( dif_source_BBlower > -7.80612 )
							if( vrsi <= 16.9517 )
								if( dif_source_BBupper <= -29.938 )
									ret := -0.862069 // sell
								if( dif_source_BBupper > -29.938 )
									ret := 0.115399
							if( vrsi > 16.9517 )
								if( dif_source_BBlower <= -0.636423 )
									ret := -0.485714
								if( dif_source_BBlower > -0.636423 )
									ret := 0.344884
				if( vrsi > 18.523 )
					if( BBupper <= 236.533 )
						if( BBupper <= 231.056 )
							if( BBlower <= 223.403 )
								if( dif_source_BBupper <= -4.3915 )
									ret := -0.091419
								if( dif_source_BBupper > -4.3915 )
									ret := 0.013321
							if( BBlower > 223.403 )
								if( BBupper <= 228.929 )
									ret := 0.055895
								if( BBupper > 228.929 )
									ret := 0.257862
						if( BBupper > 231.056 )
							if( dif_source_BBupper <= -2.53379 )
								if( dif_source_BBupper <= -2.98742 )
									ret := -0.117313
								if( dif_source_BBupper > -2.98742 )
									ret := 0.276423
							if( dif_source_BBupper > -2.53379 )
								if( dif_source_BBlower <= 5.76269 )
									ret := -0.321818
								if( dif_source_BBlower > 5.76269 )
									ret := -0.666667
					if( BBupper > 236.533 )
						if( BBupper <= 237.277 )
							if( BBupper <= 236.623 )
								if( BBlower <= 228.288 )
									ret := 0.857143 // buy
								if( BBlower > 228.288 )
									ret := 0.958333 // buy
							if( BBupper > 236.623 )
								if( dif_source_BBupper <= -6.53016 )
									ret := 0.625000
								if( dif_source_BBupper > -6.53016 )
									ret := 0.000000
						if( BBupper > 237.277 )
							if( dif_source_BBupper <= -2.68596 )
								if( dif_source_BBlower <= 4.99005 )
									ret := 0.285714
								if( dif_source_BBlower > 4.99005 )
									ret := 0.000000
							if( dif_source_BBupper > -2.68596 )
								ret := -0.454545
		if( dif_source_BBupper > -0.372186 )
			if( dif_source_BBlower <= 18.9874 )
				if( dif_source_BBupper <= 3.63942 )
					if( dif_source_BBlower <= 12.4688 )
						if( BBlower <= 163.953 )
							if( dif_source_BBupper <= -0.071147 )
								if( dif_source_BBlower <= 1.79253 )
									ret := -0.416667
								if( dif_source_BBlower > 1.79253 )
									ret := 0.325000
							if( dif_source_BBupper > -0.071147 )
								if( dif_source_BBupper <= 0.790275 )
									ret := 0.800000 // buy
								if( dif_source_BBupper > 0.790275 )
									ret := 0.187500
						if( BBlower > 163.953 )
							if( vrsi <= 57.0674 )
								if( dif_source_BBlower <= 5.75096 )
									ret := -0.069953
								if( dif_source_BBlower > 5.75096 )
									ret := -0.259740
							if( vrsi > 57.0674 )
								if( BBlower <= 168.99 )
									ret := -0.321586
								if( BBlower > 168.99 )
									ret := 0.037333
					if( dif_source_BBlower > 12.4688 )
						if( dif_source_BBupper <= 1.69305 )
							if( BBlower <= 200.179 )
								if( BBupper <= 202.875 )
									ret := 1.000000 // buy
								if( BBupper > 202.875 )
									ret := 0.937500 // buy
							if( BBlower > 200.179 )
								ret := 0.750000 // buy
						if( dif_source_BBupper > 1.69305 )
							if( BBupper <= 201.993 )
								ret := 0.636364
							if( BBupper > 201.993 )
								ret := 0.285714
				if( dif_source_BBupper > 3.63942 )
					if( BBlower <= 165.842 )
						ret := -0.833333 // sell
					if( BBlower > 165.842 )
						ret := -0.727273 // sell
			if( dif_source_BBlower > 18.9874 )
				if( dif_source_BBupper <= 0.033553 )
					ret := -1.000000 // sell
				if( dif_source_BBupper > 0.033553 )
					if( BBupper <= 183.17 )
						if( BBlower <= 165.316 )
							ret := -0.900000 // sell
						if( BBlower > 165.316 )
							ret := -1.000000 // sell
					if( BBupper > 183.17 )
						ret := -0.090909
	if( vrsi > 64.7055 )
		if( BBlower <= 174.876 )
			if( dif_source_BBupper <= -6.18256 )
				if( BBlower <= 173.967 )
					if( BBlower <= 170.023 )
						if( BBlower <= 163.763 )
							ret := 0.857143 // buy
						if( BBlower > 163.763 )
							if( dif_source_BBlower <= 1.06659 )
								if( BBlower <= 168.789 )
									ret := 0.800000 // buy
								if( BBlower > 168.789 )
									ret := 0.181818
							if( dif_source_BBlower > 1.06659 )
								if( dif_source_BBlower <= 1.54214 )
									ret := -0.250000
								if( dif_source_BBlower > 1.54214 )
									ret := 0.000000
					if( BBlower > 170.023 )
						if( vrsi <= 81.6288 )
							if( dif_source_BBlower <= 1.4322 )
								if( dif_source_BBupper <= -7.19608 )
									ret := 0.461538
								if( dif_source_BBupper > -7.19608 )
									ret := 0.733333 // buy
							if( dif_source_BBlower > 1.4322 )
								if( dif_source_BBlower <= 2.19989 )
									ret := 0.888889 // buy
								if( dif_source_BBlower > 2.19989 )
									ret := 1.000000 // buy
						if( vrsi > 81.6288 )
							ret := 0.307692
				if( BBlower > 173.967 )
					if( dif_source_BBlower <= 1.943 )
						ret := -0.909091 // sell
					if( dif_source_BBlower > 1.943 )
						ret := -0.250000
			if( dif_source_BBupper > -6.18256 )
				if( vrsi <= 78.2433 )
					if( dif_source_BBupper <= 0.151468 )
						if( dif_source_BBupper <= -0.737 )
							if( BBlower <= 169.483 )
								if( BBupper <= 171.414 )
									ret := -0.035011
								if( BBupper > 171.414 )
									ret := -0.306265
							if( BBlower > 169.483 )
								if( dif_source_BBlower <= 5.81332 )
									ret := 0.034970
								if( dif_source_BBlower > 5.81332 )
									ret := 0.444444
						if( dif_source_BBupper > -0.737 )
							if( BBupper <= 177.264 )
								if( vrsi <= 65.8128 )
									ret := -0.716535 // sell
								if( vrsi > 65.8128 )
									ret := -0.134106
							if( BBupper > 177.264 )
								if( vrsi <= 70.5911 )
									ret := -0.883333 // sell
								if( vrsi > 70.5911 )
									ret := -0.576923
					if( dif_source_BBupper > 0.151468 )
						if( BBlower <= 169.099 )
							if( BBupper <= 172.898 )
								if( dif_source_BBupper <= 0.418451 )
									ret := 0.463918
								if( dif_source_BBupper > 0.418451 )
									ret := 0.792079 // buy
							if( BBupper > 172.898 )
								if( vrsi <= 70.4333 )
									ret := 0.263158
								if( vrsi > 70.4333 )
									ret := -0.310345
						if( BBlower > 169.099 )
							if( BBlower <= 174.006 )
								if( dif_source_BBlower <= 3.30494 )
									ret := -0.474359
								if( dif_source_BBlower > 3.30494 )
									ret := 0.239437
							if( BBlower > 174.006 )
								if( dif_source_BBlower <= 3.6356 )
									ret := -0.739130 // sell
								if( dif_source_BBlower > 3.6356 )
									ret := -0.400000
				if( vrsi > 78.2433 )
					if( BBlower <= 162.646 )
						if( vrsi <= 87.1676 )
							if( dif_source_BBlower <= 3.94102 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > 3.94102 )
								ret := 0.916667 // buy
						if( vrsi > 87.1676 )
							ret := -0.200000
					if( BBlower > 162.646 )
						if( BBupper <= 176.505 )
							if( dif_source_BBlower <= 0.740144 )
								if( dif_source_BBlower <= 0.673393 )
									ret := -0.016447
								if( dif_source_BBlower > 0.673393 )
									ret := 0.500000
							if( dif_source_BBlower > 0.740144 )
								if( vrsi <= 99.9986 )
									ret := -0.183739
								if( vrsi > 99.9986 )
									ret := -0.373239
						if( BBupper > 176.505 )
							if( dif_source_BBlower <= 2.94007 )
								if( BBupper <= 179.038 )
									ret := -0.614428
								if( BBupper > 179.038 )
									ret := 0.405405
							if( dif_source_BBlower > 2.94007 )
								if( BBlower <= 169.7 )
									ret := -0.759036 // sell
								if( BBlower > 169.7 )
									ret := -0.069767
		if( BBlower > 174.876 )
			if( BBlower <= 177.173 )
				if( dif_source_BBlower <= 2.80614 )
					if( dif_source_BBupper <= -0.556606 )
						if( BBupper <= 179.49 )
							if( BBlower <= 175.259 )
								if( dif_source_BBupper <= -0.722173 )
									ret := 0.274510
								if( dif_source_BBupper > -0.722173 )
									ret := 0.833333 // buy
							if( BBlower > 175.259 )
								if( dif_source_BBlower <= 0.91353 )
									ret := 0.210526
								if( dif_source_BBlower > 0.91353 )
									ret := -0.327434
						if( BBupper > 179.49 )
							if( dif_source_BBlower <= 2.64761 )
								if( vrsi <= 85.0766 )
									ret := 0.381215
								if( vrsi > 85.0766 )
									ret := 0.139706
							if( dif_source_BBlower > 2.64761 )
								ret := -0.590909
					if( dif_source_BBupper > -0.556606 )
						if( BBlower <= 176.963 )
							if( BBupper <= 178.219 )
								if( dif_source_BBupper <= -0.207441 )
									ret := 0.019231
								if( dif_source_BBupper > -0.207441 )
									ret := 0.383838
							if( BBupper > 178.219 )
								if( dif_source_BBlower <= 1.6862 )
									ret := -0.125000
								if( dif_source_BBlower > 1.6862 )
									ret := 0.719697 // buy
						if( BBlower > 176.963 )
							if( BBupper <= 179.722 )
								if( dif_source_BBlower <= 1.71832 )
									ret := 0.000000
								if( dif_source_BBlower > 1.71832 )
									ret := -0.535714
							if( BBupper > 179.722 )
								ret := 0.222222
				if( dif_source_BBlower > 2.80614 )
					if( dif_source_BBupper <= 0.669739 )
						if( dif_source_BBupper <= -0.84636 )
							if( vrsi <= 99.1513 )
								if( BBupper <= 181.448 )
									ret := -0.929825 // sell
								if( BBupper > 181.448 )
									ret := -0.656250
							if( vrsi > 99.1513 )
								if( BBlower <= 176.374 )
									ret := 1.000000 // buy
								if( BBlower > 176.374 )
									ret := -0.153846
						if( dif_source_BBupper > -0.84636 )
							if( BBlower <= 175.125 )
								ret := 0.722222 // buy
							if( BBlower > 175.125 )
								if( dif_source_BBupper <= 0.566854 )
									ret := -0.162896
								if( dif_source_BBupper > 0.566854 )
									ret := -0.937500 // sell
					if( dif_source_BBupper > 0.669739 )
						if( vrsi <= 92.9678 )
							if( vrsi <= 86.1319 )
								if( vrsi <= 73.2725 )
									ret := 0.900000 // buy
								if( vrsi > 73.2725 )
									ret := 0.971429 // buy
							if( vrsi > 86.1319 )
								ret := 0.615385
						if( vrsi > 92.9678 )
							ret := -0.928571 // sell
			if( BBlower > 177.173 )
				if( dif_source_BBlower <= 16.2895 )
					if( dif_source_BBlower <= 11.3874 )
						if( BBlower <= 215.723 )
							if( BBupper <= 227.115 )
								if( BBlower <= 193.824 )
									ret := -0.029876
								if( BBlower > 193.824 )
									ret := -0.153996
							if( BBupper > 227.115 )
								if( BBlower <= 199.787 )
									ret := 1.000000 // buy
								if( BBlower > 199.787 )
									ret := 0.875000 // buy
						if( BBlower > 215.723 )
							if( vrsi <= 65.0589 )
								if( BBlower <= 225.302 )
									ret := -0.618182
								if( BBlower > 225.302 )
									ret := -0.142857
							if( vrsi > 65.0589 )
								if( dif_source_BBupper <= -4.69956 )
									ret := -0.288732
								if( dif_source_BBupper > -4.69956 )
									ret := 0.071444
					if( dif_source_BBlower > 11.3874 )
						if( vrsi <= 67.5323 )
							if( BBupper <= 221.474 )
								if( BBlower <= 198.918 )
									ret := -0.666667
								if( BBlower > 198.918 )
									ret := -0.846154 // sell
							if( BBupper > 221.474 )
								ret := -0.111111
						if( vrsi > 67.5323 )
							if( BBupper <= 212.677 )
								if( vrsi <= 98.5368 )
									ret := 0.978723 // buy
								if( vrsi > 98.5368 )
									ret := 0.363636
							if( BBupper > 212.677 )
								if( dif_source_BBlower <= 12.7879 )
									ret := 0.932432 // buy
								if( dif_source_BBlower > 12.7879 )
									ret := -0.222222
				if( dif_source_BBlower > 16.2895 )
					if( BBupper <= 219.514 )
						if( dif_source_BBupper <= 0.804835 )
							if( BBlower <= 200.132 )
								if( vrsi <= 87.5567 )
									ret := -0.416667
								if( vrsi > 87.5567 )
									ret := 0.500000
							if( BBlower > 200.132 )
								if( BBlower <= 200.179 )
									ret := 1.000000 // buy
								if( BBlower > 200.179 )
									ret := 0.555556
						if( dif_source_BBupper > 0.804835 )
							if( dif_source_BBupper <= 2.39142 )
								ret := -0.583333
							if( dif_source_BBupper > 2.39142 )
								if( vrsi <= 76.7228 )
									ret := -0.900000 // sell
								if( vrsi > 76.7228 )
									ret := -1.000000 // sell
					if( BBupper > 219.514 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AAPL_5Min_f9620aae(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)

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


