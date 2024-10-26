//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: VETUSDT_30Min_2MT0_f5920ef4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_2MT0_f5920ef4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_f5920ef4(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow <= 192805 )
		if( ema2 <= 0.178243 )
			if( ema13 <= 0.00244 )
				if( ema2 <= 0.022915 )
					if( Positive_Money_Flow <= 68636.4 )
						if( Positive_Money_Flow_Sum <= 1.56994e+06 )
							if( Positive_Money_Flow_Sum <= 1.45079e+06 )
								if( ema3 <= 0.014596 )
									ret := -0.214141
								if( ema3 > 0.014596 )
									ret := -0.018014
							if( Positive_Money_Flow_Sum > 1.45079e+06 )
								if( ema13 <= 0.000155 )
									ret := -0.461988
								if( ema13 > 0.000155 )
									ret := 0.305556
						if( Positive_Money_Flow_Sum > 1.56994e+06 )
							if( ema13 <= 0.000112 )
								if( ema3 <= 0.021941 )
									ret := 0.194444
								if( ema3 > 0.021941 )
									ret := 0.786667 // buy
							if( ema13 > 0.000112 )
								if( Money_Flow_Ratio <= 2.54507 )
									ret := -0.218447
								if( Money_Flow_Ratio > 2.54507 )
									ret := 0.194805
					if( Positive_Money_Flow > 68636.4 )
						if( ema12 <= 0.000227 )
							if( Positive_Money_Flow_Sum <= 9.43718e+06 )
								if( Positive_Money_Flow_Sum <= 3.3123e+06 )
									ret := 0.039979
								if( Positive_Money_Flow_Sum > 3.3123e+06 )
									ret := 0.156361
							if( Positive_Money_Flow_Sum > 9.43718e+06 )
								if( MFI_High <= -25.4189 )
									ret := 0.238095
								if( MFI_High > -25.4189 )
									ret := -0.694444
						if( ema12 > 0.000227 )
							if( Raw_Money_Flow <= 609623 )
								if( Negative_Money_Flow <= 13197.1 )
									ret := 0.093407
								if( Negative_Money_Flow > 13197.1 )
									ret := 0.733333 // buy
							if( Raw_Money_Flow > 609623 )
								if( ema3 <= 0.015753 )
									ret := -0.137615
								if( ema3 > 0.015753 )
									ret := -0.561983
				if( ema2 > 0.022915 )
					if( ema2 <= 0.170637 )
						if( Positive_Money_Flow_Sum <= 4.8907e+07 )
							if( Negative_Money_Flow_Sum <= 3.06204e+07 )
								if( ema12 <= -0.000613 )
									ret := 0.102710
								if( ema12 > -0.000613 )
									ret := -0.040933
							if( Negative_Money_Flow_Sum > 3.06204e+07 )
								if( ema1 <= 0.051304 )
									ret := 0.273585
								if( ema1 > 0.051304 )
									ret := -0.239005
						if( Positive_Money_Flow_Sum > 4.8907e+07 )
							if( MFI_Low <= 34.2005 )
								if( MFI <= 47.5624 )
									ret := 0.149020
								if( MFI > 47.5624 )
									ret := 0.564103
							if( MFI_Low > 34.2005 )
								if( Positive_Money_Flow_Sum <= 5.80982e+07 )
									ret := 0.427313
								if( Positive_Money_Flow_Sum > 5.80982e+07 )
									ret := -0.179907
					if( ema2 > 0.170637 )
						if( Money_Flow_Ratio <= 0.323751 )
							ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.323751 )
							if( Negative_Money_Flow_Sum <= 3.75737e+07 )
								if( ema1 <= 0.173565 )
									ret := 0.875000 // buy
								if( ema1 > 0.173565 )
									ret := 0.482759
							if( Negative_Money_Flow_Sum > 3.75737e+07 )
								if( Money_Flow_Ratio <= 0.531032 )
									ret := -0.727273 // sell
								if( Money_Flow_Ratio > 0.531032 )
									ret := 0.194175
			if( ema13 > 0.00244 )
				if( Positive_Money_Flow_Sum <= 5.39904e+07 )
					if( Typical_Price <= 0.147731 )
						if( ema2 <= 0.103657 )
							if( ema12 <= 0.001647 )
								if( ema13 <= 0.002832 )
									ret := -0.480769
								if( ema13 > 0.002832 )
									ret := 0.333333
							if( ema12 > 0.001647 )
								if( Positive_Money_Flow_Sum <= 3.09993e+07 )
									ret := -0.769231 // sell
								if( Positive_Money_Flow_Sum > 3.09993e+07 )
									ret := 0.515152
						if( ema2 > 0.103657 )
							if( Money_Flow_Ratio <= 3.13876 )
								if( Negative_Money_Flow_Sum <= 1.73412e+07 )
									ret := 0.109756
								if( Negative_Money_Flow_Sum > 1.73412e+07 )
									ret := -0.511111
							if( Money_Flow_Ratio > 3.13876 )
								if( Raw_Money_Flow <= 7.18442e+06 )
									ret := -0.736264 // sell
								if( Raw_Money_Flow > 7.18442e+06 )
									ret := 0.100000
					if( Typical_Price > 0.147731 )
						if( Money_Flow_Ratio <= 3.16488 )
							if( Positive_Money_Flow_Sum <= 4.81456e+07 )
								if( ema12 <= 0.001544 )
									ret := 0.375000
								if( ema12 > 0.001544 )
									ret := 0.972973 // buy
							if( Positive_Money_Flow_Sum > 4.81456e+07 )
								ret := -0.400000
						if( Money_Flow_Ratio > 3.16488 )
							ret := -0.083333
				if( Positive_Money_Flow_Sum > 5.39904e+07 )
					if( MFI <= 55.3442 )
						if( Negative_Money_Flow_Sum <= 9.37476e+07 )
							if( Positive_Money_Flow_Sum <= 9.60166e+07 )
								ret := 0.166667
							if( Positive_Money_Flow_Sum > 9.60166e+07 )
								ret := 0.941176 // buy
						if( Negative_Money_Flow_Sum > 9.37476e+07 )
							if( ema13 <= 0.002949 )
								ret := 1.000000 // buy
							if( ema13 > 0.002949 )
								if( Raw_Money_Flow <= 1.11151e+07 )
									ret := 0.142857
								if( Raw_Money_Flow > 1.11151e+07 )
									ret := -1.000000 // sell
					if( MFI > 55.3442 )
						if( Raw_Money_Flow <= 6.51212e+06 )
							if( MFI_High <= -7.63033 )
								if( Raw_Money_Flow <= 3.94632e+06 )
									ret := 0.545455
								if( Raw_Money_Flow > 3.94632e+06 )
									ret := -0.469388
							if( MFI_High > -7.63033 )
								if( tema <= 0.119283 )
									ret := -0.935484 // sell
								if( tema > 0.119283 )
									ret := -0.580000
						if( Raw_Money_Flow > 6.51212e+06 )
							if( ema1 <= 0.122008 )
								if( ema12 <= 0.002168 )
									ret := -0.505376
								if( ema12 > 0.002168 )
									ret := -0.015267
							if( ema1 > 0.122008 )
								if( Negative_Money_Flow_Sum <= 7.44271e+07 )
									ret := -0.396825
								if( Negative_Money_Flow_Sum > 7.44271e+07 )
									ret := -0.878049 // sell
		if( ema2 > 0.178243 )
			if( MFI <= 47.8456 )
				if( MFI_High <= -46.8921 )
					if( MFI_High <= -47.4899 )
						if( MFI <= 27.9451 )
							if( MFI_Low <= 3.28098 )
								ret := -0.800000 // sell
							if( MFI_Low > 3.28098 )
								if( ema13 <= -0.005356 )
									ret := 0.666667
								if( ema13 > -0.005356 )
									ret := -0.285714
						if( MFI > 27.9451 )
							if( Negative_Money_Flow_Sum <= 7.44522e+07 )
								ret := 0.142857
							if( Negative_Money_Flow_Sum > 7.44522e+07 )
								if( Positive_Money_Flow <= 6.13801e+06 )
									ret := -0.300000
								if( Positive_Money_Flow > 6.13801e+06 )
									ret := -0.742857 // sell
					if( MFI_High > -47.4899 )
						ret := 0.555556
				if( MFI_High > -46.8921 )
					if( Raw_Money_Flow <= 4.6753e+06 )
						if( tema <= 0.182413 )
							ret := -0.785714 // sell
						if( tema > 0.182413 )
							if( Negative_Money_Flow_Sum <= 3.70007e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 3.70007e+07 )
								if( Raw_Money_Flow <= 4.08373e+06 )
									ret := -0.666667
								if( Raw_Money_Flow > 4.08373e+06 )
									ret := -1.000000 // sell
					if( Raw_Money_Flow > 4.6753e+06 )
						if( ema13 <= 0.000821 )
							if( ema1 <= 0.202155 )
								if( ema1 <= 0.199954 )
									ret := -0.472527
								if( ema1 > 0.199954 )
									ret := 0.285714
							if( ema1 > 0.202155 )
								if( Positive_Money_Flow_Sum <= 4.20337e+07 )
									ret := -0.111111
								if( Positive_Money_Flow_Sum > 4.20337e+07 )
									ret := -0.826446 // sell
						if( ema13 > 0.000821 )
							if( MFI <= 46.3245 )
								ret := 0.769231 // buy
							if( MFI > 46.3245 )
								ret := -0.111111
			if( MFI > 47.8456 )
				if( ema12 <= 0.0024 )
					if( Positive_Money_Flow_Sum <= 5.58069e+07 )
						if( MFI_Low <= 50.0144 )
							if( ema12 <= 0.000816 )
								if( Negative_Money_Flow_Sum <= 2.42024e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.42024e+07 )
									ret := -0.129630
							if( ema12 > 0.000816 )
								ret := -0.782609 // sell
						if( MFI_Low > 50.0144 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 5.58069e+07 )
						if( MFI <= 60.4307 )
							if( Negative_Money_Flow_Sum <= 1.05418e+08 )
								if( tema <= 0.179859 )
									ret := 0.500000
								if( tema > 0.179859 )
									ret := -0.419355
							if( Negative_Money_Flow_Sum > 1.05418e+08 )
								if( ema3 <= 0.237179 )
									ret := 0.785714 // buy
								if( ema3 > 0.237179 )
									ret := -0.500000
						if( MFI > 60.4307 )
							if( MFI_High <= -14.3995 )
								if( Positive_Money_Flow <= 5.41693e+06 )
									ret := 0.954545 // buy
								if( Positive_Money_Flow > 5.41693e+06 )
									ret := 0.547619
							if( MFI_High > -14.3995 )
								if( Money_Flow_Ratio <= 2.42872 )
									ret := -0.253968
								if( Money_Flow_Ratio > 2.42872 )
									ret := 0.302326
				if( ema12 > 0.0024 )
					if( Negative_Money_Flow_Sum <= 8.55053e+07 )
						if( ema13 <= 0.00693 )
							if( Positive_Money_Flow <= 1.33522e+07 )
								if( Negative_Money_Flow_Sum <= 3.30966e+07 )
									ret := -0.685714
								if( Negative_Money_Flow_Sum > 3.30966e+07 )
									ret := 0.222222
							if( Positive_Money_Flow > 1.33522e+07 )
								if( Positive_Money_Flow <= 2.28478e+07 )
									ret := -0.930233 // sell
								if( Positive_Money_Flow > 2.28478e+07 )
									ret := -0.375000
						if( ema13 > 0.00693 )
							if( Negative_Money_Flow_Sum <= 5.203e+07 )
								ret := -0.888889 // sell
							if( Negative_Money_Flow_Sum > 5.203e+07 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 8.55053e+07 )
						if( MFI <= 73.21 )
							if( Raw_Money_Flow <= 2.70385e+07 )
								if( Negative_Money_Flow_Sum <= 1.39831e+08 )
									ret := -0.758621 // sell
								if( Negative_Money_Flow_Sum > 1.39831e+08 )
									ret := 0.600000
							if( Raw_Money_Flow > 2.70385e+07 )
								if( MFI_High <= -13.9852 )
									ret := -0.966667 // sell
								if( MFI_High > -13.9852 )
									ret := -0.600000
						if( MFI > 73.21 )
							if( ema12 <= 0.008796 )
								if( MFI_High <= -5.24737 )
									ret := 0.923077 // buy
								if( MFI_High > -5.24737 )
									ret := 1.000000 // buy
							if( ema12 > 0.008796 )
								ret := 0.181818
	if( Negative_Money_Flow > 192805 )
		if( MFI_High <= -53.4428 )
			if( Negative_Money_Flow <= 2.15018e+06 )
				if( Typical_Price <= 0.046752 )
					if( MFI <= 11.7636 )
						if( ema1 <= 0.031439 )
							if( Positive_Money_Flow_Sum <= 214422 )
								if( Raw_Money_Flow <= 273669 )
									ret := -0.500000
								if( Raw_Money_Flow > 273669 )
									ret := 0.622642
							if( Positive_Money_Flow_Sum > 214422 )
								if( Typical_Price <= 0.021767 )
									ret := 0.765957 // buy
								if( Typical_Price > 0.021767 )
									ret := 0.410959
						if( ema1 > 0.031439 )
							if( Negative_Money_Flow <= 482149 )
								if( Negative_Money_Flow_Sum <= 4.38448e+06 )
									ret := -0.869565 // sell
								if( Negative_Money_Flow_Sum > 4.38448e+06 )
									ret := -0.111111
							if( Negative_Money_Flow > 482149 )
								ret := 0.214286
					if( MFI > 11.7636 )
						if( ema13 <= -0.000458 )
							if( MFI_Low <= 1.64628 )
								if( Negative_Money_Flow_Sum <= 1.77983e+07 )
									ret := 0.187702
								if( Negative_Money_Flow_Sum > 1.77983e+07 )
									ret := -0.740741 // sell
							if( MFI_Low > 1.64628 )
								if( ema3 <= 0.026876 )
									ret := 0.703704 // buy
								if( ema3 > 0.026876 )
									ret := 0.384615
						if( ema13 > -0.000458 )
							if( Negative_Money_Flow <= 379764 )
								if( ema2 <= 0.026083 )
									ret := 0.209945
								if( ema2 > 0.026083 )
									ret := -0.070248
							if( Negative_Money_Flow > 379764 )
								if( Positive_Money_Flow_Sum <= 2.39803e+06 )
									ret := -0.199734
								if( Positive_Money_Flow_Sum > 2.39803e+06 )
									ret := 0.491803
				if( Typical_Price > 0.046752 )
					if( Positive_Money_Flow <= 936609 )
						if( MFI_Low <= 1.31825 )
							if( Raw_Money_Flow <= 828007 )
								if( Positive_Money_Flow_Sum <= 1.33868e+06 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 1.33868e+06 )
									ret := -0.714286 // sell
							if( Raw_Money_Flow > 828007 )
								if( Positive_Money_Flow_Sum <= 1.04411e+06 )
									ret := -0.875000 // sell
								if( Positive_Money_Flow_Sum > 1.04411e+06 )
									ret := -0.142857
						if( MFI_Low > 1.31825 )
							if( Positive_Money_Flow_Sum <= 2.20273e+06 )
								if( ema3 <= 0.049798 )
									ret := -0.130435
								if( ema3 > 0.049798 )
									ret := -0.755556 // sell
							if( Positive_Money_Flow_Sum > 2.20273e+06 )
								if( ema3 <= 0.088252 )
									ret := 0.341176
								if( ema3 > 0.088252 )
									ret := -0.104762
					if( Positive_Money_Flow > 936609 )
						ret := 1.000000 // buy
			if( Negative_Money_Flow > 2.15018e+06 )
				if( ema1 <= 0.069311 )
					if( ema12 <= -0.000322 )
						if( Negative_Money_Flow_Sum <= 2.49324e+07 )
							if( Raw_Money_Flow <= 3.82489e+06 )
								if( ema13 <= -0.001788 )
									ret := -0.769231 // sell
								if( ema13 > -0.001788 )
									ret := 0.647727
							if( Raw_Money_Flow > 3.82489e+06 )
								if( ema1 <= 0.041592 )
									ret := 0.363636
								if( ema1 > 0.041592 )
									ret := -0.760000 // sell
						if( Negative_Money_Flow_Sum > 2.49324e+07 )
							if( MFI <= 16.9018 )
								if( MFI <= 8.7197 )
									ret := 0.909091 // buy
								if( MFI > 8.7197 )
									ret := 1.000000 // buy
							if( MFI > 16.9018 )
								if( Negative_Money_Flow <= 2.4715e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 2.4715e+06 )
									ret := 0.796992 // buy
					if( ema12 > -0.000322 )
						if( Money_Flow_Ratio <= 0.297567 )
							ret := 0.727273 // buy
						if( Money_Flow_Ratio > 0.297567 )
							ret := -0.600000
				if( ema1 > 0.069311 )
					if( Negative_Money_Flow_Sum <= 1.12024e+08 )
						if( Typical_Price <= 0.128447 )
							if( Money_Flow_Ratio <= 0.218053 )
								if( tema <= 0.099537 )
									ret := 0.666667
								if( tema > 0.099537 )
									ret := 0.120370
							if( Money_Flow_Ratio > 0.218053 )
								if( ema1 <= 0.105553 )
									ret := 0.027972
								if( ema1 > 0.105553 )
									ret := 0.478448
						if( Typical_Price > 0.128447 )
							if( ema13 <= -0.005297 )
								if( tema <= 0.174415 )
									ret := -0.176471
								if( tema > 0.174415 )
									ret := 1.000000 // buy
							if( ema13 > -0.005297 )
								if( ema1 <= 0.186272 )
									ret := -0.187879
								if( ema1 > 0.186272 )
									ret := -0.721311 // sell
					if( Negative_Money_Flow_Sum > 1.12024e+08 )
						if( ema13 <= -0.013047 )
							if( Typical_Price <= 0.171578 )
								ret := 1.000000 // buy
							if( Typical_Price > 0.171578 )
								ret := -1.000000 // sell
						if( ema13 > -0.013047 )
							if( ema13 <= -0.005367 )
								if( Money_Flow_Ratio <= 0.19323 )
									ret := 0.714286 // buy
								if( Money_Flow_Ratio > 0.19323 )
									ret := 0.977778 // buy
							if( ema13 > -0.005367 )
								if( tema <= 0.184221 )
									ret := 0.000000
								if( tema > 0.184221 )
									ret := 0.916667 // buy
		if( MFI_High > -53.4428 )
			if( MFI_High <= -10.911 )
				if( Typical_Price <= 0.227559 )
					if( Raw_Money_Flow <= 2.53327e+06 )
						if( ema12 <= 0.000703 )
							if( ema3 <= 0.041434 )
								if( MFI_Low <= 15.3766 )
									ret := 0.165517
								if( MFI_Low > 15.3766 )
									ret := 0.017011
							if( ema3 > 0.041434 )
								if( MFI_High <= -30.5178 )
									ret := -0.087853
								if( MFI_High > -30.5178 )
									ret := 0.031707
						if( ema12 > 0.000703 )
							if( Negative_Money_Flow_Sum <= 1.84941e+07 )
								if( Negative_Money_Flow_Sum <= 1.08208e+07 )
									ret := 0.209524
								if( Negative_Money_Flow_Sum > 1.08208e+07 )
									ret := 0.635036
							if( Negative_Money_Flow_Sum > 1.84941e+07 )
								if( MFI <= 54.4951 )
									ret := 0.296296
								if( MFI > 54.4951 )
									ret := -0.500000
					if( Raw_Money_Flow > 2.53327e+06 )
						if( tema <= 0.129929 )
							if( MFI <= 66.9418 )
								if( Negative_Money_Flow_Sum <= 2.86168e+07 )
									ret := 0.072042
								if( Negative_Money_Flow_Sum > 2.86168e+07 )
									ret := 0.263016
							if( MFI > 66.9418 )
								if( MFI_Low <= 48.7332 )
									ret := -0.333333
								if( MFI_Low > 48.7332 )
									ret := 0.550000
						if( tema > 0.129929 )
							if( Negative_Money_Flow <= 1.03194e+07 )
								if( Money_Flow_Ratio <= 0.407877 )
									ret := -0.641509
								if( Money_Flow_Ratio > 0.407877 )
									ret := -0.058901
							if( Negative_Money_Flow > 1.03194e+07 )
								if( tema <= 0.140698 )
									ret := -0.145631
								if( tema > 0.140698 )
									ret := 0.299445
				if( Typical_Price > 0.227559 )
					if( MFI <= 54.8405 )
						if( ema3 <= 0.230412 )
							ret := 0.000000
						if( ema3 > 0.230412 )
							if( tema <= 0.236574 )
								if( Raw_Money_Flow <= 8.1002e+06 )
									ret := -0.363636
								if( Raw_Money_Flow > 8.1002e+06 )
									ret := -0.898734 // sell
							if( tema > 0.236574 )
								if( Typical_Price <= 0.24006 )
									ret := 0.150000
								if( Typical_Price > 0.24006 )
									ret := -0.769231 // sell
					if( MFI > 54.8405 )
						if( ema12 <= 0.002503 )
							ret := 0.666667
						if( ema12 > 0.002503 )
							if( MFI_High <= -16.9009 )
								ret := -0.750000 // sell
							if( MFI_High > -16.9009 )
								ret := -0.166667
			if( MFI_High > -10.911 )
				if( Typical_Price <= 0.02169 )
					if( Negative_Money_Flow <= 255570 )
						if( Positive_Money_Flow_Sum <= 6.21329e+06 )
							if( MFI_Low <= 52.8892 )
								if( Money_Flow_Ratio <= 2.31706 )
									ret := -0.454545
								if( Money_Flow_Ratio > 2.31706 )
									ret := 0.000000
							if( MFI_Low > 52.8892 )
								if( ema13 <= 0.000282 )
									ret := 0.285714
								if( ema13 > 0.000282 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 6.21329e+06 )
							ret := -0.692308
					if( Negative_Money_Flow > 255570 )
						if( Positive_Money_Flow_Sum <= 7.54952e+06 )
							if( MFI_Low <= 59.1383 )
								if( Positive_Money_Flow_Sum <= 6.52061e+06 )
									ret := 0.488095
								if( Positive_Money_Flow_Sum > 6.52061e+06 )
									ret := 0.925000 // buy
							if( MFI_Low > 59.1383 )
								if( ema12 <= 0.000171 )
									ret := -0.181818
								if( ema12 > 0.000171 )
									ret := 0.312500
						if( Positive_Money_Flow_Sum > 7.54952e+06 )
							if( Raw_Money_Flow <= 777977 )
								if( tema <= 0.018175 )
									ret := 0.088889
								if( tema > 0.018175 )
									ret := -0.769231 // sell
							if( Raw_Money_Flow > 777977 )
								if( MFI <= 73.3517 )
									ret := 0.350000
								if( MFI > 73.3517 )
									ret := 0.961538 // buy
				if( Typical_Price > 0.02169 )
					if( MFI <= 72.6515 )
						if( Negative_Money_Flow_Sum <= 8.08672e+06 )
							if( Negative_Money_Flow <= 843035 )
								if( Positive_Money_Flow_Sum <= 7.43432e+06 )
									ret := 0.293515
								if( Positive_Money_Flow_Sum > 7.43432e+06 )
									ret := -0.014599
							if( Negative_Money_Flow > 843035 )
								if( Raw_Money_Flow <= 855784 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 855784 )
									ret := -0.100000
						if( Negative_Money_Flow_Sum > 8.08672e+06 )
							if( Typical_Price <= 0.171309 )
								if( ema2 <= 0.082055 )
									ret := 0.111111
								if( ema2 > 0.082055 )
									ret := 0.588850
							if( Typical_Price > 0.171309 )
								if( ema3 <= 0.208258 )
									ret := -0.725000 // sell
								if( ema3 > 0.208258 )
									ret := 0.567568
					if( MFI > 72.6515 )
						if( MFI <= 73.3759 )
							if( MFI_Low <= 53.1528 )
								if( Negative_Money_Flow_Sum <= 5.62097e+07 )
									ret := -0.018868
								if( Negative_Money_Flow_Sum > 5.62097e+07 )
									ret := 1.000000 // buy
							if( MFI_Low > 53.1528 )
								if( Money_Flow_Ratio <= 2.75032 )
									ret := -0.865385 // sell
								if( Money_Flow_Ratio > 2.75032 )
									ret := -0.277778
						if( MFI > 73.3759 )
							if( Positive_Money_Flow_Sum <= 5.24232e+07 )
								if( Typical_Price <= 0.022312 )
									ret := -0.666667
								if( Typical_Price > 0.022312 )
									ret := 0.183692
							if( Positive_Money_Flow_Sum > 5.24232e+07 )
								if( ema12 <= 0.002906 )
									ret := -0.516667
								if( ema12 > 0.002906 )
									ret := 0.216867
	
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
float op_operation = decision_tree_0_VETUSDT_30Min_f5920ef4(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, ema2, tema, ema12, ema3, ema1, ema13)

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


