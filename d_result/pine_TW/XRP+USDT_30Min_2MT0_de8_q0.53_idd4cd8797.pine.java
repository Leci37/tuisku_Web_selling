//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: XRPUSDT_30Min_2MT0_d4cd8797 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2MT0_d4cd8797", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_d4cd8797(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.003321 )
		if( Negative_Money_Flow <= 5.4381e+06 )
			if( tema <= 1.39552 )
				if( Money_Flow_Ratio <= 0.447228 )
					if( ema1 <= 0.607683 )
						if( tema <= 0.394057 )
							if( Negative_Money_Flow_Sum <= 1.12306e+08 )
								if( ema12 <= -0.007154 )
									ret := 0.913043 // buy
								if( ema12 > -0.007154 )
									ret := -0.088000
							if( Negative_Money_Flow_Sum > 1.12306e+08 )
								if( Negative_Money_Flow_Sum <= 1.50664e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.50664e+08 )
									ret := -0.526316
						if( tema > 0.394057 )
							if( ema1 <= 0.583058 )
								if( tema <= 0.458032 )
									ret := 0.350195
								if( tema > 0.458032 )
									ret := 0.111465
							if( ema1 > 0.583058 )
								if( ema13 <= -0.009579 )
									ret := 0.305882
								if( ema13 > -0.009579 )
									ret := 0.602410
					if( ema1 > 0.607683 )
						if( Negative_Money_Flow_Sum <= 2.89531e+08 )
							if( Raw_Money_Flow <= 1.19852e+07 )
								if( MFI <= 30.6814 )
									ret := -0.039275
								if( MFI > 30.6814 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.19852e+07 )
								if( ema2 <= 0.662038 )
									ret := 0.363636
								if( ema2 > 0.662038 )
									ret := -0.442529
						if( Negative_Money_Flow_Sum > 2.89531e+08 )
							if( MFI <= 17.2495 )
								ret := -1.000000 // sell
							if( MFI > 17.2495 )
								if( MFI_High <= -59.1187 )
									ret := 0.896552 // buy
								if( MFI_High > -59.1187 )
									ret := 0.242718
				if( Money_Flow_Ratio > 0.447228 )
					if( Positive_Money_Flow_Sum <= 2.73522e+08 )
						if( ema12 <= -0.00799 )
							if( Money_Flow_Ratio <= 0.690175 )
								if( Negative_Money_Flow_Sum <= 2.79321e+08 )
									ret := 0.100304
								if( Negative_Money_Flow_Sum > 2.79321e+08 )
									ret := 0.539683
							if( Money_Flow_Ratio > 0.690175 )
								if( MFI_Low <= 23.1718 )
									ret := 0.875000 // buy
								if( MFI_Low > 23.1718 )
									ret := 0.415929
						if( ema12 > -0.00799 )
							if( MFI_High <= -32.5627 )
								if( tema <= 0.494438 )
									ret := 0.365854
								if( tema > 0.494438 )
									ret := 0.145972
							if( MFI_High > -32.5627 )
								if( Negative_Money_Flow <= 57029.8 )
									ret := 0.071429
								if( Negative_Money_Flow > 57029.8 )
									ret := -0.577778
					if( Positive_Money_Flow_Sum > 2.73522e+08 )
						if( Negative_Money_Flow_Sum <= 3.94907e+08 )
							if( Positive_Money_Flow <= 4.75038e+07 )
								if( MFI_High <= -18.0472 )
									ret := 0.782609 // buy
								if( MFI_High > -18.0472 )
									ret := -0.250000
							if( Positive_Money_Flow > 4.75038e+07 )
								ret := -0.500000
						if( Negative_Money_Flow_Sum > 3.94907e+08 )
							if( Positive_Money_Flow <= 2.8483e+07 )
								if( ema3 <= 1.18728 )
									ret := 1.000000 // buy
								if( ema3 > 1.18728 )
									ret := 0.500000
							if( Positive_Money_Flow > 2.8483e+07 )
								if( Money_Flow_Ratio <= 0.590722 )
									ret := -0.125000
								if( Money_Flow_Ratio > 0.590722 )
									ret := -0.753425 // sell
			if( tema > 1.39552 )
				if( Negative_Money_Flow_Sum <= 7.94133e+08 )
					if( Negative_Money_Flow_Sum <= 1.34156e+08 )
						if( Positive_Money_Flow_Sum <= 1.05983e+08 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 1.05983e+08 )
							ret := 0.750000 // buy
					if( Negative_Money_Flow_Sum > 1.34156e+08 )
						if( MFI_Low <= 31.5918 )
							if( ema1 <= 1.59787 )
								if( ema1 <= 1.5563 )
									ret := -0.646465
								if( ema1 > 1.5563 )
									ret := -0.040816
							if( ema1 > 1.59787 )
								if( ema3 <= 1.78859 )
									ret := -0.891892 // sell
								if( ema3 > 1.78859 )
									ret := -0.500000
						if( MFI_Low > 31.5918 )
							if( Raw_Money_Flow <= 5.77927e+07 )
								if( Negative_Money_Flow_Sum <= 2.54037e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.54037e+08 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 5.77927e+07 )
								ret := -0.500000
				if( Negative_Money_Flow_Sum > 7.94133e+08 )
					ret := 1.000000 // buy
		if( Negative_Money_Flow > 5.4381e+06 )
			if( Negative_Money_Flow_Sum <= 1.44565e+08 )
				if( Negative_Money_Flow <= 1.53171e+07 )
					if( ema12 <= -0.005757 )
						if( ema3 <= 0.47505 )
							if( MFI_Low <= -8.60333 )
								ret := -0.142857
							if( MFI_Low > -8.60333 )
								if( ema12 <= -0.005934 )
									ret := 0.831461 // buy
								if( ema12 > -0.005934 )
									ret := 0.125000
						if( ema3 > 0.47505 )
							if( Negative_Money_Flow_Sum <= 7.06607e+07 )
								if( Negative_Money_Flow_Sum <= 5.59752e+07 )
									ret := 0.527027
								if( Negative_Money_Flow_Sum > 5.59752e+07 )
									ret := -0.078947
							if( Negative_Money_Flow_Sum > 7.06607e+07 )
								if( Negative_Money_Flow_Sum <= 9.56118e+07 )
									ret := 0.472131
								if( Negative_Money_Flow_Sum > 9.56118e+07 )
									ret := 0.264463
					if( ema12 > -0.005757 )
						if( MFI <= 16.568 )
							if( Positive_Money_Flow_Sum <= 1.94404e+07 )
								if( Negative_Money_Flow_Sum <= 7.81296e+07 )
									ret := -0.138462
								if( Negative_Money_Flow_Sum > 7.81296e+07 )
									ret := -0.677419
							if( Positive_Money_Flow_Sum > 1.94404e+07 )
								ret := 1.000000 // buy
						if( MFI > 16.568 )
							if( Negative_Money_Flow_Sum <= 1.09511e+08 )
								if( Negative_Money_Flow_Sum <= 3.73434e+07 )
									ret := -0.077922
								if( Negative_Money_Flow_Sum > 3.73434e+07 )
									ret := 0.281197
							if( Negative_Money_Flow_Sum > 1.09511e+08 )
								if( Negative_Money_Flow_Sum <= 1.35838e+08 )
									ret := -0.224000
								if( Negative_Money_Flow_Sum > 1.35838e+08 )
									ret := 0.333333
				if( Negative_Money_Flow > 1.53171e+07 )
					if( Negative_Money_Flow_Sum <= 7.429e+07 )
						if( ema2 <= 0.42839 )
							if( Money_Flow_Ratio <= 0.210119 )
								ret := 0.750000 // buy
							if( Money_Flow_Ratio > 0.210119 )
								ret := 1.000000 // buy
						if( ema2 > 0.42839 )
							if( MFI_Low <= -5.94814 )
								if( ema2 <= 0.52489 )
									ret := 0.250000
								if( ema2 > 0.52489 )
									ret := 0.933333 // buy
							if( MFI_Low > -5.94814 )
								if( MFI_High <= -57.4401 )
									ret := -0.333333
								if( MFI_High > -57.4401 )
									ret := 0.144144
					if( Negative_Money_Flow_Sum > 7.429e+07 )
						if( ema3 <= 1.30579 )
							if( MFI <= 41.2181 )
								if( Negative_Money_Flow_Sum <= 1.3388e+08 )
									ret := 0.478336
								if( Negative_Money_Flow_Sum > 1.3388e+08 )
									ret := 0.782609 // buy
							if( MFI > 41.2181 )
								if( Positive_Money_Flow_Sum <= 1.10072e+08 )
									ret := -0.133333
								if( Positive_Money_Flow_Sum > 1.10072e+08 )
									ret := 0.656250
						if( ema3 > 1.30579 )
							if( MFI_High <= -46.5942 )
								ret := -1.000000 // sell
							if( MFI_High > -46.5942 )
								ret := 0.250000
			if( Negative_Money_Flow_Sum > 1.44565e+08 )
				if( ema12 <= -0.020152 )
					if( Negative_Money_Flow_Sum <= 3.63325e+08 )
						if( Negative_Money_Flow <= 2.0074e+07 )
							if( Negative_Money_Flow_Sum <= 2.66096e+08 )
								if( Negative_Money_Flow_Sum <= 1.98584e+08 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 1.98584e+08 )
									ret := -0.714286 // sell
							if( Negative_Money_Flow_Sum > 2.66096e+08 )
								ret := 0.857143 // buy
						if( Negative_Money_Flow > 2.0074e+07 )
							if( Money_Flow_Ratio <= 0.310811 )
								if( ema12 <= -0.020622 )
									ret := 0.926316 // buy
								if( ema12 > -0.020622 )
									ret := 0.222222
							if( Money_Flow_Ratio > 0.310811 )
								if( ema1 <= 0.698 )
									ret := -1.000000 // sell
								if( ema1 > 0.698 )
									ret := 0.674419
					if( Negative_Money_Flow_Sum > 3.63325e+08 )
						if( Positive_Money_Flow_Sum <= 6.3151e+08 )
							if( MFI_Low <= 18.4851 )
								if( ema1 <= 1.24297 )
									ret := 0.098160
								if( ema1 > 1.24297 )
									ret := 0.565476
							if( MFI_Low > 18.4851 )
								if( Negative_Money_Flow <= 8.73451e+07 )
									ret := -0.542857
								if( Negative_Money_Flow > 8.73451e+07 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 6.3151e+08 )
							if( Negative_Money_Flow <= 7.41106e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 7.41106e+07 )
								ret := -0.750000 // sell
				if( ema12 > -0.020152 )
					if( Raw_Money_Flow <= 6.62777e+07 )
						if( ema2 <= 1.3992 )
							if( Positive_Money_Flow_Sum <= 3.44744e+07 )
								if( Negative_Money_Flow_Sum <= 1.53041e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.53041e+08 )
									ret := -0.309524
							if( Positive_Money_Flow_Sum > 3.44744e+07 )
								if( Negative_Money_Flow_Sum <= 3.34072e+08 )
									ret := 0.101151
								if( Negative_Money_Flow_Sum > 3.34072e+08 )
									ret := 0.496124
						if( ema2 > 1.3992 )
							if( ema1 <= 1.5636 )
								if( Negative_Money_Flow_Sum <= 4.44048e+08 )
									ret := -0.261261
								if( Negative_Money_Flow_Sum > 4.44048e+08 )
									ret := -0.833333 // sell
							if( ema1 > 1.5636 )
								if( Positive_Money_Flow_Sum <= 2.59161e+08 )
									ret := -0.275862
								if( Positive_Money_Flow_Sum > 2.59161e+08 )
									ret := 0.421053
					if( Raw_Money_Flow > 6.62777e+07 )
						if( tema <= 1.42247 )
							if( Raw_Money_Flow <= 1.26497e+08 )
								if( Typical_Price <= 1.36004 )
									ret := 0.500000
								if( Typical_Price > 1.36004 )
									ret := -0.571429
							if( Raw_Money_Flow > 1.26497e+08 )
								ret := -1.000000 // sell
						if( tema > 1.42247 )
							if( ema12 <= -0.004604 )
								ret := 1.000000 // buy
							if( ema12 > -0.004604 )
								ret := 0.500000
	if( ema12 > -0.003321 )
		if( ema12 <= 0.023376 )
			if( Negative_Money_Flow <= 3.63618e+06 )
				if( Negative_Money_Flow_Sum <= 4.90819e+07 )
					if( Positive_Money_Flow_Sum <= 5.20997e+07 )
						if( Typical_Price <= 0.235226 )
							if( Positive_Money_Flow_Sum <= 5.42324e+06 )
								if( Typical_Price <= 0.223318 )
									ret := 0.833333 // buy
								if( Typical_Price > 0.223318 )
									ret := 0.101626
							if( Positive_Money_Flow_Sum > 5.42324e+06 )
								if( MFI_Low <= 44.557 )
									ret := 0.536145
								if( MFI_Low > 44.557 )
									ret := 0.047619
						if( Typical_Price > 0.235226 )
							if( Positive_Money_Flow <= 6.94831e+06 )
								if( ema2 <= 0.608226 )
									ret := 0.020541
								if( ema2 > 0.608226 )
									ret := -0.054114
							if( Positive_Money_Flow > 6.94831e+06 )
								if( Positive_Money_Flow <= 8.28179e+06 )
									ret := 0.269103
								if( Positive_Money_Flow > 8.28179e+06 )
									ret := 0.070423
					if( Positive_Money_Flow_Sum > 5.20997e+07 )
						if( Money_Flow_Ratio <= 19.4699 )
							if( ema3 <= 0.328469 )
								if( MFI_Low <= 47.441 )
									ret := 0.014706
								if( MFI_Low > 47.441 )
									ret := -0.744186 // sell
							if( ema3 > 0.328469 )
								if( MFI <= 87.1867 )
									ret := -0.080660
								if( MFI > 87.1867 )
									ret := -0.318996
						if( Money_Flow_Ratio > 19.4699 )
							if( tema <= 0.663807 )
								if( ema12 <= 0.009063 )
									ret := 0.583333
								if( ema12 > 0.009063 )
									ret := 1.000000 // buy
							if( tema > 0.663807 )
								ret := 0.000000
				if( Negative_Money_Flow_Sum > 4.90819e+07 )
					if( Positive_Money_Flow <= 8.35853e+06 )
						if( tema <= 0.568452 )
							if( ema1 <= 0.560424 )
								if( ema13 <= -0.006147 )
									ret := -0.117647
								if( ema13 > -0.006147 )
									ret := 0.227474
							if( ema1 > 0.560424 )
								if( ema13 <= -0.002938 )
									ret := 0.250000
								if( ema13 > -0.002938 )
									ret := 0.714286 // buy
						if( tema > 0.568452 )
							if( Positive_Money_Flow <= 2.33831e+06 )
								if( Money_Flow_Ratio <= 0.637618 )
									ret := -0.295082
								if( Money_Flow_Ratio > 0.637618 )
									ret := 0.179487
							if( Positive_Money_Flow > 2.33831e+06 )
								if( Negative_Money_Flow_Sum <= 1.46639e+08 )
									ret := 0.107160
								if( Negative_Money_Flow_Sum > 1.46639e+08 )
									ret := -0.684211
					if( Positive_Money_Flow > 8.35853e+06 )
						if( Positive_Money_Flow_Sum <= 4.08013e+08 )
							if( Raw_Money_Flow <= 4.44443e+07 )
								if( Positive_Money_Flow_Sum <= 6.6218e+07 )
									ret := -0.156371
								if( Positive_Money_Flow_Sum > 6.6218e+07 )
									ret := 0.041368
							if( Raw_Money_Flow > 4.44443e+07 )
								if( Positive_Money_Flow_Sum <= 2.55792e+08 )
									ret := -0.525773
								if( Positive_Money_Flow_Sum > 2.55792e+08 )
									ret := -0.074324
						if( Positive_Money_Flow_Sum > 4.08013e+08 )
							if( Positive_Money_Flow_Sum <= 4.49688e+08 )
								if( Typical_Price <= 1.49309 )
									ret := 0.773810 // buy
								if( Typical_Price > 1.49309 )
									ret := -0.357143
							if( Positive_Money_Flow_Sum > 4.49688e+08 )
								if( Negative_Money_Flow_Sum <= 2.40565e+08 )
									ret := -0.437500
								if( Negative_Money_Flow_Sum > 2.40565e+08 )
									ret := 0.237805
			if( Negative_Money_Flow > 3.63618e+06 )
				if( Positive_Money_Flow_Sum <= 2.52848e+08 )
					if( ema12 <= 0.005449 )
						if( ema3 <= 0.585786 )
							if( Positive_Money_Flow_Sum <= 2.25126e+08 )
								if( Positive_Money_Flow_Sum <= 2.38199e+07 )
									ret := 0.080016
								if( Positive_Money_Flow_Sum > 2.38199e+07 )
									ret := 0.174547
							if( Positive_Money_Flow_Sum > 2.25126e+08 )
								ret := -1.000000 // sell
						if( ema3 > 0.585786 )
							if( ema13 <= -0.005425 )
								if( ema3 <= 1.26028 )
									ret := -0.124183
								if( ema3 > 1.26028 )
									ret := -0.764706 // sell
							if( ema13 > -0.005425 )
								if( Raw_Money_Flow <= 5.62149e+06 )
									ret := -0.016293
								if( Raw_Money_Flow > 5.62149e+06 )
									ret := 0.095525
					if( ema12 > 0.005449 )
						if( ema3 <= 0.668519 )
							if( ema1 <= 0.527117 )
								if( Positive_Money_Flow_Sum <= 1.54484e+08 )
									ret := -0.137097
								if( Positive_Money_Flow_Sum > 1.54484e+08 )
									ret := 0.350000
							if( ema1 > 0.527117 )
								if( ema12 <= 0.00771 )
									ret := -0.144796
								if( ema12 > 0.00771 )
									ret := -0.472362
						if( ema3 > 0.668519 )
							if( Money_Flow_Ratio <= 0.767231 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.767231 )
								if( Negative_Money_Flow_Sum <= 8.73081e+07 )
									ret := 0.095989
								if( Negative_Money_Flow_Sum > 8.73081e+07 )
									ret := -0.163934
				if( Positive_Money_Flow_Sum > 2.52848e+08 )
					if( Money_Flow_Ratio <= 3.76398 )
						if( ema3 <= 0.828217 )
							if( Positive_Money_Flow_Sum <= 3.12862e+08 )
								if( Raw_Money_Flow <= 2.82698e+07 )
									ret := 0.161290
								if( Raw_Money_Flow > 2.82698e+07 )
									ret := 0.812500 // buy
							if( Positive_Money_Flow_Sum > 3.12862e+08 )
								if( Money_Flow_Ratio <= 2.89789 )
									ret := -0.428571
								if( Money_Flow_Ratio > 2.89789 )
									ret := 0.720000 // buy
						if( ema3 > 0.828217 )
							if( Raw_Money_Flow <= 1.97898e+07 )
								if( ema2 <= 1.16833 )
									ret := 0.400000
								if( ema2 > 1.16833 )
									ret := -0.846154 // sell
							if( Raw_Money_Flow > 1.97898e+07 )
								if( MFI_High <= -27.9585 )
									ret := 0.125000
								if( MFI_High > -27.9585 )
									ret := 0.539150
					if( Money_Flow_Ratio > 3.76398 )
						if( ema2 <= 0.680541 )
							if( Money_Flow_Ratio <= 4.57339 )
								ret := 0.000000
							if( Money_Flow_Ratio > 4.57339 )
								ret := 1.000000 // buy
						if( ema2 > 0.680541 )
							if( MFI_Low <= 61.8213 )
								ret := -1.000000 // sell
							if( MFI_Low > 61.8213 )
								if( Raw_Money_Flow <= 2.2186e+07 )
									ret := -0.571429
								if( Raw_Money_Flow > 2.2186e+07 )
									ret := -0.833333 // sell
		if( ema12 > 0.023376 )
			if( MFI <= 60.1185 )
				if( Money_Flow_Ratio <= 0.919688 )
					ret := -0.250000
				if( Money_Flow_Ratio > 0.919688 )
					if( Negative_Money_Flow_Sum <= 2.87634e+08 )
						ret := -0.500000
					if( Negative_Money_Flow_Sum > 2.87634e+08 )
						if( ema12 <= 0.024011 )
							ret := -0.500000
						if( ema12 > 0.024011 )
							if( MFI_Low <= 29.9252 )
								if( Money_Flow_Ratio <= 0.9865 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.9865 )
									ret := -0.750000 // sell
							if( MFI_Low > 29.9252 )
								ret := -1.000000 // sell
			if( MFI > 60.1185 )
				if( Negative_Money_Flow <= 3.69422e+07 )
					if( Positive_Money_Flow_Sum <= 1.00054e+09 )
						if( Positive_Money_Flow_Sum <= 8.7266e+08 )
							if( Negative_Money_Flow_Sum <= 3.74809e+07 )
								if( tema <= 0.625931 )
									ret := 1.000000 // buy
								if( tema > 0.625931 )
									ret := 0.062500
							if( Negative_Money_Flow_Sum > 3.74809e+07 )
								if( Money_Flow_Ratio <= 1.53655 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.53655 )
									ret := -0.443478
						if( Positive_Money_Flow_Sum > 8.7266e+08 )
							if( ema13 <= 0.095858 )
								if( ema3 <= 0.730264 )
									ret := 0.000000
								if( ema3 > 0.730264 )
									ret := 1.000000 // buy
							if( ema13 > 0.095858 )
								ret := -0.833333 // sell
					if( Positive_Money_Flow_Sum > 1.00054e+09 )
						if( ema1 <= 1.26767 )
							ret := -1.000000 // sell
						if( ema1 > 1.26767 )
							if( Raw_Money_Flow <= 9.81356e+07 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 9.81356e+07 )
								if( MFI_Low <= 58.742 )
									ret := -0.500000
								if( MFI_Low > 58.742 )
									ret := -0.750000 // sell
				if( Negative_Money_Flow > 3.69422e+07 )
					if( ema12 <= 0.026615 )
						if( Raw_Money_Flow <= 4.49643e+07 )
							ret := 0.500000
						if( Raw_Money_Flow > 4.49643e+07 )
							if( ema1 <= 1.25821 )
								ret := -1.000000 // sell
							if( ema1 > 1.25821 )
								if( ema1 <= 1.4286 )
									ret := 1.000000 // buy
								if( ema1 > 1.4286 )
									ret := -1.000000 // sell
					if( ema12 > 0.026615 )
						if( Raw_Money_Flow <= 1.61965e+08 )
							if( MFI_High <= -10.0789 )
								if( tema <= 1.25951 )
									ret := 0.222222
								if( tema > 1.25951 )
									ret := 0.775000 // buy
							if( MFI_High > -10.0789 )
								if( Negative_Money_Flow_Sum <= 3.29124e+08 )
									ret := 0.254237
								if( Negative_Money_Flow_Sum > 3.29124e+08 )
									ret := -0.666667
						if( Raw_Money_Flow > 1.61965e+08 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XRPUSDT_30Min_d4cd8797(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, ema2, tema, ema12, ema3, ema1, ema13)

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


