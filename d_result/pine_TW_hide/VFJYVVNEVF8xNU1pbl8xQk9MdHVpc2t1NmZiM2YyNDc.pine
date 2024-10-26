//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: TRXUSDT_15Min_1BOL_6fb3f247 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_1BOL_6fb3f247", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_6fb3f247(crossunder_rsi_bbupperInt, BBlower, dif_source_BBlower, dif_source_BBupper, vrsi, BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( BBlower <= 0.053437 )
		if( BBupper <= 0.063501 )
			if( dif_source_BBupper <= -2.5e-05 )
				if( BBlower <= 0.049498 )
					if( BBlower <= 0.049089 )
						if( BBlower <= 0.048191 )
							if( dif_source_BBlower <= 0.003341 )
								if( BBupper <= 0.056803 )
									ret := 0.617021
								if( BBupper > 0.056803 )
									ret := 0.133333
							if( dif_source_BBlower > 0.003341 )
								if( BBlower <= 0.047592 )
									ret := -0.377358
								if( BBlower > 0.047592 )
									ret := 0.210526
						if( BBlower > 0.048191 )
							if( BBlower <= 0.048428 )
								if( dif_source_BBupper <= -0.002526 )
									ret := -0.666667
								if( dif_source_BBupper > -0.002526 )
									ret := -0.500000
							if( BBlower > 0.048428 )
								if( vrsi <= 34.8612 )
									ret := 0.800000 // buy
								if( vrsi > 34.8612 )
									ret := -0.297619
					if( BBlower > 0.049089 )
						if( vrsi <= 31.7315 )
							if( vrsi <= 12.504 )
								if( BBupper <= 0.052239 )
									ret := 0.777778 // buy
								if( BBupper > 0.052239 )
									ret := 1.000000 // buy
							if( vrsi > 12.504 )
								if( BBlower <= 0.049373 )
									ret := 0.772727 // buy
								if( BBlower > 0.049373 )
									ret := 0.500000
						if( vrsi > 31.7315 )
							if( BBupper <= 0.052225 )
								if( BBupper <= 0.051271 )
									ret := 0.127273
								if( BBupper > 0.051271 )
									ret := 0.659341
							if( BBupper > 0.052225 )
								if( dif_source_BBupper <= -0.001627 )
									ret := 0.467742
								if( dif_source_BBupper > -0.001627 )
									ret := -0.028571
				if( BBlower > 0.049498 )
					if( vrsi <= 40.2448 )
						if( BBlower <= 0.053102 )
							if( BBupper <= 0.052779 )
								if( dif_source_BBupper <= -0.000631 )
									ret := -0.345455
								if( dif_source_BBupper > -0.000631 )
									ret := 0.304348
							if( BBupper > 0.052779 )
								if( dif_source_BBlower <= 0.005746 )
									ret := 0.309498
								if( dif_source_BBlower > 0.005746 )
									ret := -0.714286 // sell
						if( BBlower > 0.053102 )
							if( BBlower <= 0.053283 )
								if( BBupper <= 0.056887 )
									ret := 0.142857
								if( BBupper > 0.056887 )
									ret := -0.358491
							if( BBlower > 0.053283 )
								if( vrsi <= 6.90476 )
									ret := 0.714286 // buy
								if( vrsi > 6.90476 )
									ret := 0.240741
					if( vrsi > 40.2448 )
						if( BBupper <= 0.062509 )
							if( BBlower <= 0.050334 )
								if( BBlower <= 0.049734 )
									ret := 0.267606
								if( BBlower > 0.049734 )
									ret := -0.252788
							if( BBlower > 0.050334 )
								if( BBupper <= 0.052939 )
									ret := 0.688889
								if( BBupper > 0.052939 )
									ret := 0.111326
						if( BBupper > 0.062509 )
							if( dif_source_BBlower <= 0.005492 )
								if( vrsi <= 69.2916 )
									ret := 0.333333
								if( vrsi > 69.2916 )
									ret := 0.897436 // buy
							if( dif_source_BBlower > 0.005492 )
								ret := 0.000000
			if( dif_source_BBupper > -2.5e-05 )
				if( dif_source_BBupper <= 3.2e-05 )
					if( dif_source_BBlower <= 0.001386 )
						ret := 0.416667
					if( dif_source_BBlower > 0.001386 )
						if( vrsi <= 85.8974 )
							if( dif_source_BBupper <= -8e-06 )
								ret := -0.384615
							if( dif_source_BBupper > -8e-06 )
								if( dif_source_BBupper <= 1.9e-05 )
									ret := 0.206897
								if( dif_source_BBupper > 1.9e-05 )
									ret := -0.111111
						if( vrsi > 85.8974 )
							ret := -0.733333 // sell
				if( dif_source_BBupper > 3.2e-05 )
					if( BBupper <= 0.05691 )
						if( dif_source_BBlower <= 0.004273 )
							if( vrsi <= 87.2984 )
								if( dif_source_BBlower <= 0.0031 )
									ret := -0.198276
								if( dif_source_BBlower > 0.0031 )
									ret := 0.600000
							if( vrsi > 87.2984 )
								if( dif_source_BBupper <= 0.000167 )
									ret := -0.800000 // sell
								if( dif_source_BBupper > 0.000167 )
									ret := -0.440000
						if( dif_source_BBlower > 0.004273 )
							if( vrsi <= 36.6667 )
								ret := -0.733333 // sell
							if( vrsi > 36.6667 )
								if( BBupper <= 0.055092 )
									ret := -0.909091 // sell
								if( BBupper > 0.055092 )
									ret := -1.000000 // sell
					if( BBupper > 0.05691 )
						ret := 0.500000
		if( BBupper > 0.063501 )
			if( BBupper <= 0.063846 )
				if( dif_source_BBlower <= 0.003626 )
					ret := -0.538462
				if( dif_source_BBlower > 0.003626 )
					ret := -0.785714 // sell
			if( BBupper > 0.063846 )
				if( vrsi <= 33.5136 )
					if( dif_source_BBlower <= 0.004516 )
						if( BBupper <= 0.068647 )
							if( vrsi <= 18.789 )
								ret := 0.647059
							if( vrsi > 18.789 )
								ret := 1.000000 // buy
						if( BBupper > 0.068647 )
							if( BBlower <= 0.052132 )
								ret := -0.166667
							if( BBlower > 0.052132 )
								ret := -0.937500 // sell
					if( dif_source_BBlower > 0.004516 )
						if( BBupper <= 0.067379 )
							if( dif_source_BBlower <= 0.009169 )
								if( vrsi <= 18.2429 )
									ret := 0.428571
								if( vrsi > 18.2429 )
									ret := 0.000000
							if( dif_source_BBlower > 0.009169 )
								if( BBupper <= 0.064883 )
									ret := 0.200000
								if( BBupper > 0.064883 )
									ret := -0.701754 // sell
						if( BBupper > 0.067379 )
							if( vrsi <= 5.38901 )
								ret := -0.928571 // sell
							if( vrsi > 5.38901 )
								ret := -1.000000 // sell
				if( vrsi > 33.5136 )
					if( dif_source_BBupper <= -0.005886 )
						if( dif_source_BBupper <= -0.007968 )
							if( vrsi <= 68.2132 )
								if( BBupper <= 0.068976 )
									ret := 0.217391
								if( BBupper > 0.068976 )
									ret := 0.673469
							if( vrsi > 68.2132 )
								if( BBlower <= 0.051146 )
									ret := 0.666667
								if( BBlower > 0.051146 )
									ret := -0.684211
						if( dif_source_BBupper > -0.007968 )
							if( BBlower <= 0.052036 )
								if( vrsi <= 43.4445 )
									ret := 0.666667
								if( vrsi > 43.4445 )
									ret := 0.950000 // buy
							if( BBlower > 0.052036 )
								ret := 0.500000
					if( dif_source_BBupper > -0.005886 )
						if( BBupper <= 0.067164 )
							if( vrsi <= 40.9185 )
								ret := -0.708333 // sell
							if( vrsi > 40.9185 )
								if( vrsi <= 85.0008 )
									ret := -0.226891
								if( vrsi > 85.0008 )
									ret := 0.333333
						if( BBupper > 0.067164 )
							if( vrsi <= 45.9455 )
								ret := 0.882353 // buy
							if( vrsi > 45.9455 )
								ret := 0.055556
	if( BBlower > 0.053437 )
		if( dif_source_BBlower <= 0.005038 )
			if( BBupper <= 0.122073 )
				if( BBupper <= 0.121789 )
					if( dif_source_BBlower <= 0.000942 )
						if( BBlower <= 0.075381 )
							if( vrsi <= 80.3087 )
								if( BBupper <= 0.05766 )
									ret := -0.047194
								if( BBupper > 0.05766 )
									ret := 0.120812
							if( vrsi > 80.3087 )
								if( BBlower <= 0.068128 )
									ret := -0.204301
								if( BBlower > 0.068128 )
									ret := 0.096000
						if( BBlower > 0.075381 )
							if( crossover_rsi_bblowerInt <= 0.5 )
								if( BBlower <= 0.102634 )
									ret := 0.039109
								if( BBlower > 0.102634 )
									ret := -0.034461
							if( crossover_rsi_bblowerInt > 0.5 )
								if( dif_source_BBupper <= -0.002412 )
									ret := 0.642857
								if( dif_source_BBupper > -0.002412 )
									ret := 0.272727
					if( dif_source_BBlower > 0.000942 )
						if( dif_source_BBlower <= 0.002898 )
							if( BBupper <= 0.085007 )
								if( dif_source_BBupper <= -0.002425 )
									ret := 0.102322
								if( dif_source_BBupper > -0.002425 )
									ret := -0.035896
							if( BBupper > 0.085007 )
								if( dif_source_BBupper <= -0.00721 )
									ret := 0.292887
								if( dif_source_BBupper > -0.00721 )
									ret := 0.030104
						if( dif_source_BBlower > 0.002898 )
							if( BBupper <= 0.086239 )
								if( BBlower <= 0.053712 )
									ret := -0.716667 // sell
								if( BBlower > 0.053712 )
									ret := -0.089033
							if( BBupper > 0.086239 )
								if( dif_source_BBlower <= 0.002903 )
									ret := -0.576923
								if( dif_source_BBlower > 0.002903 )
									ret := 0.045404
				if( BBupper > 0.121789 )
					if( BBlower <= 0.118634 )
						if( vrsi <= 50.3023 )
							if( BBlower <= 0.115553 )
								if( dif_source_BBupper <= -0.0062 )
									ret := 0.600000
								if( dif_source_BBupper > -0.0062 )
									ret := 0.888889 // buy
							if( BBlower > 0.115553 )
								if( BBupper <= 0.121905 )
									ret := 0.729730 // buy
								if( BBupper > 0.121905 )
									ret := 0.285714
						if( vrsi > 50.3023 )
							if( dif_source_BBupper <= -6e-05 )
								if( BBupper <= 0.12201 )
									ret := 0.000000
								if( BBupper > 0.12201 )
									ret := 0.818182 // buy
							if( dif_source_BBupper > -6e-05 )
								if( dif_source_BBlower <= 0.004316 )
									ret := 0.909091 // buy
								if( dif_source_BBlower > 0.004316 )
									ret := 0.636364
					if( BBlower > 0.118634 )
						if( dif_source_BBupper <= -0.001235 )
							if( dif_source_BBupper <= -0.002366 )
								if( dif_source_BBupper <= -0.002707 )
									ret := -0.125000
								if( dif_source_BBupper > -0.002707 )
									ret := -0.222222
							if( dif_source_BBupper > -0.002366 )
								ret := -0.052632
						if( dif_source_BBupper > -0.001235 )
							ret := -0.588235
			if( BBupper > 0.122073 )
				if( crossunder_rsi_bbupperInt <= 0.5 )
					if( dif_source_BBlower <= 0.000929 )
						if( dif_source_BBupper <= -0.001799 )
							if( BBlower <= 0.136838 )
								if( vrsi <= 27.4059 )
									ret := -0.319757
								if( vrsi > 27.4059 )
									ret := -0.145901
							if( BBlower > 0.136838 )
								if( vrsi <= 11.7698 )
									ret := -0.271523
								if( vrsi > 11.7698 )
									ret := -0.053571
						if( dif_source_BBupper > -0.001799 )
							if( BBupper <= 0.15426 )
								if( BBlower <= 0.133224 )
									ret := -0.153623
								if( BBlower > 0.133224 )
									ret := -0.018702
							if( BBupper > 0.15426 )
								ret := 0.769231 // buy
					if( dif_source_BBlower > 0.000929 )
						if( dif_source_BBupper <= 4.7e-05 )
							if( vrsi <= 89.7866 )
								if( BBupper <= 0.156266 )
									ret := 0.000388
								if( BBupper > 0.156266 )
									ret := -0.130715
							if( vrsi > 89.7866 )
								if( dif_source_BBlower <= 0.004757 )
									ret := 0.122905
								if( dif_source_BBlower > 0.004757 )
									ret := 0.710526 // buy
						if( dif_source_BBupper > 4.7e-05 )
							if( BBupper <= 0.156874 )
								if( BBupper <= 0.156495 )
									ret := 0.099490
								if( BBupper > 0.156495 )
									ret := -0.375000
							if( BBupper > 0.156874 )
								if( vrsi <= 90.2778 )
									ret := 0.800000 // buy
								if( vrsi > 90.2778 )
									ret := 0.454545
				if( crossunder_rsi_bbupperInt > 0.5 )
					if( dif_source_BBlower <= 0.003465 )
						ret := 0.062500
					if( dif_source_BBlower > 0.003465 )
						ret := 0.333333
		if( dif_source_BBlower > 0.005038 )
			if( dif_source_BBupper <= -0.002256 )
				if( dif_source_BBupper <= -0.016259 )
					if( vrsi <= 19.4095 )
						if( BBupper <= 0.090153 )
							ret := -0.882353 // sell
						if( BBupper > 0.090153 )
							ret := -1.000000 // sell
					if( vrsi > 19.4095 )
						if( vrsi <= 42.38 )
							ret := -0.200000
						if( vrsi > 42.38 )
							if( dif_source_BBupper <= -0.020545 )
								ret := -0.687500
							if( dif_source_BBupper > -0.020545 )
								ret := -0.900000 // sell
				if( dif_source_BBupper > -0.016259 )
					if( BBupper <= 0.167235 )
						if( vrsi <= 39.9214 )
							if( BBlower <= 0.059082 )
								if( dif_source_BBupper <= -0.003239 )
									ret := -0.096774
								if( dif_source_BBupper > -0.003239 )
									ret := 0.292683
							if( BBlower > 0.059082 )
								if( BBlower <= 0.067112 )
									ret := -0.648208
								if( BBlower > 0.067112 )
									ret := -0.295478
						if( vrsi > 39.9214 )
							if( vrsi <= 40.4325 )
								if( BBlower <= 0.07418 )
									ret := 1.000000 // buy
								if( BBlower > 0.07418 )
									ret := 0.666667
							if( vrsi > 40.4325 )
								if( BBlower <= 0.150297 )
									ret := -0.031562
								if( BBlower > 0.150297 )
									ret := -0.457831
					if( BBupper > 0.167235 )
						if( dif_source_BBupper <= -0.014851 )
							ret := 0.181818
						if( dif_source_BBupper > -0.014851 )
							if( BBupper <= 0.169486 )
								if( BBupper <= 0.168772 )
									ret := -0.836735 // sell
								if( BBupper > 0.168772 )
									ret := -1.000000 // sell
							if( BBupper > 0.169486 )
								if( BBlower <= 0.156273 )
									ret := -0.333333
								if( BBlower > 0.156273 )
									ret := -0.882353 // sell
			if( dif_source_BBupper > -0.002256 )
				if( BBupper <= 0.128342 )
					if( BBlower <= 0.066273 )
						if( vrsi <= 66.808 )
							if( vrsi <= 9.21903 )
								if( BBupper <= 0.065714 )
									ret := -0.500000
								if( BBupper > 0.065714 )
									ret := -0.902439 // sell
							if( vrsi > 9.21903 )
								if( dif_source_BBlower <= 0.005338 )
									ret := 0.074468
								if( dif_source_BBlower > 0.005338 )
									ret := -0.195041
						if( vrsi > 66.808 )
							if( vrsi <= 99.7619 )
								if( BBupper <= 0.069105 )
									ret := -0.052174
								if( BBupper > 0.069105 )
									ret := 0.345161
							if( vrsi > 99.7619 )
								if( BBlower <= 0.061958 )
									ret := 0.194444
								if( BBlower > 0.061958 )
									ret := 0.755102 // buy
					if( BBlower > 0.066273 )
						if( crossunder_rsi_bbupperInt <= 0.5 )
							if( dif_source_BBlower <= 0.007675 )
								if( BBupper <= 0.075616 )
									ret := -0.335793
								if( BBupper > 0.075616 )
									ret := -0.065246
							if( dif_source_BBlower > 0.007675 )
								if( dif_source_BBlower <= 0.007709 )
									ret := -0.952381 // sell
								if( dif_source_BBlower > 0.007709 )
									ret := -0.249208
						if( crossunder_rsi_bbupperInt > 0.5 )
							if( BBupper <= 0.106973 )
								ret := 0.857143 // buy
							if( BBupper > 0.106973 )
								ret := -0.333333
				if( BBupper > 0.128342 )
					if( BBlower <= 0.132541 )
						if( dif_source_BBupper <= 0.000446 )
							if( BBupper <= 0.137917 )
								if( dif_source_BBupper <= 0.000376 )
									ret := 0.080764
								if( dif_source_BBupper > 0.000376 )
									ret := -0.533333
							if( BBupper > 0.137917 )
								if( vrsi <= 74.3421 )
									ret := 0.350877
								if( vrsi > 74.3421 )
									ret := 0.739726 // buy
						if( dif_source_BBupper > 0.000446 )
							if( vrsi <= 89.4444 )
								if( vrsi <= 69.2402 )
									ret := 0.028169
								if( vrsi > 69.2402 )
									ret := 0.413333
							if( vrsi > 89.4444 )
								if( dif_source_BBlower <= 0.014277 )
									ret := 0.827160 // buy
								if( dif_source_BBlower > 0.014277 )
									ret := 1.000000 // buy
					if( BBlower > 0.132541 )
						if( BBupper <= 0.139341 )
							ret := -0.700000 // sell
						if( BBupper > 0.139341 )
							if( BBupper <= 0.161464 )
								if( dif_source_BBlower <= 0.012012 )
									ret := -0.024857
								if( dif_source_BBlower > 0.012012 )
									ret := 1.000000 // buy
							if( BBupper > 0.161464 )
								if( BBlower <= 0.155463 )
									ret := -0.422764
								if( BBlower > 0.155463 )
									ret := 0.033898
	
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
float op_operation = decision_tree_0_TRXUSDT_15Min_6fb3f247(crossunder_rsi_bbupperInt, BBlower, dif_source_BBlower, dif_source_BBupper, vrsi, BBupper, crossover_rsi_bblowerInt)

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


