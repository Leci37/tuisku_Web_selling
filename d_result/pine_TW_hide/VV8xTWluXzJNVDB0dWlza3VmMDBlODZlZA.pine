//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: U_1Min_2MT0_f00e86ed Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2MT0_f00e86ed", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_f00e86ed(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow_Sum <= 45894.2 )
		if( ema2 <= 16.6526 )
			if( tema <= 14.1817 )
				if( ema1 <= 13.9052 )
					if( MFI <= 15.7857 )
						ret := 0.083333
					if( MFI > 15.7857 )
						ret := 0.842105 // buy
				if( ema1 > 13.9052 )
					if( Typical_Price <= 14.14 )
						ret := 1.000000 // buy
					if( Typical_Price > 14.14 )
						ret := 0.666667
			if( tema > 14.1817 )
				if( ema12 <= -0.001161 )
					if( Negative_Money_Flow_Sum <= 25580.4 )
						if( Negative_Money_Flow_Sum <= 12265 )
							ret := 0.461538
						if( Negative_Money_Flow_Sum > 12265 )
							if( Positive_Money_Flow_Sum <= 27314.9 )
								if( ema13 <= -0.006102 )
									ret := -0.970588 // sell
								if( ema13 > -0.006102 )
									ret := -0.625000
							if( Positive_Money_Flow_Sum > 27314.9 )
								ret := 0.166667
					if( Negative_Money_Flow_Sum > 25580.4 )
						if( Money_Flow_Ratio <= 0.012944 )
							if( ema1 <= 16.1452 )
								ret := 0.000000
							if( ema1 > 16.1452 )
								if( MFI_High <= -79.8996 )
									ret := -0.650000
								if( MFI_High > -79.8996 )
									ret := -0.909091 // sell
						if( Money_Flow_Ratio > 0.012944 )
							if( Positive_Money_Flow_Sum <= 26957.8 )
								if( Negative_Money_Flow <= 53.5695 )
									ret := 0.197279
								if( Negative_Money_Flow > 53.5695 )
									ret := 0.658291
							if( Positive_Money_Flow_Sum > 26957.8 )
								if( Negative_Money_Flow_Sum <= 48422.9 )
									ret := 0.705882 // buy
								if( Negative_Money_Flow_Sum > 48422.9 )
									ret := 0.022329
				if( ema12 > -0.001161 )
					if( ema13 <= 0.025329 )
						if( MFI_High <= -62.7325 )
							if( Negative_Money_Flow_Sum <= 244523 )
								if( Negative_Money_Flow_Sum <= 93650.4 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 93650.4 )
									ret := 0.224490
							if( Negative_Money_Flow_Sum > 244523 )
								if( tema <= 15.2285 )
									ret := -0.444444
								if( tema > 15.2285 )
									ret := -0.129032
						if( MFI_High > -62.7325 )
							if( MFI_High <= -27.2906 )
								if( Money_Flow_Ratio <= 1.01155 )
									ret := -0.346895
								if( Money_Flow_Ratio > 1.01155 )
									ret := -0.906250 // sell
							if( MFI_High > -27.2906 )
								if( Positive_Money_Flow <= 1592.79 )
									ret := 0.125000
								if( Positive_Money_Flow > 1592.79 )
									ret := -0.555556
					if( ema13 > 0.025329 )
						if( MFI_Low <= 49.7994 )
							if( Typical_Price <= 15.5436 )
								ret := -0.230769
							if( Typical_Price > 15.5436 )
								if( Money_Flow_Ratio <= 0.427139 )
									ret := 0.055556
								if( Money_Flow_Ratio > 0.427139 )
									ret := 0.641791
						if( MFI_Low > 49.7994 )
							if( Raw_Money_Flow <= 12456.9 )
								ret := -0.700000 // sell
							if( Raw_Money_Flow > 12456.9 )
								ret := -1.000000 // sell
		if( ema2 > 16.6526 )
			if( ema13 <= 0.012079 )
				if( Negative_Money_Flow <= 166469 )
					if( Positive_Money_Flow <= 2140.71 )
						if( Positive_Money_Flow <= 2021 )
							if( ema12 <= -0.006151 )
								if( Money_Flow_Ratio <= 0.054316 )
									ret := 0.121951
								if( Money_Flow_Ratio > 0.054316 )
									ret := 0.503817
							if( ema12 > -0.006151 )
								if( Negative_Money_Flow_Sum <= 106748 )
									ret := 0.381132
								if( Negative_Money_Flow_Sum > 106748 )
									ret := 0.067265
						if( Positive_Money_Flow > 2021 )
							if( ema3 <= 20.5359 )
								if( ema13 <= -0.003627 )
									ret := 0.769231 // buy
								if( ema13 > -0.003627 )
									ret := 0.882353 // buy
							if( ema3 > 20.5359 )
								ret := 0.600000
					if( Positive_Money_Flow > 2140.71 )
						if( MFI <= 1.16233 )
							ret := 0.800000 // buy
						if( MFI > 1.16233 )
							if( MFI_High <= -39.0712 )
								if( ema3 <= 20.7018 )
									ret := -0.086826
								if( ema3 > 20.7018 )
									ret := 0.245161
							if( MFI_High > -39.0712 )
								if( ema1 <= 19.0306 )
									ret := 0.475000
								if( ema1 > 19.0306 )
									ret := 0.000000
				if( Negative_Money_Flow > 166469 )
					if( Negative_Money_Flow_Sum <= 6.82822e+06 )
						if( MFI_Low <= -19.0399 )
							if( Typical_Price <= 17.5928 )
								ret := -0.615385
							if( Typical_Price > 17.5928 )
								ret := -0.866667 // sell
						if( MFI_Low > -19.0399 )
							if( ema2 <= 19.3147 )
								ret := -0.333333
							if( ema2 > 19.3147 )
								ret := 0.333333
					if( Negative_Money_Flow_Sum > 6.82822e+06 )
						ret := 0.120000
			if( ema13 > 0.012079 )
				if( Positive_Money_Flow <= 589.069 )
					if( MFI_High <= -39.0467 )
						if( Negative_Money_Flow <= 627.405 )
							if( MFI_High <= -47.5631 )
								if( tema <= 18.0323 )
									ret := 1.000000 // buy
								if( tema > 18.0323 )
									ret := 0.428571
							if( MFI_High > -47.5631 )
								ret := -0.153846
						if( Negative_Money_Flow > 627.405 )
							if( Money_Flow_Ratio <= 0.123149 )
								ret := 0.375000
							if( Money_Flow_Ratio > 0.123149 )
								if( Negative_Money_Flow_Sum <= 59566.1 )
									ret := 0.272727
								if( Negative_Money_Flow_Sum > 59566.1 )
									ret := -0.471698
					if( MFI_High > -39.0467 )
						if( ema3 <= 19.8816 )
							if( ema1 <= 17.5929 )
								if( Typical_Price <= 17.1492 )
									ret := 0.666667
								if( Typical_Price > 17.1492 )
									ret := 0.250000
							if( ema1 > 17.5929 )
								if( MFI <= 58.3803 )
									ret := -0.625000
								if( MFI > 58.3803 )
									ret := 0.200000
						if( ema3 > 19.8816 )
							if( Typical_Price <= 22.1144 )
								ret := 1.000000 // buy
							if( Typical_Price > 22.1144 )
								ret := 0.555556
				if( Positive_Money_Flow > 589.069 )
					if( Typical_Price <= 22.2342 )
						if( MFI_Low <= 41.8516 )
							if( Negative_Money_Flow_Sum <= 26958.9 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 26958.9 )
								if( MFI_Low <= 33.141 )
									ret := -0.415730
								if( MFI_Low > 33.141 )
									ret := 0.461538
						if( MFI_Low > 41.8516 )
							if( MFI_Low <= 48.9467 )
								ret := 0.466667
							if( MFI_Low > 48.9467 )
								ret := -0.571429
					if( Typical_Price > 22.2342 )
						ret := 0.470588
	if( Positive_Money_Flow_Sum > 45894.2 )
		if( ema12 <= -0.020046 )
			if( tema <= 15.7513 )
				if( MFI_High <= -4.49416 )
					if( Negative_Money_Flow_Sum <= 2.24547e+06 )
						if( Positive_Money_Flow_Sum <= 102127 )
							if( ema12 <= -0.074168 )
								ret := 1.000000 // buy
							if( ema12 > -0.074168 )
								if( ema1 <= 15.6134 )
									ret := 0.384615
								if( ema1 > 15.6134 )
									ret := -0.384615
						if( Positive_Money_Flow_Sum > 102127 )
							if( tema <= 13.2946 )
								ret := 1.000000 // buy
							if( tema > 13.2946 )
								if( MFI <= 11.4455 )
									ret := 0.923077 // buy
								if( MFI > 11.4455 )
									ret := -0.048780
					if( Negative_Money_Flow_Sum > 2.24547e+06 )
						if( Typical_Price <= 14.0846 )
							if( Positive_Money_Flow <= 86.3838 )
								if( Raw_Money_Flow <= 292097 )
									ret := -0.461538
								if( Raw_Money_Flow > 292097 )
									ret := 0.875000 // buy
							if( Positive_Money_Flow > 86.3838 )
								if( ema3 <= 14.1437 )
									ret := -0.111111
								if( ema3 > 14.1437 )
									ret := -0.878788 // sell
						if( Typical_Price > 14.0846 )
							if( tema <= 15.4454 )
								if( MFI_High <= -51.813 )
									ret := 0.305556
								if( MFI_High > -51.813 )
									ret := 0.618357
							if( tema > 15.4454 )
								if( MFI_Low <= 6.42692 )
									ret := 0.386503
								if( MFI_Low > 6.42692 )
									ret := -0.079710
				if( MFI_High > -4.49416 )
					if( ema12 <= -0.05964 )
						ret := 1.000000 // buy
					if( ema12 > -0.05964 )
						ret := 0.571429
			if( tema > 15.7513 )
				if( ema3 <= 18.4883 )
					if( Positive_Money_Flow_Sum <= 912462 )
						if( Money_Flow_Ratio <= 2.63624 )
							if( Positive_Money_Flow_Sum <= 64699.8 )
								if( ema12 <= -0.022565 )
									ret := -0.350575
								if( ema12 > -0.022565 )
									ret := 0.410256
							if( Positive_Money_Flow_Sum > 64699.8 )
								if( ema13 <= -0.123506 )
									ret := 0.684211
								if( ema13 > -0.123506 )
									ret := 0.144751
						if( Money_Flow_Ratio > 2.63624 )
							if( Money_Flow_Ratio <= 3.40101 )
								if( MFI <= 75.6579 )
									ret := -0.818182 // sell
								if( MFI > 75.6579 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 3.40101 )
								ret := -0.142857
					if( Positive_Money_Flow_Sum > 912462 )
						if( ema2 <= 16.0917 )
							if( Negative_Money_Flow_Sum <= 1.62888e+07 )
								if( Raw_Money_Flow <= 412683 )
									ret := -0.550000
								if( Raw_Money_Flow > 412683 )
									ret := -0.054422
							if( Negative_Money_Flow_Sum > 1.62888e+07 )
								ret := 0.642857
						if( ema2 > 16.0917 )
							if( Positive_Money_Flow_Sum <= 3.92925e+06 )
								if( Negative_Money_Flow <= 1.07885e+06 )
									ret := -0.137661
								if( Negative_Money_Flow > 1.07885e+06 )
									ret := 0.270588
							if( Positive_Money_Flow_Sum > 3.92925e+06 )
								if( ema2 <= 17.0126 )
									ret := 0.504854
								if( ema2 > 17.0126 )
									ret := 0.026596
				if( ema3 > 18.4883 )
					if( Negative_Money_Flow_Sum <= 331670 )
						if( Positive_Money_Flow_Sum <= 1.2604e+06 )
							if( MFI_High <= -5.20989 )
								if( Negative_Money_Flow <= 22285.6 )
									ret := 0.235105
								if( Negative_Money_Flow > 22285.6 )
									ret := 0.633721
							if( MFI_High > -5.20989 )
								if( Raw_Money_Flow <= 11672.1 )
									ret := -0.928571 // sell
								if( Raw_Money_Flow > 11672.1 )
									ret := -0.454545
						if( Positive_Money_Flow_Sum > 1.2604e+06 )
							if( tema <= 25.3038 )
								if( Typical_Price <= 24.7206 )
									ret := 0.800000 // buy
								if( Typical_Price > 24.7206 )
									ret := 1.000000 // buy
							if( tema > 25.3038 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 331670 )
						if( MFI_Low <= -14.6119 )
							if( MFI_Low <= -19.1807 )
								if( Negative_Money_Flow <= 1.05533e+06 )
									ret := 0.461538
								if( Negative_Money_Flow > 1.05533e+06 )
									ret := 1.000000 // buy
							if( MFI_Low > -19.1807 )
								if( ema2 <= 21.8851 )
									ret := -0.081871
								if( ema2 > 21.8851 )
									ret := -0.633333
						if( MFI_Low > -14.6119 )
							if( MFI_Low <= -8.82811 )
								if( Positive_Money_Flow_Sum <= 528283 )
									ret := 0.168889
								if( Positive_Money_Flow_Sum > 528283 )
									ret := 0.485915
							if( MFI_Low > -8.82811 )
								if( Positive_Money_Flow_Sum <= 1.62636e+06 )
									ret := -0.025708
								if( Positive_Money_Flow_Sum > 1.62636e+06 )
									ret := 0.113717
		if( ema12 > -0.020046 )
			if( Negative_Money_Flow_Sum <= 207565 )
				if( Positive_Money_Flow <= 1.48321 )
					if( MFI <= 43.8301 )
						if( MFI_Low <= 15.9481 )
							if( ema12 <= -0.011389 )
								if( MFI <= 22.6559 )
									ret := -0.200000
								if( MFI > 22.6559 )
									ret := 0.627737
							if( ema12 > -0.011389 )
								if( Negative_Money_Flow <= 46704.5 )
									ret := -0.028226
								if( Negative_Money_Flow > 46704.5 )
									ret := 0.514851
						if( MFI_Low > 15.9481 )
							if( Negative_Money_Flow <= 4177.17 )
								if( MFI_High <= -41.6553 )
									ret := -0.351351
								if( MFI_High > -41.6553 )
									ret := 0.248927
							if( Negative_Money_Flow > 4177.17 )
								if( ema2 <= 15.4614 )
									ret := -0.769231 // sell
								if( ema2 > 15.4614 )
									ret := -0.162528
					if( MFI > 43.8301 )
						if( Negative_Money_Flow <= 1416.17 )
							if( ema12 <= 0.018541 )
								if( MFI_High <= 4.43212 )
									ret := 0.097110
								if( MFI_High > 4.43212 )
									ret := -0.220339
							if( ema12 > 0.018541 )
								if( Positive_Money_Flow_Sum <= 325785 )
									ret := -0.276316
								if( Positive_Money_Flow_Sum > 325785 )
									ret := 0.421053
						if( Negative_Money_Flow > 1416.17 )
							if( Negative_Money_Flow_Sum <= 28066.8 )
								if( Raw_Money_Flow <= 4871.5 )
									ret := 0.270833
								if( Raw_Money_Flow > 4871.5 )
									ret := 0.681319
							if( Negative_Money_Flow_Sum > 28066.8 )
								if( ema12 <= 0.001299 )
									ret := 0.294310
								if( ema12 > 0.001299 )
									ret := 0.110807
				if( Positive_Money_Flow > 1.48321 )
					if( ema12 <= 0.005839 )
						if( Negative_Money_Flow_Sum <= 58282.4 )
							if( Positive_Money_Flow_Sum <= 101937 )
								if( Positive_Money_Flow_Sum <= 50067.5 )
									ret := 0.625000
								if( Positive_Money_Flow_Sum > 50067.5 )
									ret := -0.102190
							if( Positive_Money_Flow_Sum > 101937 )
								if( Raw_Money_Flow <= 18442.3 )
									ret := 0.394822
								if( Raw_Money_Flow > 18442.3 )
									ret := -0.069444
						if( Negative_Money_Flow_Sum > 58282.4 )
							if( Negative_Money_Flow <= 33.074 )
								if( Positive_Money_Flow <= 41343.4 )
									ret := -0.272458
								if( Positive_Money_Flow > 41343.4 )
									ret := -0.011364
							if( Negative_Money_Flow > 33.074 )
								if( Positive_Money_Flow_Sum <= 317525 )
									ret := 0.113821
								if( Positive_Money_Flow_Sum > 317525 )
									ret := -0.482759
					if( ema12 > 0.005839 )
						if( MFI_High <= 5.34514 )
							if( Negative_Money_Flow <= 9.31127 )
								if( tema <= 20.0511 )
									ret := -0.501663
								if( tema > 20.0511 )
									ret := -0.371037
							if( Negative_Money_Flow > 9.31127 )
								if( ema12 <= 0.025117 )
									ret := -0.218884
								if( ema12 > 0.025117 )
									ret := 0.191489
						if( MFI_High > 5.34514 )
							if( Typical_Price <= 17.9486 )
								if( MFI_High <= 15.0097 )
									ret := -0.130178
								if( MFI_High > 15.0097 )
									ret := 0.201183
							if( Typical_Price > 17.9486 )
								if( ema3 <= 20.8436 )
									ret := -0.598174
								if( ema3 > 20.8436 )
									ret := -0.097656
			if( Negative_Money_Flow_Sum > 207565 )
				if( Money_Flow_Ratio <= 0.882488 )
					if( Typical_Price <= 13.6184 )
						if( MFI <= 28.2546 )
							ret := -0.111111
						if( MFI > 28.2546 )
							ret := 1.000000 // buy
					if( Typical_Price > 13.6184 )
						if( Money_Flow_Ratio <= 0.038008 )
							if( ema3 <= 15.8953 )
								if( Raw_Money_Flow <= 324106 )
									ret := 0.611111
								if( Raw_Money_Flow > 324106 )
									ret := 1.000000 // buy
							if( ema3 > 15.8953 )
								if( Negative_Money_Flow <= 2.11198e+06 )
									ret := 0.207469
								if( Negative_Money_Flow > 2.11198e+06 )
									ret := -0.590909
						if( Money_Flow_Ratio > 0.038008 )
							if( Negative_Money_Flow_Sum <= 1.89656e+06 )
								if( ema2 <= 19.8957 )
									ret := 0.056883
								if( ema2 > 19.8957 )
									ret := -0.125388
							if( Negative_Money_Flow_Sum > 1.89656e+06 )
								if( Raw_Money_Flow <= 353549 )
									ret := -0.145443
								if( Raw_Money_Flow > 353549 )
									ret := -0.031515
				if( Money_Flow_Ratio > 0.882488 )
					if( Negative_Money_Flow_Sum <= 1.51668e+07 )
						if( Positive_Money_Flow <= 9.84499e+06 )
							if( Negative_Money_Flow_Sum <= 5.46377e+06 )
								if( Positive_Money_Flow_Sum <= 508051 )
									ret := 0.234925
								if( Positive_Money_Flow_Sum > 508051 )
									ret := 0.000115
							if( Negative_Money_Flow_Sum > 5.46377e+06 )
								if( ema13 <= 0.154953 )
									ret := 0.076083
								if( ema13 > 0.154953 )
									ret := 0.518519
						if( Positive_Money_Flow > 9.84499e+06 )
							if( Typical_Price <= 17.2211 )
								ret := -0.437500
							if( Typical_Price > 17.2211 )
								if( Raw_Money_Flow <= 1.42453e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.42453e+07 )
									ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 1.51668e+07 )
						if( Raw_Money_Flow <= 2.56273e+06 )
							if( MFI <= 59.0665 )
								if( Negative_Money_Flow <= 160031 )
									ret := 0.192308
								if( Negative_Money_Flow > 160031 )
									ret := -1.000000 // sell
							if( MFI > 59.0665 )
								if( Money_Flow_Ratio <= 2.55957 )
									ret := 0.409836
								if( Money_Flow_Ratio > 2.55957 )
									ret := -0.523810
						if( Raw_Money_Flow > 2.56273e+06 )
							if( Typical_Price <= 21.494 )
								if( ema2 <= 18.0966 )
									ret := -0.932203 // sell
								if( ema2 > 18.0966 )
									ret := -0.585714
							if( Typical_Price > 21.494 )
								if( ema13 <= 0.164476 )
									ret := 0.666667
								if( ema13 > 0.164476 )
									ret := -0.454545
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_U_1Min_f00e86ed(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)

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


