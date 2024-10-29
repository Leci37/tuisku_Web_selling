//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: SOLUSDT_30Min_2CM0_f991e864 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2CM0_f991e864", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_f991e864(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= -53926 )
		if( MFI_High <= -48.9167 )
			if( mf <= -0.215853 )
				if( Positive_Money_Flow_Sum <= 1.58693e+07 )
					if( mf <= -0.381474 )
						if( Typical_Price <= 23.0973 )
							if( Raw_Money_Flow <= 381358 )
								if( mf <= -0.4096 )
									ret := 0.187500
								if( mf > -0.4096 )
									ret := -0.875000 // sell
							if( Raw_Money_Flow > 381358 )
								if( MFI_Low <= 5.37127 )
									ret := 0.470588
								if( MFI_Low > 5.37127 )
									ret := -0.250000
						if( Typical_Price > 23.0973 )
							if( ad <= -200584 )
								ret := 0.000000
							if( ad > -200584 )
								if( Negative_Money_Flow_Sum <= 4.265e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.265e+07 )
									ret := -0.500000
					if( mf > -0.381474 )
						if( mf <= -0.327723 )
							if( Typical_Price <= 2.66919 )
								if( MFI <= 8.86839 )
									ret := 1.000000 // buy
								if( MFI > 8.86839 )
									ret := 0.631579
							if( Typical_Price > 2.66919 )
								if( Positive_Money_Flow_Sum <= 445081 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 445081 )
									ret := 0.608696
						if( mf > -0.327723 )
							if( MFI_Low <= -7.79441 )
								if( Raw_Money_Flow <= 4.30087e+06 )
									ret := -0.468750
								if( Raw_Money_Flow > 4.30087e+06 )
									ret := 0.200000
							if( MFI_Low > -7.79441 )
								if( Negative_Money_Flow_Sum <= 2.11418e+06 )
									ret := -0.121212
								if( Negative_Money_Flow_Sum > 2.11418e+06 )
									ret := 0.387255
				if( Positive_Money_Flow_Sum > 1.58693e+07 )
					if( Typical_Price <= 124.824 )
						if( Positive_Money_Flow_Sum <= 4.62061e+07 )
							if( Positive_Money_Flow <= 1.993e+06 )
								if( Raw_Money_Flow <= 9.01965e+06 )
									ret := 0.861111 // buy
								if( Raw_Money_Flow > 9.01965e+06 )
									ret := 0.600000
							if( Positive_Money_Flow > 1.993e+06 )
								ret := -0.800000 // sell
						if( Positive_Money_Flow_Sum > 4.62061e+07 )
							if( mf <= -0.288475 )
								if( ad_mf <= -407364 )
									ret := 1.000000 // buy
								if( ad_mf > -407364 )
									ret := 0.500000
							if( mf > -0.288475 )
								ret := 1.000000 // buy
					if( Typical_Price > 124.824 )
						if( ad_mf <= -138257 )
							if( Negative_Money_Flow <= 2.72245e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 2.72245e+07 )
								if( ad <= -489877 )
									ret := 1.000000 // buy
								if( ad > -489877 )
									ret := 0.166667
						if( ad_mf > -138257 )
							if( Negative_Money_Flow_Sum <= 1.19755e+08 )
								if( mf <= -0.238402 )
									ret := 0.166667
								if( mf > -0.238402 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 1.19755e+08 )
								if( Typical_Price <= 142.587 )
									ret := 0.571429
								if( Typical_Price > 142.587 )
									ret := 0.880952 // buy
			if( mf > -0.215853 )
				if( Negative_Money_Flow_Sum <= 2.45711e+07 )
					if( mf <= -0.131764 )
						if( Negative_Money_Flow_Sum <= 2.22473e+07 )
							if( Negative_Money_Flow_Sum <= 2.07112e+06 )
								if( Positive_Money_Flow_Sum <= 283624 )
									ret := 0.200000
								if( Positive_Money_Flow_Sum > 283624 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.07112e+06 )
								if( Negative_Money_Flow <= 7.66415e+06 )
									ret := 0.322581
								if( Negative_Money_Flow > 7.66415e+06 )
									ret := -0.600000
						if( Negative_Money_Flow_Sum > 2.22473e+07 )
							if( Raw_Money_Flow <= 3.10525e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 3.10525e+06 )
								ret := -0.500000
					if( mf > -0.131764 )
						if( Raw_Money_Flow <= 194176 )
							ret := 0.571429
						if( Raw_Money_Flow > 194176 )
							if( Negative_Money_Flow_Sum <= 6.17094e+06 )
								if( Positive_Money_Flow_Sum <= 1.3603e+06 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 1.3603e+06 )
									ret := -0.857143 // sell
							if( Negative_Money_Flow_Sum > 6.17094e+06 )
								if( Typical_Price <= 10.2083 )
									ret := 0.818182 // buy
								if( Typical_Price > 10.2083 )
									ret := -0.174825
				if( Negative_Money_Flow_Sum > 2.45711e+07 )
					if( Typical_Price <= 27.4066 )
						if( Negative_Money_Flow_Sum <= 3.2882e+07 )
							if( mf <= -0.157494 )
								if( Raw_Money_Flow <= 8.2151e+06 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 8.2151e+06 )
									ret := 0.750000 // buy
							if( mf > -0.157494 )
								if( Money_Flow_Ratio <= 0.370311 )
									ret := 0.454545
								if( Money_Flow_Ratio > 0.370311 )
									ret := 0.857143 // buy
						if( Negative_Money_Flow_Sum > 3.2882e+07 )
							if( Negative_Money_Flow_Sum <= 3.63242e+07 )
								if( Negative_Money_Flow <= 2.12005e+06 )
									ret := 0.500000
								if( Negative_Money_Flow > 2.12005e+06 )
									ret := -0.769231 // sell
							if( Negative_Money_Flow_Sum > 3.63242e+07 )
								if( Raw_Money_Flow <= 3.34601e+06 )
									ret := -0.037037
								if( Raw_Money_Flow > 3.34601e+06 )
									ret := 0.494624
					if( Typical_Price > 27.4066 )
						if( Positive_Money_Flow_Sum <= 9.33369e+07 )
							if( ad_mf <= -352393 )
								if( Negative_Money_Flow_Sum <= 1.82189e+08 )
									ret := -0.900000 // sell
								if( Negative_Money_Flow_Sum > 1.82189e+08 )
									ret := 0.500000
							if( ad_mf > -352393 )
								if( ad <= -252385 )
									ret := 0.540984
								if( ad > -252385 )
									ret := 0.127326
						if( Positive_Money_Flow_Sum > 9.33369e+07 )
							if( MFI_Low <= 9.81439 )
								if( mf <= -0.157735 )
									ret := 0.000000
								if( mf > -0.157735 )
									ret := 0.812500 // buy
							if( MFI_Low > 9.81439 )
								if( ad <= -249285 )
									ret := -0.555556
								if( ad > -249285 )
									ret := 0.600000
		if( MFI_High > -48.9167 )
			if( Positive_Money_Flow_Sum <= 1.74762e+08 )
				if( Positive_Money_Flow_Sum <= 1.5483e+08 )
					if( mf <= 0.041452 )
						if( Negative_Money_Flow_Sum <= 8.04354e+07 )
							if( Negative_Money_Flow <= 2.40523e+07 )
								if( Negative_Money_Flow_Sum <= 6.81409e+07 )
									ret := 0.021197
								if( Negative_Money_Flow_Sum > 6.81409e+07 )
									ret := 0.297101
							if( Negative_Money_Flow > 2.40523e+07 )
								if( Negative_Money_Flow_Sum <= 7.18476e+07 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 7.18476e+07 )
									ret := -0.125000
						if( Negative_Money_Flow_Sum > 8.04354e+07 )
							if( mf <= -0.161026 )
								if( Typical_Price <= 68.0156 )
									ret := -0.763636 // sell
								if( Typical_Price > 68.0156 )
									ret := -0.152542
							if( mf > -0.161026 )
								if( Negative_Money_Flow_Sum <= 1.65245e+08 )
									ret := -0.100251
								if( Negative_Money_Flow_Sum > 1.65245e+08 )
									ret := 0.242038
					if( mf > 0.041452 )
						if( MFI <= 36.1901 )
							if( MFI_High <= -45.1441 )
								if( ad <= -69910.3 )
									ret := -0.371429
								if( ad > -69910.3 )
									ret := 0.178571
							if( MFI_High > -45.1441 )
								if( Negative_Money_Flow_Sum <= 1.17432e+08 )
									ret := -0.850000 // sell
								if( Negative_Money_Flow_Sum > 1.17432e+08 )
									ret := 0.200000
						if( MFI > 36.1901 )
							if( MFI <= 73.4443 )
								if( Positive_Money_Flow_Sum <= 6.95636e+07 )
									ret := 0.125000
								if( Positive_Money_Flow_Sum > 6.95636e+07 )
									ret := 0.279841
							if( MFI > 73.4443 )
								if( Money_Flow_Ratio <= 5.34805 )
									ret := -0.013761
								if( Money_Flow_Ratio > 5.34805 )
									ret := 0.276596
				if( Positive_Money_Flow_Sum > 1.5483e+08 )
					if( Positive_Money_Flow <= 3.35453e+07 )
						if( Negative_Money_Flow_Sum <= 1.75096e+08 )
							if( mf <= 0.301176 )
								if( Raw_Money_Flow <= 1.01423e+07 )
									ret := 0.250000
								if( Raw_Money_Flow > 1.01423e+07 )
									ret := -0.497487
							if( mf > 0.301176 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.75096e+08 )
							if( ad <= -128309 )
								if( Positive_Money_Flow_Sum <= 1.59405e+08 )
									ret := 0.142857
								if( Positive_Money_Flow_Sum > 1.59405e+08 )
									ret := 0.909091 // buy
							if( ad > -128309 )
								if( MFI <= 46.4578 )
									ret := -0.750000 // sell
								if( MFI > 46.4578 )
									ret := 0.500000
					if( Positive_Money_Flow > 3.35453e+07 )
						if( Raw_Money_Flow <= 4.07622e+07 )
							ret := 0.571429
						if( Raw_Money_Flow > 4.07622e+07 )
							ret := 1.000000 // buy
			if( Positive_Money_Flow_Sum > 1.74762e+08 )
				if( Typical_Price <= 188.305 )
					if( Typical_Price <= 47.3306 )
						if( mf <= 0.028191 )
							if( Negative_Money_Flow <= 7.46773e+06 )
								ret := 0.000000
							if( Negative_Money_Flow > 7.46773e+06 )
								ret := 1.000000 // buy
						if( mf > 0.028191 )
							if( Positive_Money_Flow_Sum <= 1.77798e+08 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.77798e+08 )
								if( Raw_Money_Flow <= 3.06308e+07 )
									ret := -0.869565 // sell
								if( Raw_Money_Flow > 3.06308e+07 )
									ret := 0.250000
					if( Typical_Price > 47.3306 )
						if( Positive_Money_Flow_Sum <= 5.34899e+08 )
							if( mf <= 0.29667 )
								if( Positive_Money_Flow_Sum <= 2.89542e+08 )
									ret := 0.259366
								if( Positive_Money_Flow_Sum > 2.89542e+08 )
									ret := 0.563003
							if( mf > 0.29667 )
								if( Typical_Price <= 115.063 )
									ret := -0.833333 // sell
								if( Typical_Price > 115.063 )
									ret := 0.294118
						if( Positive_Money_Flow_Sum > 5.34899e+08 )
							if( Typical_Price <= 176.602 )
								if( Positive_Money_Flow_Sum <= 5.57639e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 5.57639e+08 )
									ret := 0.594595
							if( Typical_Price > 176.602 )
								if( Money_Flow_Ratio <= 1.23869 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 1.23869 )
									ret := -0.352941
				if( Typical_Price > 188.305 )
					if( MFI_Low <= 49.2393 )
						if( Negative_Money_Flow_Sum <= 3.03905e+08 )
							if( ad_mf <= -75265.9 )
								if( ad_mf <= -230597 )
									ret := -0.750000 // sell
								if( ad_mf > -230597 )
									ret := 0.240000
							if( ad_mf > -75265.9 )
								if( Negative_Money_Flow <= 1.70832e+07 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.70832e+07 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 3.03905e+08 )
							if( Negative_Money_Flow <= 7.04499e+07 )
								if( Positive_Money_Flow_Sum <= 7.78599e+08 )
									ret := -0.923077 // sell
								if( Positive_Money_Flow_Sum > 7.78599e+08 )
									ret := 0.200000
							if( Negative_Money_Flow > 7.04499e+07 )
								if( Negative_Money_Flow_Sum <= 5.11718e+08 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 5.11718e+08 )
									ret := -0.250000
					if( MFI_Low > 49.2393 )
						if( Positive_Money_Flow <= 8.61178e+06 )
							if( mf <= 0.103877 )
								if( Typical_Price <= 197.648 )
									ret := 0.200000
								if( Typical_Price > 197.648 )
									ret := -0.400000
							if( mf > 0.103877 )
								if( Positive_Money_Flow_Sum <= 3.8263e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 3.8263e+08 )
									ret := 0.333333
						if( Positive_Money_Flow > 8.61178e+06 )
							if( MFI <= 76.3734 )
								ret := 0.000000
							if( MFI > 76.3734 )
								ret := -0.600000
	if( ad > -53926 )
		if( Positive_Money_Flow <= 1.44098e+07 )
			if( Negative_Money_Flow_Sum <= 546022 )
				if( Typical_Price <= 2.52597 )
					if( Typical_Price <= 1.36804 )
						if( Negative_Money_Flow <= 25930.4 )
							if( Positive_Money_Flow_Sum <= 644032 )
								if( Raw_Money_Flow <= 25656.1 )
									ret := 0.054054
								if( Raw_Money_Flow > 25656.1 )
									ret := 0.578947
							if( Positive_Money_Flow_Sum > 644032 )
								if( Typical_Price <= 1.30809 )
									ret := -1.000000 // sell
								if( Typical_Price > 1.30809 )
									ret := 0.000000
						if( Negative_Money_Flow > 25930.4 )
							if( Typical_Price <= 1.30437 )
								ret := 1.000000 // buy
							if( Typical_Price > 1.30437 )
								if( Negative_Money_Flow_Sum <= 305631 )
									ret := 0.826087 // buy
								if( Negative_Money_Flow_Sum > 305631 )
									ret := 0.333333
					if( Typical_Price > 1.36804 )
						if( Negative_Money_Flow_Sum <= 343214 )
							if( mf <= 0.309439 )
								if( Positive_Money_Flow_Sum <= 916044 )
									ret := 0.020116
								if( Positive_Money_Flow_Sum > 916044 )
									ret := -0.394231
							if( mf > 0.309439 )
								if( Positive_Money_Flow_Sum <= 1.21598e+06 )
									ret := 0.637500
								if( Positive_Money_Flow_Sum > 1.21598e+06 )
									ret := -0.700000 // sell
						if( Negative_Money_Flow_Sum > 343214 )
							if( Positive_Money_Flow_Sum <= 98127.9 )
								if( Negative_Money_Flow_Sum <= 411331 )
									ret := 0.589744
								if( Negative_Money_Flow_Sum > 411331 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 98127.9 )
								if( Positive_Money_Flow_Sum <= 170973 )
									ret := -0.559783
								if( Positive_Money_Flow_Sum > 170973 )
									ret := -0.118085
				if( Typical_Price > 2.52597 )
					if( MFI_Low <= 47.6467 )
						if( Positive_Money_Flow_Sum <= 514123 )
							if( MFI <= 51.2429 )
								if( Positive_Money_Flow_Sum <= 462490 )
									ret := -0.441558
								if( Positive_Money_Flow_Sum > 462490 )
									ret := -0.970588 // sell
							if( MFI > 51.2429 )
								if( Negative_Money_Flow_Sum <= 270246 )
									ret := -0.366667
								if( Negative_Money_Flow_Sum > 270246 )
									ret := 0.241935
						if( Positive_Money_Flow_Sum > 514123 )
							if( Raw_Money_Flow <= 147741 )
								if( Typical_Price <= 3.3017 )
									ret := -0.860759 // sell
								if( Typical_Price > 3.3017 )
									ret := -0.400000
							if( Raw_Money_Flow > 147741 )
								ret := 0.200000
					if( MFI_Low > 47.6467 )
						if( Raw_Money_Flow <= 43498.3 )
							if( Positive_Money_Flow_Sum <= 833693 )
								if( Positive_Money_Flow_Sum <= 480638 )
									ret := 0.076923
								if( Positive_Money_Flow_Sum > 480638 )
									ret := 0.795455 // buy
							if( Positive_Money_Flow_Sum > 833693 )
								if( mf <= -0.031352 )
									ret := -0.875000 // sell
								if( mf > -0.031352 )
									ret := -0.200000
						if( Raw_Money_Flow > 43498.3 )
							if( Negative_Money_Flow_Sum <= 407789 )
								if( Raw_Money_Flow <= 568551 )
									ret := -0.410112
								if( Raw_Money_Flow > 568551 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 407789 )
								if( Negative_Money_Flow <= 144374 )
									ret := 0.268817
								if( Negative_Money_Flow > 144374 )
									ret := -0.700000 // sell
			if( Negative_Money_Flow_Sum > 546022 )
				if( Typical_Price <= 2.09243 )
					if( Positive_Money_Flow_Sum <= 1.75202e+06 )
						if( Positive_Money_Flow_Sum <= 810889 )
							if( Positive_Money_Flow_Sum <= 757940 )
								if( mf <= -0.135866 )
									ret := 0.038012
								if( mf > -0.135866 )
									ret := 0.308880
							if( Positive_Money_Flow_Sum > 757940 )
								if( mf <= -0.065487 )
									ret := 0.333333
								if( mf > -0.065487 )
									ret := -0.894737 // sell
						if( Positive_Money_Flow_Sum > 810889 )
							if( mf <= -0.324407 )
								if( Typical_Price <= 1.9265 )
									ret := -0.250000
								if( Typical_Price > 1.9265 )
									ret := -1.000000 // sell
							if( mf > -0.324407 )
								if( ad_mf <= -21466.5 )
									ret := 0.225806
								if( ad_mf > -21466.5 )
									ret := 0.674267
					if( Positive_Money_Flow_Sum > 1.75202e+06 )
						if( Positive_Money_Flow_Sum <= 2.07095e+06 )
							if( Negative_Money_Flow <= 158457 )
								if( Typical_Price <= 1.75273 )
									ret := 0.000000
								if( Typical_Price > 1.75273 )
									ret := -0.900000 // sell
							if( Negative_Money_Flow > 158457 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 2.07095e+06 )
							if( Negative_Money_Flow_Sum <= 790077 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 790077 )
								if( ad_mf <= 60334.5 )
									ret := 0.607143
								if( ad_mf > 60334.5 )
									ret := -0.181818
				if( Typical_Price > 2.09243 )
					if( MFI_Low <= 46.5635 )
						if( Positive_Money_Flow_Sum <= 338855 )
							if( MFI <= 22.7467 )
								if( Negative_Money_Flow_Sum <= 726978 )
									ret := -0.526316
								if( Negative_Money_Flow_Sum > 726978 )
									ret := 0.307692
							if( MFI > 22.7467 )
								if( ad_mf <= 30179.4 )
									ret := -0.514793
								if( ad_mf > 30179.4 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 338855 )
							if( Typical_Price <= 141.158 )
								if( Negative_Money_Flow <= 1.48063e+07 )
									ret := 0.039504
								if( Negative_Money_Flow > 1.48063e+07 )
									ret := 0.246154
							if( Typical_Price > 141.158 )
								if( MFI_High <= -55.4979 )
									ret := -0.164072
								if( MFI_High > -55.4979 )
									ret := -0.002788
					if( MFI_Low > 46.5635 )
						if( Typical_Price <= 2.52241 )
							if( Money_Flow_Ratio <= 5.54006 )
								if( ad_mf <= -46246.7 )
									ret := 0.666667
								if( ad_mf > -46246.7 )
									ret := -0.432000
							if( Money_Flow_Ratio > 5.54006 )
								if( ad <= 19166.3 )
									ret := 1.000000 // buy
								if( ad > 19166.3 )
									ret := 0.500000
						if( Typical_Price > 2.52241 )
							if( Positive_Money_Flow_Sum <= 1.99955e+06 )
								if( mf <= 0.171526 )
									ret := 0.825581 // buy
								if( mf > 0.171526 )
									ret := -0.035714
							if( Positive_Money_Flow_Sum > 1.99955e+06 )
								if( Typical_Price <= 47.8546 )
									ret := 0.080035
								if( Typical_Price > 47.8546 )
									ret := 0.146368
		if( Positive_Money_Flow > 1.44098e+07 )
			if( Negative_Money_Flow_Sum <= 1.59963e+08 )
				if( Negative_Money_Flow_Sum <= 1.23636e+08 )
					if( MFI_High <= 5.21717 )
						if( Positive_Money_Flow_Sum <= 3.3962e+08 )
							if( Typical_Price <= 151.61 )
								if( Positive_Money_Flow_Sum <= 1.10101e+08 )
									ret := -0.109557
								if( Positive_Money_Flow_Sum > 1.10101e+08 )
									ret := 0.086259
							if( Typical_Price > 151.61 )
								if( Negative_Money_Flow_Sum <= 8.20476e+07 )
									ret := -0.061905
								if( Negative_Money_Flow_Sum > 8.20476e+07 )
									ret := -0.323333
						if( Positive_Money_Flow_Sum > 3.3962e+08 )
							if( Raw_Money_Flow <= 5.27442e+07 )
								if( ad_mf <= 80025.1 )
									ret := 0.166667
								if( ad_mf > 80025.1 )
									ret := 0.784314 // buy
							if( Raw_Money_Flow > 5.27442e+07 )
								if( Negative_Money_Flow_Sum <= 8.35964e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 8.35964e+07 )
									ret := -0.888889 // sell
					if( MFI_High > 5.21717 )
						if( Negative_Money_Flow_Sum <= 2.51834e+07 )
							if( mf <= 0.185258 )
								if( Raw_Money_Flow <= 1.99806e+07 )
									ret := 0.638889
								if( Raw_Money_Flow > 1.99806e+07 )
									ret := -0.096774
							if( mf > 0.185258 )
								if( Money_Flow_Ratio <= 9.84447 )
									ret := -0.500000
								if( Money_Flow_Ratio > 9.84447 )
									ret := 0.054054
						if( Negative_Money_Flow_Sum > 2.51834e+07 )
							if( Typical_Price <= 102.694 )
								if( mf <= 0.161852 )
									ret := -0.666667
								if( mf > 0.161852 )
									ret := -0.954545 // sell
							if( Typical_Price > 102.694 )
								if( Positive_Money_Flow_Sum <= 2.16364e+08 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 2.16364e+08 )
									ret := -0.584416
				if( Negative_Money_Flow_Sum > 1.23636e+08 )
					if( Positive_Money_Flow <= 2.21879e+07 )
						if( Negative_Money_Flow_Sum <= 1.27092e+08 )
							if( Positive_Money_Flow <= 2.16245e+07 )
								if( Positive_Money_Flow <= 1.63728e+07 )
									ret := -0.916667 // sell
								if( Positive_Money_Flow > 1.63728e+07 )
									ret := -0.560000
							if( Positive_Money_Flow > 2.16245e+07 )
								ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 1.27092e+08 )
							if( Negative_Money_Flow_Sum <= 1.56948e+08 )
								if( Negative_Money_Flow_Sum <= 1.48617e+08 )
									ret := 0.073733
								if( Negative_Money_Flow_Sum > 1.48617e+08 )
									ret := -0.529412
							if( Negative_Money_Flow_Sum > 1.56948e+08 )
								if( Typical_Price <= 115.085 )
									ret := 0.000000
								if( Typical_Price > 115.085 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow > 2.21879e+07 )
						if( MFI <= 44.1085 )
							if( ad <= 248278 )
								if( Typical_Price <= 161.082 )
									ret := 0.409091
								if( Typical_Price > 161.082 )
									ret := -0.750000 // sell
							if( ad > 248278 )
								if( ad_mf <= 308438 )
									ret := -1.000000 // sell
								if( ad_mf > 308438 )
									ret := -0.500000
						if( MFI > 44.1085 )
							if( ad <= 509636 )
								if( Positive_Money_Flow <= 5.26442e+07 )
									ret := -0.439490
								if( Positive_Money_Flow > 5.26442e+07 )
									ret := -0.794118 // sell
							if( ad > 509636 )
								ret := 0.333333
			if( Negative_Money_Flow_Sum > 1.59963e+08 )
				if( Typical_Price <= 179.217 )
					if( Positive_Money_Flow_Sum <= 1.07674e+08 )
						if( MFI_Low <= 15.9354 )
							if( ad_mf <= 76944.3 )
								if( mf <= 0.005201 )
									ret := -0.500000
								if( mf > 0.005201 )
									ret := 0.285714
							if( ad_mf > 76944.3 )
								if( Raw_Money_Flow <= 2.0033e+07 )
									ret := -0.214286
								if( Raw_Money_Flow > 2.0033e+07 )
									ret := 0.246154
						if( MFI_Low > 15.9354 )
							if( mf <= -0.055005 )
								ret := 0.000000
							if( mf > -0.055005 )
								if( Positive_Money_Flow <= 1.75217e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 1.75217e+07 )
									ret := 0.600000
					if( Positive_Money_Flow_Sum > 1.07674e+08 )
						if( Positive_Money_Flow_Sum <= 6.32997e+08 )
							if( Negative_Money_Flow_Sum <= 2.57835e+08 )
								if( Negative_Money_Flow_Sum <= 1.82298e+08 )
									ret := 0.447761
								if( Negative_Money_Flow_Sum > 1.82298e+08 )
									ret := 0.015873
							if( Negative_Money_Flow_Sum > 2.57835e+08 )
								if( Typical_Price <= 142.113 )
									ret := 0.584337
								if( Typical_Price > 142.113 )
									ret := 0.230769
						if( Positive_Money_Flow_Sum > 6.32997e+08 )
							if( ad_mf <= 164477 )
								ret := -1.000000 // sell
							if( ad_mf > 164477 )
								ret := -0.571429
				if( Typical_Price > 179.217 )
					if( MFI <= 54.1449 )
						if( Raw_Money_Flow <= 4.60236e+07 )
							if( Positive_Money_Flow_Sum <= 3.25831e+08 )
								if( Negative_Money_Flow_Sum <= 1.96235e+08 )
									ret := 0.277778
								if( Negative_Money_Flow_Sum > 1.96235e+08 )
									ret := -0.441558
							if( Positive_Money_Flow_Sum > 3.25831e+08 )
								if( mf <= 0.004878 )
									ret := 1.000000 // buy
								if( mf > 0.004878 )
									ret := 0.166667
						if( Raw_Money_Flow > 4.60236e+07 )
							if( Negative_Money_Flow_Sum <= 3.90479e+08 )
								if( Positive_Money_Flow <= 5.44724e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 5.44724e+07 )
									ret := 0.166667
							if( Negative_Money_Flow_Sum > 3.90479e+08 )
								if( Raw_Money_Flow <= 7.81254e+07 )
									ret := -0.951220 // sell
								if( Raw_Money_Flow > 7.81254e+07 )
									ret := -0.642857
					if( MFI > 54.1449 )
						if( Positive_Money_Flow_Sum <= 3.66831e+08 )
							if( Negative_Money_Flow_Sum <= 2.09036e+08 )
								if( Positive_Money_Flow <= 1.92177e+07 )
									ret := 0.666667
								if( Positive_Money_Flow > 1.92177e+07 )
									ret := -0.454545
							if( Negative_Money_Flow_Sum > 2.09036e+08 )
								if( MFI <= 57.7751 )
									ret := 1.000000 // buy
								if( MFI > 57.7751 )
									ret := 0.625000
						if( Positive_Money_Flow_Sum > 3.66831e+08 )
							if( Negative_Money_Flow_Sum <= 4.57918e+08 )
								if( ad <= 125832 )
									ret := 0.230769
								if( ad > 125832 )
									ret := -0.648649
							if( Negative_Money_Flow_Sum > 4.57918e+08 )
								if( Negative_Money_Flow <= 4.69379e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 4.69379e+06 )
									ret := 0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SOLUSDT_30Min_f991e864(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


