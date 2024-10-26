//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: PYPL_1Min_1BOL_d7a2eb33 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1BOL_d7a2eb33", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_d7a2eb33(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( vrsi <= 42.7915 )
		if( BBupper <= 73.2864 )
			if( BBlower <= 72.1266 )
				if( dif_source_BBlower <= -0.536661 )
					if( dif_source_BBlower <= -0.606427 )
						if( BBlower <= 68.5439 )
							if( vrsi <= 10.4251 )
								if( BBupper <= 65.5542 )
									ret := -0.750000 // sell
								if( BBupper > 65.5542 )
									ret := -0.071429
							if( vrsi > 10.4251 )
								if( vrsi <= 19.1144 )
									ret := 1.000000 // buy
								if( vrsi > 19.1144 )
									ret := 0.777778 // buy
						if( BBlower > 68.5439 )
							ret := -0.400000
					if( dif_source_BBlower > -0.606427 )
						if( BBupper <= 67.5475 )
							if( vrsi <= 8.80632 )
								ret := 0.818182 // buy
							if( vrsi > 8.80632 )
								ret := 1.000000 // buy
						if( BBupper > 67.5475 )
							if( dif_source_BBupper <= -2.12896 )
								ret := 0.153846
							if( dif_source_BBupper > -2.12896 )
								ret := 0.750000 // buy
				if( dif_source_BBlower > -0.536661 )
					if( BBupper <= 72.9753 )
						if( dif_source_BBupper <= -2.22074 )
							if( BBlower <= 67.5974 )
								if( vrsi <= 27.2011 )
									ret := 0.112000
								if( vrsi > 27.2011 )
									ret := -0.227642
							if( BBlower > 67.5974 )
								if( vrsi <= 39.5086 )
									ret := -0.625850
								if( vrsi > 39.5086 )
									ret := 0.300000
						if( dif_source_BBupper > -2.22074 )
							if( vrsi <= 11.5982 )
								if( dif_source_BBupper <= -0.155388 )
									ret := 0.097681
								if( dif_source_BBupper > -0.155388 )
									ret := 0.425806
							if( vrsi > 11.5982 )
								if( BBupper <= 58.1058 )
									ret := 0.598592
								if( BBupper > 58.1058 )
									ret := 0.064207
					if( BBupper > 72.9753 )
						if( dif_source_BBupper <= -0.660386 )
							if( vrsi <= 37.4319 )
								if( dif_source_BBlower <= 0.27471 )
									ret := -0.127962
								if( dif_source_BBlower > 0.27471 )
									ret := -0.609375
							if( vrsi > 37.4319 )
								if( dif_source_BBlower <= 0.284837 )
									ret := -0.448276
								if( dif_source_BBlower > 0.284837 )
									ret := -0.941176 // sell
						if( dif_source_BBupper > -0.660386 )
							if( vrsi <= 41.1661 )
								if( BBlower <= 70.9809 )
									ret := 0.642857
								if( BBlower > 70.9809 )
									ret := -0.157143
							if( vrsi > 41.1661 )
								ret := 0.916667 // buy
			if( BBlower > 72.1266 )
				if( BBupper <= 72.5812 )
					ret := 0.600000
				if( BBupper > 72.5812 )
					if( BBupper <= 72.8759 )
						if( BBlower <= 72.208 )
							ret := -1.000000 // sell
						if( BBlower > 72.208 )
							if( dif_source_BBlower <= 0.053208 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > 0.053208 )
								ret := -0.500000
					if( BBupper > 72.8759 )
						if( BBupper <= 73.1548 )
							if( vrsi <= 20.1815 )
								if( BBlower <= 72.2312 )
									ret := -0.822222 // sell
								if( BBlower > 72.2312 )
									ret := -0.117647
							if( vrsi > 20.1815 )
								if( dif_source_BBupper <= -0.403443 )
									ret := -0.375000
								if( dif_source_BBupper > -0.403443 )
									ret := 0.357143
						if( BBupper > 73.1548 )
							if( BBlower <= 72.211 )
								if( BBupper <= 73.2003 )
									ret := -0.384615
								if( BBupper > 73.2003 )
									ret := 0.111111
							if( BBlower > 72.211 )
								if( dif_source_BBlower <= 0.52084 )
									ret := -0.051282
								if( dif_source_BBlower > 0.52084 )
									ret := 0.571429
		if( BBupper > 73.2864 )
			if( vrsi <= 40.265 )
				if( dif_source_BBupper <= -0.101258 )
					if( BBupper <= 78.1671 )
						if( BBupper <= 74.1577 )
							if( BBlower <= 71.7369 )
								if( BBupper <= 73.3053 )
									ret := 0.333333
								if( BBupper > 73.3053 )
									ret := 0.838462 // buy
							if( BBlower > 71.7369 )
								if( BBlower <= 72.291 )
									ret := -0.386667
								if( BBlower > 72.291 )
									ret := 0.164875
						if( BBupper > 74.1577 )
							if( vrsi <= 18.7317 )
								if( vrsi <= 0.013183 )
									ret := 0.378378
								if( vrsi > 0.013183 )
									ret := 0.722420 // buy
							if( vrsi > 18.7317 )
								if( BBlower <= 75.3038 )
									ret := 0.854369 // buy
								if( BBlower > 75.3038 )
									ret := 0.218094
					if( BBupper > 78.1671 )
						if( vrsi <= 29.4563 )
							if( BBlower <= 78.0274 )
								if( BBupper <= 78.5772 )
									ret := 0.097257
								if( BBupper > 78.5772 )
									ret := -0.337379
							if( BBlower > 78.0274 )
								if( BBupper <= 81.1355 )
									ret := 0.324459
								if( BBupper > 81.1355 )
									ret := -0.228650
						if( vrsi > 29.4563 )
							if( dif_source_BBupper <= -0.227705 )
								if( dif_source_BBlower <= 0.596087 )
									ret := 0.432215
								if( dif_source_BBlower > 0.596087 )
									ret := -0.042904
							if( dif_source_BBupper > -0.227705 )
								if( BBlower <= 79.5433 )
									ret := 0.300000
								if( BBlower > 79.5433 )
									ret := -0.697674
				if( dif_source_BBupper > -0.101258 )
					if( crossunder_rsi_bbupperInt <= 0.5 )
						if( BBlower <= 77.0786 )
							if( dif_source_BBlower <= 1.20593 )
								if( dif_source_BBupper <= -0.060783 )
									ret := 0.666667
								if( dif_source_BBupper > -0.060783 )
									ret := 0.250000
							if( dif_source_BBlower > 1.20593 )
								if( BBlower <= 76.547 )
									ret := -0.212121
								if( BBlower > 76.547 )
									ret := 0.666667
						if( BBlower > 77.0786 )
							if( dif_source_BBlower <= 0.771518 )
								if( vrsi <= 38.5068 )
									ret := 0.097561
								if( vrsi > 38.5068 )
									ret := -0.454545
							if( dif_source_BBlower > 0.771518 )
								if( BBupper <= 79.5524 )
									ret := -0.964286 // sell
								if( BBupper > 79.5524 )
									ret := -0.346154
					if( crossunder_rsi_bbupperInt > 0.5 )
						ret := 0.187500
			if( vrsi > 40.265 )
				if( dif_source_BBupper <= -0.954563 )
					if( dif_source_BBlower <= 0.209405 )
						if( BBlower <= 76.8061 )
							ret := 0.100000
						if( BBlower > 76.8061 )
							if( BBlower <= 77.6808 )
								if( BBupper <= 77.8916 )
									ret := -0.833333 // sell
								if( BBupper > 77.8916 )
									ret := -1.000000 // sell
							if( BBlower > 77.6808 )
								ret := -0.500000
					if( dif_source_BBlower > 0.209405 )
						if( dif_source_BBupper <= -1.68179 )
							ret := 0.500000
						if( dif_source_BBupper > -1.68179 )
							ret := -0.307692
				if( dif_source_BBupper > -0.954563 )
					if( BBlower <= 76.4304 )
						if( dif_source_BBupper <= -0.431144 )
							if( vrsi <= 41.4839 )
								ret := 0.588235
							if( vrsi > 41.4839 )
								ret := 0.909091 // buy
						if( dif_source_BBupper > -0.431144 )
							if( BBupper <= 73.92 )
								ret := -0.076923
							if( BBupper > 73.92 )
								ret := 0.595238
					if( BBlower > 76.4304 )
						if( vrsi <= 40.8318 )
							if( dif_source_BBupper <= -0.265587 )
								if( BBlower <= 77.6724 )
									ret := 0.384615
								if( BBlower > 77.6724 )
									ret := -0.790698 // sell
							if( dif_source_BBupper > -0.265587 )
								if( BBlower <= 78.9208 )
									ret := 0.714286 // buy
								if( BBlower > 78.9208 )
									ret := -0.600000
						if( vrsi > 40.8318 )
							if( dif_source_BBupper <= 0.091551 )
								if( dif_source_BBlower <= 0.999236 )
									ret := 0.067114
								if( dif_source_BBlower > 0.999236 )
									ret := -0.366667
							if( dif_source_BBupper > 0.091551 )
								ret := 0.625000
	if( vrsi > 42.7915 )
		if( BBlower <= 60.3865 )
			if( BBlower <= 58.8338 )
				if( vrsi <= 86.2979 )
					if( dif_source_BBlower <= 0.472797 )
						if( dif_source_BBupper <= 0.007292 )
							if( BBupper <= 59.8485 )
								if( BBlower <= 57.8467 )
									ret := 0.323420
								if( BBlower > 57.8467 )
									ret := 0.089099
							if( BBupper > 59.8485 )
								if( BBupper <= 62.0499 )
									ret := -0.292308
								if( BBupper > 62.0499 )
									ret := 0.500000
						if( dif_source_BBupper > 0.007292 )
							if( dif_source_BBupper <= 0.030549 )
								ret := -0.842105 // sell
							if( dif_source_BBupper > 0.030549 )
								ret := -0.318182
					if( dif_source_BBlower > 0.472797 )
						if( vrsi <= 69.9974 )
							if( dif_source_BBupper <= 0.113541 )
								if( dif_source_BBupper <= -4.90395 )
									ret := 0.666667
								if( dif_source_BBupper > -4.90395 )
									ret := -0.211859
							if( dif_source_BBupper > 0.113541 )
								if( vrsi <= 55.6126 )
									ret := 0.938776 // buy
								if( vrsi > 55.6126 )
									ret := -0.058824
						if( vrsi > 69.9974 )
							if( dif_source_BBupper <= 0.613646 )
								if( vrsi <= 85.7228 )
									ret := 0.033149
								if( vrsi > 85.7228 )
									ret := 0.833333 // buy
							if( dif_source_BBupper > 0.613646 )
								ret := 1.000000 // buy
				if( vrsi > 86.2979 )
					if( BBupper <= 59.4089 )
						if( dif_source_BBupper <= 0.112206 )
							if( dif_source_BBupper <= -0.425392 )
								if( dif_source_BBupper <= -0.654145 )
									ret := -0.192982
								if( dif_source_BBupper > -0.654145 )
									ret := -0.571429
							if( dif_source_BBupper > -0.425392 )
								if( BBupper <= 58.4294 )
									ret := -0.439560
								if( BBupper > 58.4294 )
									ret := -0.051282
						if( dif_source_BBupper > 0.112206 )
							if( dif_source_BBupper <= 0.13699 )
								ret := -0.562500
							if( dif_source_BBupper > 0.13699 )
								if( BBupper <= 59.0453 )
									ret := -0.818182 // sell
								if( BBupper > 59.0453 )
									ret := -1.000000 // sell
					if( BBupper > 59.4089 )
						if( vrsi <= 92.3278 )
							if( dif_source_BBupper <= 0.201232 )
								if( BBlower <= 58.7158 )
									ret := -0.777778 // sell
								if( BBlower > 58.7158 )
									ret := 0.086957
							if( dif_source_BBupper > 0.201232 )
								if( dif_source_BBlower <= 1.47383 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 1.47383 )
									ret := -0.300000
						if( vrsi > 92.3278 )
							if( vrsi <= 97.4724 )
								if( dif_source_BBupper <= -0.270248 )
									ret := 0.891304 // buy
								if( dif_source_BBupper > -0.270248 )
									ret := 0.176471
							if( vrsi > 97.4724 )
								if( dif_source_BBupper <= 0.28045 )
									ret := -0.391304
								if( dif_source_BBupper > 0.28045 )
									ret := 1.000000 // buy
			if( BBlower > 58.8338 )
				if( BBlower <= 60.3844 )
					if( dif_source_BBlower <= -0.027021 )
						if( BBlower <= 60.1208 )
							if( dif_source_BBupper <= -1.03837 )
								if( dif_source_BBupper <= -4.51352 )
									ret := 0.375000
								if( dif_source_BBupper > -4.51352 )
									ret := -0.848101 // sell
							if( dif_source_BBupper > -1.03837 )
								if( vrsi <= 45.0457 )
									ret := 0.833333 // buy
								if( vrsi > 45.0457 )
									ret := -0.481481
						if( BBlower > 60.1208 )
							if( dif_source_BBlower <= -0.07057 )
								ret := 0.428571
							if( dif_source_BBlower > -0.07057 )
								ret := -0.300000
					if( dif_source_BBlower > -0.027021 )
						if( dif_source_BBlower <= -0.023004 )
							ret := 1.000000 // buy
						if( dif_source_BBlower > -0.023004 )
							if( vrsi <= 81.8865 )
								if( BBupper <= 61.0621 )
									ret := -0.143453
								if( BBupper > 61.0621 )
									ret := 0.122610
							if( vrsi > 81.8865 )
								if( dif_source_BBlower <= 0.198802 )
									ret := -0.009174
								if( dif_source_BBlower > 0.198802 )
									ret := -0.333005
				if( BBlower > 60.3844 )
					ret := -0.869565 // sell
		if( BBlower > 60.3865 )
			if( dif_source_BBlower <= 0.221645 )
				if( BBupper <= 64.6501 )
					if( crossover_rsi_bblowerInt <= 0.5 )
						if( BBlower <= 62.8728 )
							if( dif_source_BBlower <= -0.254632 )
								ret := -0.941176 // sell
							if( dif_source_BBlower > -0.254632 )
								if( dif_source_BBupper <= -0.276934 )
									ret := 0.102914
								if( dif_source_BBupper > -0.276934 )
									ret := -0.442529
						if( BBlower > 62.8728 )
							if( dif_source_BBupper <= -0.377186 )
								if( BBupper <= 64.2757 )
									ret := 0.485849
								if( BBupper > 64.2757 )
									ret := 0.143411
							if( dif_source_BBupper > -0.377186 )
								if( BBlower <= 64.3469 )
									ret := 0.080899
								if( BBlower > 64.3469 )
									ret := 0.564103
					if( crossover_rsi_bblowerInt > 0.5 )
						ret := 0.111111
				if( BBupper > 64.6501 )
					if( BBlower <= 64.1621 )
						ret := -0.230252
					if( BBlower > 64.1621 )
						if( BBupper <= 72.3034 )
							if( dif_source_BBupper <= -1.11346 )
								if( BBupper <= 70.4979 )
									ret := -0.408304
								if( BBupper > 70.4979 )
									ret := 0.296296
							if( dif_source_BBupper > -1.11346 )
								if( BBupper <= 69.2496 )
									ret := 0.110016
								if( BBupper > 69.2496 )
									ret := 0.345070
						if( BBupper > 72.3034 )
							if( dif_source_BBlower <= -0.307032 )
								if( BBlower <= 71.2954 )
									ret := -1.000000 // sell
								if( BBlower > 71.2954 )
									ret := -0.384615
							if( dif_source_BBlower > -0.307032 )
								if( BBupper <= 72.4412 )
									ret := -0.364865
								if( BBupper > 72.4412 )
									ret := 0.008537
			if( dif_source_BBlower > 0.221645 )
				if( dif_source_BBlower <= 2.75089 )
					if( vrsi <= 68.8881 )
						if( dif_source_BBlower <= 0.724288 )
							if( BBupper <= 72.8949 )
								if( BBlower <= 71.4481 )
									ret := -0.076573
								if( BBlower > 71.4481 )
									ret := -0.368644
							if( BBupper > 72.8949 )
								if( BBupper <= 73.9785 )
									ret := 0.187377
								if( BBupper > 73.9785 )
									ret := 0.005612
						if( dif_source_BBlower > 0.724288 )
							if( BBlower <= 77.3883 )
								if( BBupper <= 74.135 )
									ret := 0.020072
								if( BBupper > 74.135 )
									ret := 0.145025
							if( BBlower > 77.3883 )
								if( BBupper <= 79.5325 )
									ret := -0.683333
								if( BBupper > 79.5325 )
									ret := -0.163077
					if( vrsi > 68.8881 )
						if( BBlower <= 60.5424 )
							if( vrsi <= 77.5047 )
								if( dif_source_BBupper <= 0.00746 )
									ret := -0.115385
								if( dif_source_BBupper > 0.00746 )
									ret := 0.700000 // buy
							if( vrsi > 77.5047 )
								if( vrsi <= 92.2745 )
									ret := 0.474820
								if( vrsi > 92.2745 )
									ret := 0.000000
						if( BBlower > 60.5424 )
							if( dif_source_BBupper <= -0.012463 )
								if( BBlower <= 65.6039 )
									ret := -0.135368
								if( BBlower > 65.6039 )
									ret := -0.020032
							if( dif_source_BBupper > -0.012463 )
								if( BBlower <= 71.3773 )
									ret := -0.130859
								if( BBlower > 71.3773 )
									ret := -0.317102
				if( dif_source_BBlower > 2.75089 )
					if( dif_source_BBupper <= 0.579701 )
						if( dif_source_BBupper <= -0.253972 )
							if( vrsi <= 55.1703 )
								if( vrsi <= 53.7202 )
									ret := -0.276596
								if( vrsi > 53.7202 )
									ret := 1.000000 // buy
							if( vrsi > 55.1703 )
								if( vrsi <= 58.9647 )
									ret := -0.750000 // sell
								if( vrsi > 58.9647 )
									ret := -0.031915
						if( dif_source_BBupper > -0.253972 )
							if( BBlower <= 73.7928 )
								if( BBlower <= 61.9269 )
									ret := -0.464286
								if( BBlower > 61.9269 )
									ret := -0.914634 // sell
							if( BBlower > 73.7928 )
								if( BBlower <= 76.6801 )
									ret := -0.228070
								if( BBlower > 76.6801 )
									ret := -0.750000 // sell
					if( dif_source_BBupper > 0.579701 )
						if( BBlower <= 65.8018 )
							ret := -0.941176 // sell
						if( BBlower > 65.8018 )
							if( BBlower <= 68.6477 )
								if( dif_source_BBupper <= 1.62476 )
									ret := 0.368421
								if( dif_source_BBupper > 1.62476 )
									ret := -0.583333
							if( BBlower > 68.6477 )
								ret := 0.583333
	
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
float op_operation = decision_tree_0_PYPL_1Min_d7a2eb33(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


