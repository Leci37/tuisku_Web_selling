//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: UNIUSDT_15Min_1SMA_7c994018 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_1SMA_7c994018", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_7c994018(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Premium_Zone <= 6.51478 )
		if( Premium_Zone <= 6.29512 )
			if( atr <= 0.396479 )
				if( atr <= 0.381029 )
					if( atr <= 0.315123 )
						if( Internal_Swing_High <= 5.24627 )
							if( Premium_Zone <= 4.1785 )
								if( atr <= 0.1965 )
									ret := 0.209440
								if( atr > 0.1965 )
									ret := -0.129032
							if( Premium_Zone > 4.1785 )
								if( Premium_Zone <= 4.2141 )
									ret := -0.190083
								if( Premium_Zone > 4.2141 )
									ret := 0.004181
						if( Internal_Swing_High > 5.24627 )
							if( Swing_High <= 5.40876 )
								if( Internal_Swing_High <= 6.05917 )
									ret := 0.150457
								if( Internal_Swing_High > 6.05917 )
									ret := -0.096000
							if( Swing_High > 5.40876 )
								if( Discount_Zone <= 5.259 )
									ret := -0.368421
								if( Discount_Zone > 5.259 )
									ret := 0.065934
					if( atr > 0.315123 )
						if( Internal_Swing_Low <= 5.83118 )
							if( atr <= 0.317511 )
								if( atr <= 0.315787 )
									ret := 1.000000 // buy
								if( atr > 0.315787 )
									ret := 0.350000
							if( atr > 0.317511 )
								if( Swing_Low <= 3.85526 )
									ret := 0.054237
								if( Swing_Low > 3.85526 )
									ret := 0.295455
						if( Internal_Swing_Low > 5.83118 )
							if( Internal_Swing_Low <= 5.9318 )
								if( Premium_Zone <= 6.29043 )
									ret := 0.607477
								if( Premium_Zone > 6.29043 )
									ret := 0.000000
							if( Internal_Swing_Low > 5.9318 )
								if( Premium_Zone <= 6.28188 )
									ret := -0.018182
								if( Premium_Zone > 6.28188 )
									ret := 0.300000
				if( atr > 0.381029 )
					if( Premium_Zone <= 4.73989 )
						if( Premium_Zone <= 4.72225 )
							if( Order_Block_Low <= 2.05585 )
								if( Premium_Zone <= 4.69808 )
									ret := 0.000000
								if( Premium_Zone > 4.69808 )
									ret := -0.400000
							if( Order_Block_Low > 2.05585 )
								ret := 0.500000
						if( Premium_Zone > 4.72225 )
							ret := 1.000000 // buy
					if( Premium_Zone > 4.73989 )
						if( Premium_Zone <= 4.76754 )
							if( Internal_Swing_High <= 4.343 )
								if( Internal_Swing_Low <= 4.404 )
									ret := -0.329268
								if( Internal_Swing_Low > 4.404 )
									ret := 0.200000
							if( Internal_Swing_High > 4.343 )
								if( atr <= 0.393033 )
									ret := -0.571429
								if( atr > 0.393033 )
									ret := -0.888889 // sell
						if( Premium_Zone > 4.76754 )
							if( Premium_Zone <= 5.55313 )
								if( Equilibrium_Zone <= 4.4605 )
									ret := 0.444444
								if( Equilibrium_Zone > 4.4605 )
									ret := 0.083969
							if( Premium_Zone > 5.55313 )
								if( Swing_High <= 5.42464 )
									ret := -0.253731
								if( Swing_High > 5.42464 )
									ret := 0.333333
			if( atr > 0.396479 )
				if( Discount_Zone <= 2.96027 )
					if( Equilibrium_Zone <= 3.60987 )
						if( Discount_Zone <= 2.51933 )
							ret := -0.200000
						if( Discount_Zone > 2.51933 )
							if( Discount_Zone <= 2.5503 )
								ret := 0.875000 // buy
							if( Discount_Zone > 2.5503 )
								ret := 1.000000 // buy
					if( Equilibrium_Zone > 3.60987 )
						if( Internal_Swing_High <= 3.74151 )
							if( atr <= 1.02982 )
								if( Internal_Swing_Low <= 3.44448 )
									ret := -0.052083
								if( Internal_Swing_Low > 3.44448 )
									ret := 0.432692
							if( atr > 1.02982 )
								if( Internal_Swing_Low <= 3.465 )
									ret := -0.552239
								if( Internal_Swing_Low > 3.465 )
									ret := -0.169811
						if( Internal_Swing_High > 3.74151 )
							if( Premium_Zone <= 4.64041 )
								if( Internal_Swing_High <= 4.245 )
									ret := -0.786667 // sell
								if( Internal_Swing_High > 4.245 )
									ret := 0.500000
							if( Premium_Zone > 4.64041 )
								if( atr <= 0.969086 )
									ret := 0.478261
								if( atr > 0.969086 )
									ret := -0.580247
				if( Discount_Zone > 2.96027 )
					if( atr <= 1.14979 )
						if( Premium_Zone <= 5.80653 )
							if( Internal_Swing_Low <= 4.53771 )
								if( atr <= 1.04703 )
									ret := 0.131243
								if( atr > 1.04703 )
									ret := 0.653659
							if( Internal_Swing_Low > 4.53771 )
								if( Internal_Swing_Low <= 5.46845 )
									ret := 0.383838
								if( Internal_Swing_Low > 5.46845 )
									ret := -0.482759
						if( Premium_Zone > 5.80653 )
							if( Premium_Zone <= 6.14974 )
								if( Swing_Low <= 5.01429 )
									ret := 0.129032
								if( Swing_Low > 5.01429 )
									ret := -0.316667
							if( Premium_Zone > 6.14974 )
								if( Internal_Swing_High <= 5.43649 )
									ret := -0.047452
								if( Internal_Swing_High > 5.43649 )
									ret := 0.158672
					if( atr > 1.14979 )
						if( Equilibrium_Zone <= 4.49492 )
							if( Internal_Swing_Low <= 4.91972 )
								if( Discount_Zone <= 3.14678 )
									ret := -0.411348
								if( Discount_Zone > 3.14678 )
									ret := 0.937500 // buy
							if( Internal_Swing_Low > 4.91972 )
								if( Internal_Swing_Low <= 4.99822 )
									ret := 1.000000 // buy
								if( Internal_Swing_Low > 4.99822 )
									ret := 0.666667
						if( Equilibrium_Zone > 4.49492 )
							if( Internal_Swing_Low <= 5.54829 )
								if( Premium_Zone <= 5.72439 )
									ret := 0.250000
								if( Premium_Zone > 5.72439 )
									ret := -0.666667
							if( Internal_Swing_Low > 5.54829 )
								ret := -1.000000 // sell
		if( Premium_Zone > 6.29512 )
			if( Equilibrium_Zone <= 5.93552 )
				if( Premium_Zone <= 6.48939 )
					if( Order_Block_Low <= 5.8295 )
						if( Internal_Swing_Low <= 2.27 )
							if( Equilibrium_Zone <= 5.6782 )
								if( Equilibrium_Zone <= 5.54954 )
									ret := 0.246667
								if( Equilibrium_Zone > 5.54954 )
									ret := -0.210797
							if( Equilibrium_Zone > 5.6782 )
								if( Discount_Zone <= 5.06987 )
									ret := 0.435115
								if( Discount_Zone > 5.06987 )
									ret := 0.205152
						if( Internal_Swing_Low > 2.27 )
							if( Equilibrium_Zone <= 5.61482 )
								if( Equilibrium_Zone <= 5.52897 )
									ret := 0.630435
								if( Equilibrium_Zone > 5.52897 )
									ret := -0.125828
							if( Equilibrium_Zone > 5.61482 )
								if( Discount_Zone <= 5.49539 )
									ret := 0.493625
								if( Discount_Zone > 5.49539 )
									ret := -0.307692
					if( Order_Block_Low > 5.8295 )
						if( Internal_Swing_High <= 6.03219 )
							if( Order_Block_High <= 5.97453 )
								if( Discount_Zone <= 5.08123 )
									ret := 0.750000 // buy
								if( Discount_Zone > 5.08123 )
									ret := -0.714286 // sell
							if( Order_Block_High > 5.97453 )
								if( Equilibrium_Zone <= 5.75493 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 5.75493 )
									ret := 0.666667
						if( Internal_Swing_High > 6.03219 )
							if( atr <= 0.604 )
								if( FVG_UpInt <= 0.5 )
									ret := -0.750000 // sell
								if( FVG_UpInt > 0.5 )
									ret := 0.200000
							if( atr > 0.604 )
								if( atr <= 0.692589 )
									ret := -1.000000 // sell
								if( atr > 0.692589 )
									ret := -0.625000
				if( Premium_Zone > 6.48939 )
					if( Swing_High <= 5.7945 )
						if( Equilibrium_Zone <= 5.805 )
							if( Internal_Swing_Low <= 5.985 )
								if( Discount_Zone <= 5.04251 )
									ret := 0.721519 // buy
								if( Discount_Zone > 5.04251 )
									ret := 0.957447 // buy
							if( Internal_Swing_Low > 5.985 )
								ret := 0.000000
						if( Equilibrium_Zone > 5.805 )
							if( Internal_Swing_Low <= 2.84 )
								if( Premium_Zone <= 6.50917 )
									ret := 0.227273
								if( Premium_Zone > 6.50917 )
									ret := -0.750000 // sell
							if( Internal_Swing_Low > 2.84 )
								if( Discount_Zone <= 5.26881 )
									ret := 0.250000
								if( Discount_Zone > 5.26881 )
									ret := 0.954545 // buy
					if( Swing_High > 5.7945 )
						if( Swing_High <= 5.9877 )
							if( Equilibrium_Zone <= 5.74649 )
								ret := -0.250000
							if( Equilibrium_Zone > 5.74649 )
								ret := -1.000000 // sell
						if( Swing_High > 5.9877 )
							if( Internal_Swing_High <= 6.08878 )
								ret := 1.000000 // buy
							if( Internal_Swing_High > 6.08878 )
								ret := 0.200000
			if( Equilibrium_Zone > 5.93552 )
				if( Premium_Zone <= 6.30458 )
					if( Discount_Zone <= 5.8106 )
						if( Internal_Swing_High <= 5.892 )
							if( Premium_Zone <= 6.29575 )
								ret := 0.500000
							if( Premium_Zone > 6.29575 )
								if( Premium_Zone <= 6.29685 )
									ret := -0.333333
								if( Premium_Zone > 6.29685 )
									ret := 0.014706
						if( Internal_Swing_High > 5.892 )
							if( Equilibrium_Zone <= 6.03179 )
								if( Equilibrium_Zone <= 5.99495 )
									ret := -0.500000
								if( Equilibrium_Zone > 5.99495 )
									ret := -0.500000
							if( Equilibrium_Zone > 6.03179 )
								ret := 0.125000
					if( Discount_Zone > 5.8106 )
						if( Equilibrium_Zone <= 6.05904 )
							if( atr <= 0.2425 )
								if( Internal_Swing_Low <= 2.9875 )
									ret := 0.157895
								if( Internal_Swing_Low > 2.9875 )
									ret := 0.000000
							if( atr > 0.2425 )
								if( Swing_High <= 3.0875 )
									ret := 1.000000 // buy
								if( Swing_High > 3.0875 )
									ret := 0.000000
						if( Equilibrium_Zone > 6.05904 )
							if( Internal_Swing_High <= 6.155 )
								if( Equilibrium_Zone <= 6.06044 )
									ret := 0.937500 // buy
								if( Equilibrium_Zone > 6.06044 )
									ret := 0.400000
							if( Internal_Swing_High > 6.155 )
								if( Swing_High <= 3.0935 )
									ret := 1.000000 // buy
								if( Swing_High > 3.0935 )
									ret := 0.142857
				if( Premium_Zone > 6.30458 )
					if( Discount_Zone <= 5.80191 )
						if( Internal_Swing_High <= 6.01754 )
							if( Equilibrium_Zone <= 6.1406 )
								if( Swing_Low <= 5.93533 )
									ret := 0.056977
								if( Swing_Low > 5.93533 )
									ret := 0.680000
							if( Equilibrium_Zone > 6.1406 )
								if( Equilibrium_Zone <= 6.14417 )
									ret := 0.650000
								if( Equilibrium_Zone > 6.14417 )
									ret := 0.215385
						if( Internal_Swing_High > 6.01754 )
							if( Swing_High <= 6.219 )
								if( atr <= 0.3155 )
									ret := 0.014286
								if( atr > 0.3155 )
									ret := 0.331915
							if( Swing_High > 6.219 )
								if( Equilibrium_Zone <= 6.1065 )
									ret := -0.298507
								if( Equilibrium_Zone > 6.1065 )
									ret := 0.512821
					if( Discount_Zone > 5.80191 )
						if( atr <= 0.286289 )
							if( Swing_Low <= 6.1015 )
								if( Swing_High <= 6.25817 )
									ret := -0.098848
								if( Swing_High > 6.25817 )
									ret := 0.428571
							if( Swing_Low > 6.1015 )
								if( atr <= 0.237 )
									ret := 0.076923
								if( atr > 0.237 )
									ret := 0.900000 // buy
						if( atr > 0.286289 )
							if( Discount_Zone <= 5.80305 )
								if( Discount_Zone <= 5.80204 )
									ret := 0.000000
								if( Discount_Zone > 5.80204 )
									ret := -0.640000
							if( Discount_Zone > 5.80305 )
								if( FVG_DownInt <= 0.5 )
									ret := 0.104418
								if( FVG_DownInt > 0.5 )
									ret := 0.684211
	if( Premium_Zone > 6.51478 )
		if( Swing_Low <= 8.22645 )
			if( Discount_Zone <= 3.80409 )
				if( Equilibrium_Zone <= 4.41294 )
					if( Internal_Swing_Low <= 2.31 )
						if( Premium_Zone <= 6.67829 )
							ret := -1.000000 // sell
						if( Premium_Zone > 6.67829 )
							ret := -0.750000 // sell
					if( Internal_Swing_Low > 2.31 )
						ret := -0.166667
				if( Equilibrium_Zone > 4.41294 )
					if( Equilibrium_Zone <= 5.65953 )
						if( Equilibrium_Zone <= 5.24696 )
							if( Internal_Swing_Low <= 4.87369 )
								if( Discount_Zone <= 2.89536 )
									ret := 0.622754
								if( Discount_Zone > 2.89536 )
									ret := 0.260870
							if( Internal_Swing_Low > 4.87369 )
								if( Premium_Zone <= 7.42848 )
									ret := -0.681818
								if( Premium_Zone > 7.42848 )
									ret := 0.850000 // buy
						if( Equilibrium_Zone > 5.24696 )
							if( atr <= 2.27615 )
								if( Discount_Zone <= 3.79234 )
									ret := 0.140000
								if( Discount_Zone > 3.79234 )
									ret := 0.666667
							if( atr > 2.27615 )
								if( atr <= 2.40348 )
									ret := -0.920000 // sell
								if( atr > 2.40348 )
									ret := -0.142857
					if( Equilibrium_Zone > 5.65953 )
						if( atr <= 2.17438 )
							ret := 1.000000 // buy
						if( atr > 2.17438 )
							if( Premium_Zone <= 8.07695 )
								ret := 0.000000
							if( Premium_Zone > 8.07695 )
								if( Internal_Swing_Low <= 2.34891 )
									ret := 0.772727 // buy
								if( Internal_Swing_Low > 2.34891 )
									ret := 1.000000 // buy
			if( Discount_Zone > 3.80409 )
				if( Discount_Zone <= 4.1674 )
					if( Order_Block_High <= 4.90069 )
						if( Premium_Zone <= 7.30533 )
							if( Internal_Swing_High <= 5.3 )
								if( Premium_Zone <= 7.01552 )
									ret := 0.000000
								if( Premium_Zone > 7.01552 )
									ret := 0.474576
							if( Internal_Swing_High > 5.3 )
								if( Equilibrium_Zone <= 5.62681 )
									ret := -0.809524 // sell
								if( Equilibrium_Zone > 5.62681 )
									ret := 0.545455
						if( Premium_Zone > 7.30533 )
							if( Swing_Low <= 2.325 )
								if( Internal_Swing_Low <= 2.355 )
									ret := -0.317919
								if( Internal_Swing_Low > 2.355 )
									ret := -0.825000 // sell
							if( Swing_Low > 2.325 )
								if( Discount_Zone <= 4.0201 )
									ret := 0.428571
								if( Discount_Zone > 4.0201 )
									ret := 1.000000 // buy
					if( Order_Block_High > 4.90069 )
						if( Order_Block_High <= 5.21797 )
							ret := 1.000000 // buy
						if( Order_Block_High > 5.21797 )
							ret := 0.333333
				if( Discount_Zone > 4.1674 )
					if( Equilibrium_Zone <= 5.72476 )
						if( Internal_Swing_High <= 6.19369 )
							if( Premium_Zone <= 7.07747 )
								if( Internal_Swing_Low <= 6.14226 )
									ret := 0.664773
								if( Internal_Swing_Low > 6.14226 )
									ret := -0.333333
							if( Premium_Zone > 7.07747 )
								if( Equilibrium_Zone <= 5.69483 )
									ret := -0.600000
								if( Equilibrium_Zone > 5.69483 )
									ret := 0.250000
						if( Internal_Swing_High > 6.19369 )
							if( Premium_Zone <= 7.03903 )
								if( Discount_Zone <= 4.17175 )
									ret := -0.428571
								if( Discount_Zone > 4.17175 )
									ret := -0.789474 // sell
							if( Premium_Zone > 7.03903 )
								ret := 0.500000
					if( Equilibrium_Zone > 5.72476 )
						if( FVG_DownInt <= 0.5 )
							if( atr <= 1.73774 )
								if( atr <= 1.60477 )
									ret := 0.015533
								if( atr > 1.60477 )
									ret := -0.210769
							if( atr > 1.73774 )
								if( Discount_Zone <= 7.62669 )
									ret := 0.218605
								if( Discount_Zone > 7.62669 )
									ret := 0.011226
						if( FVG_DownInt > 0.5 )
							if( Premium_Zone <= 6.54825 )
								if( Equilibrium_Zone <= 6.02747 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 6.02747 )
									ret := -0.111111
							if( Premium_Zone > 6.54825 )
								if( atr <= 0.31064 )
									ret := -0.228571
								if( atr > 0.31064 )
									ret := 0.294444
		if( Swing_Low > 8.22645 )
			if( Premium_Zone <= 16.0213 )
				if( Swing_Low <= 8.91262 )
					if( atr <= 0.912 )
						if( Equilibrium_Zone <= 9.0819 )
							if( Discount_Zone <= 7.9875 )
								if( Order_Block_High <= 4.18677 )
									ret := 0.428571
								if( Order_Block_High > 4.18677 )
									ret := 1.000000 // buy
							if( Discount_Zone > 7.9875 )
								if( Equilibrium_Zone <= 8.80809 )
									ret := -0.857143 // sell
								if( Equilibrium_Zone > 8.80809 )
									ret := 0.000000
						if( Equilibrium_Zone > 9.0819 )
							if( Premium_Zone <= 9.964 )
								if( Equilibrium_Zone <= 9.22262 )
									ret := 0.833333 // buy
								if( Equilibrium_Zone > 9.22262 )
									ret := 0.500000
							if( Premium_Zone > 9.964 )
								ret := 0.000000
					if( atr > 0.912 )
						if( Internal_Swing_Low <= 8.84353 )
							if( Swing_Low <= 8.815 )
								if( Discount_Zone <= 7.66806 )
									ret := 0.836364 // buy
								if( Discount_Zone > 7.66806 )
									ret := 1.000000 // buy
							if( Swing_Low > 8.815 )
								if( atr <= 2.40376 )
									ret := 0.500000
								if( atr > 2.40376 )
									ret := 0.750000 // buy
						if( Internal_Swing_Low > 8.84353 )
							ret := 0.166667
				if( Swing_Low > 8.91262 )
					if( Order_Block_Low <= 10.4473 )
						if( Order_Block_High <= 10.5403 )
							if( Premium_Zone <= 13.5029 )
								if( Equilibrium_Zone <= 11.5452 )
									ret := 0.236776
								if( Equilibrium_Zone > 11.5452 )
									ret := -0.338462
							if( Premium_Zone > 13.5029 )
								if( Equilibrium_Zone <= 12.7556 )
									ret := 0.760000 // buy
								if( Equilibrium_Zone > 12.7556 )
									ret := 0.094595
						if( Order_Block_High > 10.5403 )
							ret := -1.000000 // sell
					if( Order_Block_Low > 10.4473 )
						if( Order_Block_Low <= 12.4948 )
							if( Premium_Zone <= 13.3909 )
								if( atr <= 1.2568 )
									ret := 0.750000 // buy
								if( atr > 1.2568 )
									ret := 0.090909
							if( Premium_Zone > 13.3909 )
								if( atr <= 1.45997 )
									ret := 0.857143 // buy
								if( atr > 1.45997 )
									ret := 1.000000 // buy
						if( Order_Block_Low > 12.4948 )
							if( Order_Block_High <= 12.977 )
								if( Swing_Low <= 12.538 )
									ret := -1.000000 // sell
								if( Swing_Low > 12.538 )
									ret := -0.250000
							if( Order_Block_High > 12.977 )
								if( Premium_Zone <= 15.3732 )
									ret := 1.000000 // buy
								if( Premium_Zone > 15.3732 )
									ret := 0.250000
			if( Premium_Zone > 16.0213 )
				if( Order_Block_Low <= 10.7495 )
					if( Equilibrium_Zone <= 15.622 )
						if( Discount_Zone <= 12.7065 )
							ret := -1.000000 // sell
						if( Discount_Zone > 12.7065 )
							if( Discount_Zone <= 13.2277 )
								ret := -0.500000
							if( Discount_Zone > 13.2277 )
								ret := -1.000000 // sell
					if( Equilibrium_Zone > 15.622 )
						if( Premium_Zone <= 21.0359 )
							ret := 0.000000
						if( Premium_Zone > 21.0359 )
							ret := -1.000000 // sell
				if( Order_Block_Low > 10.7495 )
					ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Smart_Money_Concepts 
//@version=5
//indicator "Smart Money Concepts - Pine Script Version", overlay=true)

// Constants
SWING_LENGTH = 50
INTERNAL_SWING_LENGTH = 5
ATR_PERIOD = 200

// ATR Calculation
atr = ta.sma(ta.tr, ATR_PERIOD)

// Swings Detection
var float Swing_High = na
var float Swing_Low = na
Swing_High := ta.highest(high, SWING_LENGTH) == high ? high : na
Swing_Low := ta.lowest(low, SWING_LENGTH) == low ? low : na

var float Internal_Swing_High = na
var float Internal_Swing_Low = na
Internal_Swing_High := ta.highest(high, INTERNAL_SWING_LENGTH) == high ? high : na
Internal_Swing_Low := ta.lowest(low, INTERNAL_SWING_LENGTH) == low ? low : na

// Market Structure Detection
Bullish_BOS = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and not na(Swing_High[1])
Bearish_BOS = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and not na(Swing_Low[1])

Bullish_CHoCH = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and (close[1] < ta.valuewhen(Swing_Low, Swing_Low, 1))
Bearish_CHoCH = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and (close[1] > ta.valuewhen(Swing_High, Swing_High, 1))

Bullish_BOSInt = Bullish_BOS ? 1 : 0
Bearish_BOSInt = Bearish_BOS ? 1 : 0
Bullish_CHoCHInt = Bullish_CHoCH ? 1 : 0
Bearish_CHoCHInt = Bearish_CHoCH ? 1 : 0

// Order Blocks Detection
var float Order_Block_High = na
var float Order_Block_Low = na

threshold = atr
if Bullish_BOS
    Order_Block_High := high
    Order_Block_Low := low
if Bearish_BOS
    Order_Block_High := high
    Order_Block_Low := low

if math.abs(Order_Block_High - Order_Block_Low) > threshold
    Order_Block_High := na
    Order_Block_Low := na

// Fair Value Gaps (FVG) Detection
delta_per = (close - open) / open * 100
FVG_Up = (low > high[2]) and (close > high[2]) and (delta_per > atr)
FVG_Down = (high < low[2]) and (close < low[2]) and (-delta_per > atr)

FVG_UpInt = FVG_Up ? 1 : 0
FVG_DownInt = FVG_Down ? 1 : 0

// Premium/Discount Zones Calculation
avg_price = (ta.valuewhen(Swing_High, Swing_High, 0) + ta.valuewhen(Swing_Low, Swing_Low, 0)) / 2
var float Premium_Zone = avg_price + atr
var float Discount_Zone = avg_price - atr
var float Equilibrium_Zone = avg_price

// Plotting
plot(close, title="Close", color=color.black)

plotshape(series=Swing_High, location=location.abovebar, color=color.green, style=shape.triangledown, title="Swing High")
plotshape(series=Swing_Low, location=location.belowbar, color=color.red, style=shape.triangleup, title="Swing Low")

plotshape(series=Bullish_BOS, location=location.belowbar, color=color.blue, style=shape.circle, title="Bullish BOS")
plotshape(series=Bearish_BOS, location=location.abovebar, color=color.orange, style=shape.circle, title="Bearish BOS")
plotshape(series=Bullish_CHoCH, location=location.belowbar, color=color.aqua, style=shape.square, title="Bullish CHoCH")
plotshape(series=Bearish_CHoCH, location=location.abovebar, color=color.purple, style=shape.square, title="Bearish CHoCH")

plot(Order_Block_High, title="Order Block High", color=color.yellow, style=plot.style_linebr)
plot(Order_Block_Low, title="Order Block Low", color=color.yellow, style=plot.style_linebr)

bgcolor(FVG_Up ? color.new(color.green, 80) : na, title="Bullish FVG")
bgcolor(FVG_Down ? color.new(color.red, 80) : na, title="Bearish FVG")

plot(Premium_Zone, "Premium Zone", color=color.red)
plot(Discount_Zone, "Discount Zone", color=color.green)
plot(Equilibrium_Zone, "Equilibrium Zone", color=color.gray)

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
float op_operation = decision_tree_0_UNIUSDT_15Min_7c994018(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)

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


